package edu.ggc.john.eventprototype;

import android.view.Menu;

/**
 * Created by Aaron on 11/8/2016.
 */

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class Contacts extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        ListView Listphone = (ListView)findViewById(R.id.listPhone);

    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
