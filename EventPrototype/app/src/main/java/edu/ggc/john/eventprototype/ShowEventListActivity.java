package edu.ggc.john.eventprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ShowEventListActivity extends AppCompatActivity {
    ArrayList<Event> eventList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_event_list);

        eventList = new ArrayList<Event>();
        // Get the reference of ListViewAnimals
        final ListView eventList=(ListView)findViewById(R.id.listViewEvents);


        getEventNames();
        // Create The Adapter with passing ArrayList as 3rd parameter
        ArrayAdapter<Event> arrayAdapter =
                new ArrayAdapter<Event>(this,android.R.layout.simple_list_item_1, (List<Event>) eventList);
        // Set The Adapter
        eventList.setAdapter(arrayAdapter);

        // register onClickListener to handle click events on each item
        eventList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            // argument position gives the index of item which is clicked
            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3)
            {

                String selectedEvent=((List<String>) eventList).get(position);
                Toast.makeText(getApplicationContext(), "Event Selected : "+selectedEvent,   Toast.LENGTH_LONG).show();
            }
        });


    }

    void getEventNames()
    {
        Event event1 = new Event("Birthday", "September 21", "10:00am", "10:45am");
        eventList.add(event1);
    }
}
