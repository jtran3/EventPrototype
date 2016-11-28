package edu.ggc.john.eventprototype;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;

/**
 * Created by jtran_000 on 11/27/2016.
 */

public class TextReceiver extends BroadcastReceiver {

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
        }

}
