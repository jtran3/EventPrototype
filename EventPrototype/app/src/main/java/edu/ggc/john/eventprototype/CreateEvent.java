package edu.ggc.john.eventprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;


public class CreateEvent extends AppCompatActivity
{

    EditText txtEventName;
    EditText txtEventDate;
    EditText txtStartTime;
    EditText txtEndTime;
    List<Event> Events = new ArrayList<Event>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        Button yourButton = (Button) findViewById(R.id.button4);

        yourButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(CreateEvent.this, AndroidListViewActivity.class));
            }
        });

        Button yourButton2 = (Button) findViewById(R.id.button7);

        yourButton2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(CreateEvent.this, MainActivity.class));
            }
        });


    }

    public void getData(View v){
        txtEventName = (EditText) findViewById(R.id.eventName);
        String eventName = txtEventName.getText().toString();

        txtEventDate = (EditText) findViewById(R.id.eventDate);
        String eventDate = txtEventDate.getText().toString();

        txtStartTime = (EditText) findViewById(R.id.startTime);
        String startTime = txtStartTime.getText().toString();

        txtEndTime = (EditText) findViewById(R.id.endTime);
        String endTime = txtEndTime.getText().toString();

        Event newEvent1 = new Event(eventName, eventDate, startTime, endTime);

    }
}
