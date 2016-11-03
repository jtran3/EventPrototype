package edu.ggc.john.eventprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyEvents extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_events);

        Button btnShowEvent =(Button)findViewById(R.id.buttonShowEvent);


        // Set OnClick Listener on  button  and start AnimalListActivity when clicked on Button
        btnShowEvent.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for AnimalListActivity and Start The Activity
                Intent intentAnimalList=new Intent(getApplicationContext(),Event_List.class);
                startActivity(intentAnimalList);
            }
        });
    }
}
