package hasie.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Hasmik Ghazaryan on 6/5/2015.
 */
public class ListUsers {

    public List<User> getUsersList()
    {
        Connection conn;
        Statement stmt = null;
        ResultSet rs;
        List<User> usersList = new ArrayList<User>();
        conn = SingletonDBConnection.getInstance().getConnInst();

        String strSQL = "SELECT UserId, UserName, Gender, UserLocation  FROM tblusers";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(strSQL);
            while(rs.next()) {
                User objUser = new User();
                objUser.setUserId(rs.getString("UserId"));
                objUser.setUserName(rs.getString("UserName"));
                objUser.setGender(rs.getString("Gender"));
                objUser.setLocation(rs.getString("UserLocation"));
                usersList.add(objUser);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(conn != null)
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return usersList;
    }


}
