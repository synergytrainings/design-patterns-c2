package com.synisys.training.patterns.creational.abstractFactory.api.impl.post;

import com.synisys.training.patterns.creational.abstractFactory.api.impl.MPAOApi;
import com.synisys.training.patterns.creational.abstractFactory.domain.MPAORequest;
import com.synisys.training.patterns.creational.abstractFactory.domain.MPAOResponse;
import com.synisys.training.patterns.creational.abstractFactory.urlSettings.BadRequestException;
import org.apache.log4j.Logger;
import org.json.JSONObject;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static com.synisys.training.patterns.creational.abstractFactory.urlSettings.ApiConstants.*;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public class MPAOApiPost extends MPAOApi<MPAORequest, MPAOResponse> implements APIPost<MPAORequest, MPAOResponse> {

    
    private static final Logger LOG = Logger.getLogger(MPAOApiPost.class);

    public MPAOApiPost() {
        initUrlSettings();
    }

    @Override
    public void initUrlSettings(){
        super.initUrlSettings();
        urlSettings.setApiUrl(MPAO_ACTION_URI);
        urlSettings.setApiToken(MPAO_TOKEN);
        urlSettings.setApiName("MPAO");
    }

    @Override
    public MPAORequest createRequest() {
        return new MPAORequest("A999999", "2014-01-01", "2014-12-31", urlSettings.getApiToken());
    }

    @Override
    public String getUrl() {
        String url = this.urlSettings.getApiUrl();

        LOG.info("API Url: " + url.toString());

        return url.toString();
    }

    public String getURLParameters(MPAORequest request){
        StringBuilder url = new StringBuilder();

        url.append(MPAO_REQUEST_KEY)
                .append("=")
                .append(this.urlSettings.getApiToken())
                .append("&")
                .append(MPAO_REQUEST_ID)
                .append("=")
                .append(request.getNationalIdCard())
                .append("&")
                .append(MPAO_REQUEST_START_DATE)
                .append("=")
                .append(request.getStartDate())
                .append("&")
                .append(MPAO_REQUEST_END_DATE)
                .append("=")
                .append(request.getEndDate());

        return url.toString();
    }

    @Override
    public MPAOResponse createResponse(String result) {
        MPAOResponse response = new MPAOResponse();

        JSONObject jsonObject = new JSONObject(result);
        //response.setId(jsonObject.getInt(DNR_RESPONSE_ID));

        JSONObject jsonObjectLocal = jsonObject.getJSONObject(MPAO_RESPONSE_LOCAL);
        response.setLocalAmount(BigDecimal.valueOf(jsonObjectLocal.getDouble(MPAO_RESPONSE_AMOUNT)));

        JSONObject jsonObjectForeign = jsonObject.getJSONObject(MPAO_RESPONSE_FOREIGN);
        response.setForeignAmount(BigDecimal.valueOf(jsonObjectForeign.getDouble(MPAO_RESPONSE_AMOUNT)));

        return response;
    }

    @Override
    public String createConnectionWithPost(MPAORequest request) {
        StringBuilder result = new StringBuilder();
        try {
            String path = getUrl().replaceAll(" ", "%20");
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept", "application/json");

            // Send post request
            conn.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
            wr.writeBytes(getURLParameters(request));
            wr.flush();
            wr.close();

            if (conn.getResponseCode() != 200) {
                throw new BadRequestException(conn.getResponseCode(), conn.getResponseMessage());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            while ((output = br.readLine()) != null) {
                result.append(output);
            }
            conn.disconnect();
        }
        catch (MalformedURLException e) {
            LOG.error("MalformedURLException: " + e);
        }
        catch (BadRequestException e) {
            LOG.error("API exception: " + e.getMessage() + " statusCode: " + e.getStatusCode());
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            LOG.info("Response: " + result.toString());
        }
        return result.toString();
    }
}
