package edu.ggc.john.eventprototype;

import com.android.volley.Request;
import com.android.volley.Response;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jtran_000 on 11/1/2016.
 */

public class CreateEventRequest
{

    private static final String EVENT_REQUEST_URL = "http://eventgo.net16.net/Event.php";
    private Map<String, String > params;

    public CreateEventRequest(String name, String username, String password, String email, Response.Listener<String> listener)
    {
       // super(Request.Method.POST, EVENT_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("password", password);
        params.put("email", email);
    }
    public Map<String,String>getParams()
    {
        return params;
    }



}
