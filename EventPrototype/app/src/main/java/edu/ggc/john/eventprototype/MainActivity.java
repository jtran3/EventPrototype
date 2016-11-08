package edu.ggc.john.eventprototype;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button yourButton = (Button) findViewById(R.id.button2);

        yourButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, CreateEvent.class));
            }
        });

        Button yourButton2 = (Button) findViewById(R.id.button3);

        yourButton2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MyEvents.class));
            }
        });

        Button yourButton3 = (Button) findViewById(R.id.bManageEvents);

        yourButton3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, ContactsContract.Contacts.class));
            }
        });

    }
}
