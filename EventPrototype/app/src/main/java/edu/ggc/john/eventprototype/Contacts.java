package edu.ggc.john.eventprototype;

import android.view.Menu;

/**
 * Created by Aaron on 11/8/2016.
 */

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class Contacts extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

    }

    @Override
<<<<<<< HEAD
    public boolean onCreateOptionsMenu(Menu menu)
    {
=======
    public boolean onCreateOptionsMenu(Menu menu) {
>>>>>>> 4d4280221af57cff359b471c607d88ecdc2ac8d9
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
