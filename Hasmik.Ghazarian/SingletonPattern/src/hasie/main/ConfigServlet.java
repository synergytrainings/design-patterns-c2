package hasie.main;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
/**
 * Author: Hasmik Ghazaryan on 6/5/2015.
 */
public class ConfigServlet extends HttpServlet {
    @Override
    public void init() throws ServletException
    {
        super.init();
        SingletonDBConnection.getInstance();
    }
}
