package edu.ggc.john.eventprototype;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.Manifest;
import android.content.pm.PackageManager;


import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;
import android.widget.Toast;

import java.util.ArrayList;


public class CreateEvent3 extends AppCompatActivity {
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;
    String phoneNo;
    String message;
    EditText eventMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event3);
        Button yourButton = (Button) findViewById(R.id.button6);
        eventMessage = (EditText) findViewById(R.id.editText6);
        message = eventMessage.getText().toString();

        yourButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                sendSMS2(v);
          //      startActivity(new Intent(CreateEvent3.this, MainActivity.class));
            }
        });
    }

    private void sendSMS(String phoneNumber, String message) {
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message, null, null);
    }



    public void sendSMS2(View view) {

        for (int i = 0; i<AndroidListViewActivity.phoneNumbersSelected.size(); i++) {
            String phoneNumber = AndroidListViewActivity.phoneNumbersSelected.get(i);
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + phoneNumber));
            intent.putExtra("sms_body", message);
            startActivity(intent);
        }
    }

}
