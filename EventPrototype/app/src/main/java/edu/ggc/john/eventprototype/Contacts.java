package edu.ggc.john.eventprototype;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
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

        ContentResolver resolver = getContentResolver();
        Cursor cursor = resolver.query(ContactsContract.Contacts.CONTENT_URI,null, null, null, null);

        while (cursor.moveToNext())
        {
            String id = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
            String name = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));

            resolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null,
                    ContactsContract.CommonDataKinds.Phone.CONTACT_ID + " = ?", new String[]{ id }, null);
            

        }

        //ListView Listphone = (ListView)findViewById(R.id.listPhone);

    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
