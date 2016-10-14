package edu.ggc.john.eventprototype;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jtran_000 on 10/13/2016.
 */
public class RegisiterRequest extends StringRequest
{
    private static final String REGISITER_REQUEST_URL = "http://eventgo.net16.net/Regisiter.php";
    private Map<String, String > params;

    public RegisiterRequest(String name, String username, String password, String email, int phonenumber, Response.Listener<String> listener)
    {
        super(Method.POST, REGISITER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("password", password);
        params.put("email", email);
        params.put("phonenumber", phonenumber + "");
    }
    public Map<String,String>getParams()
    {
        return params;
    }
}
