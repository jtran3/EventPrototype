package edu.ggc.john.eventprototype;


import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jtran_000 on 11/3/2016.
 */

public class EventRequest extends StringRequest
    {
        private static final String EVENT_REQUEST_URL = "http://eventgo.net16.net/Event.php";
        private Map<String, String > params;


        public EventRequest(String name, String username, String date, String starttime, String endtime, Response.Listener<String> listener)
        {
            super(Method.POST, EVENT_REQUEST_URL, listener, null);
            params = new HashMap<>();
            params.put("name", name);
            params.put("username", username);
            params.put("date", date);
            params.put("start Time", starttime);
            params.put("end time", endtime);

        }
        public Map<String,String>getParams()
        {
            return params;
        }
    }

