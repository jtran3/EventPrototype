package edu.ggc.john.eventprototype;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MyEvents extends AppCompatActivity
{

    Event[] events = {
            new Event("Birthday", "11/8/2016", "8:00am", "8:00pm"),
            new Event("Birthday 2", "11/8/2016", "8:00am", "8:00pm"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_events);
        ListView myList = (ListView) findViewById(R.id.listView1);
        myList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        myList.setItemsCanFocus(false);

        ArrayAdapter<Event> adapter = new ArrayAdapter<Event>(this,
                android.R.layout.simple_list_item_1, events);
        myList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        myList.setAdapter(adapter);
    }
}
