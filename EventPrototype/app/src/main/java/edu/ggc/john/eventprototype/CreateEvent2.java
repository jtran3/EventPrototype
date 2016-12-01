package edu.ggc.john.eventprototype;

import android.content.Intent;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class CreateEvent2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event2);



        Button yourButton = (Button) findViewById(R.id.button5);

        yourButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(CreateEvent2.this, CreateEvent3.class));
            }
        });

        Button yourButton2 = (Button) findViewById(R.id.button8);

        yourButton2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(CreateEvent2.this, CreateEvent.class));
            }
        });

    }
}
