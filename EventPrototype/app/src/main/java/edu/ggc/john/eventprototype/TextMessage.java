package edu.ggc.john.eventprototype;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Toast;

import java.util.ArrayList;
//redid the code to see if it works.
public class TextMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_message);

        SmsManager smsManager = SmsManager.getDefault();

        String phoneNumber = "9999999999";
        String smsBody = "Some piece of really long text, longer than 140*n characters!";

        String SMS_SENT = "SMS_SENT";
        String SMS_DELIVERED = "SMS_DELIVERED";

        PendingIntent sentPendingIntent = PendingIntent.getBroadcast(this, 0, new Intent(SMS_SENT), 0);
        PendingIntent deliveredPendingIntent = PendingIntent.getBroadcast(this, 0, new Intent(SMS_DELIVERED), 0);

        ArrayList<String> smsBodyParts = smsManager.divideMessage(smsBody);
        ArrayList<PendingIntent> sentPendingIntents = new ArrayList<PendingIntent>();
        ArrayList<PendingIntent> deliveredPendingIntents = new ArrayList<PendingIntent>();

        for (int i = 0; i < smsBodyParts.size(); i++)
        {
            sentPendingIntents.add(sentPendingIntent);
            deliveredPendingIntents.add(deliveredPendingIntent);

            // is used when SMS has been sent
            registerReceiver(new BroadcastReceiver()
            {
                @Override
                public void onReceive(Context context, Intent intent)
                {
                    switch (getResultCode())
                    {
                        case Activity.RESULT_OK:
                            Toast.makeText(context, "SMS sent successfully", Toast.LENGTH_SHORT).show();
                            break;
                        case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
                            Toast.makeText(context, "Generic failure cause", Toast.LENGTH_SHORT).show();
                            break;
                        case SmsManager.RESULT_ERROR_NO_SERVICE:
                            Toast.makeText(context, "Service is currently unavailable", Toast.LENGTH_SHORT).show();
                            break;
                        case SmsManager.RESULT_ERROR_NULL_PDU:
                            Toast.makeText(context, "No pdu provided", Toast.LENGTH_SHORT).show();
                            break;
                        case SmsManager.RESULT_ERROR_RADIO_OFF:
                            Toast.makeText(context, "Radio was explicitly turned off", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            }, new IntentFilter(SMS_SENT));
            // For when the SMS has been delivered
            registerReceiver(new BroadcastReceiver() {
                @Override
                public void onReceive(Context context, Intent intent) {
                    switch (getResultCode()) {
                        case Activity.RESULT_OK:
                            Toast.makeText(getBaseContext(), "SMS delivered", Toast.LENGTH_SHORT).show();
                            break;
                        case Activity.RESULT_CANCELED:
                            Toast.makeText(getBaseContext(), "SMS not delivered", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            }, new IntentFilter(SMS_DELIVERED));

// Send a text based SMS
            smsManager.sendMultipartTextMessage(phoneNumber, null, smsBodyParts, sentPendingIntents, deliveredPendingIntents);
        }
    }
}
