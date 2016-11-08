package edu.ggc.john.eventprototype;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MyEvents extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_events);


        ListView listView1 = (ListView) findViewById(R.id.listView1);

        Event[] events = {
                new Event("Birthday", "11/8/2016", "8:00am", "8:00pm"),
        };

        ArrayAdapter<Event> adapter = new ArrayAdapter<Event>(this,
                android.R.layout.simple_list_item_1, events);

        listView1.setAdapter(adapter);
    }
}
