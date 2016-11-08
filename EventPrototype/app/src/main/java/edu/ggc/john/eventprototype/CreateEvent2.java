package edu.ggc.john.eventprototype;

import android.content.Intent;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CreateEvent2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event2);

   //     Cursor phones = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null,null,null, null);
  //      while (phones.moveToNext())
  //      {
   //         String name=phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
  //          String phoneNumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
   //         Toast.makeText(getApplicationContext(),name, Toast.LENGTH_LONG).show();
//
    //    }
   //     phones.close();

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
