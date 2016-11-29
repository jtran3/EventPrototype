package edu.ggc.john.eventprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.Manifest;
import android.content.pm.PackageManager;


import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;
import android.widget.Toast;


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

        yourButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                sendSMSMessage();
                startActivity(new Intent(CreateEvent3.this, MainActivity.class));
            }
        });
    }

    protected void sendSMSMessage()
    {
        eventMessage = (EditText) findViewById(R.id.editText6);

        for (int i = 0; i < AndroidListViewActivity.phoneNumbersSelected.size(); i++) {
            phoneNo = AndroidListViewActivity.phoneNumbersSelected.get(i);
            message = eventMessage.getText().toString();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNo, null, message, null, null);

            if (ContextCompat.checkSelfPermission(this,
                    Manifest.permission.SEND_SMS)
                    != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                        Manifest.permission.SEND_SMS)) {
                } else {
                    ActivityCompat.requestPermissions(this,
                            new String[]{Manifest.permission.SEND_SMS},
                            MY_PERMISSIONS_REQUEST_SEND_SMS);
                }
            }
        }
    }

}
