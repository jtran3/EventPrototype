package edu.ggc.john.eventprototype;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

import static com.android.volley.VolleyLog.TAG;

/**
 * Created by jtran_000 on 11/27/2016.
 */

public class TextReceiver extends BroadcastReceiver
{

    public TextReceiver()
    {}
        @Override
        public void onReceive (Context context, Intent
        intent)
        {
            // Get the data (SMS data) bound to intent
            Bundle bundle = intent.getExtras();

            SmsMessage[] msgs = null;

            String str = "";
            if (bundle != null) {
                // Retrieve the SMS Messages received
                Object[] pdus = (Object[]) bundle.get("pdus");
                msgs = new SmsMessage[pdus.length];

                // For every SMS message received
                for (int i=0; i < msgs.length; i++) {
                    // Convert Object array
                    msgs[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
                    // Sender's phone number
                    str += "SMS from " + msgs[i].getOriginatingAddress() + " : ";
                    // Fetch the text message
                    str += msgs[i].getMessageBody().toString();
                    // Newline 🙂
                    str += "\n";
                }

                // Display the entire SMS Message
                Log.d(TAG, str);
            }

        }
}
