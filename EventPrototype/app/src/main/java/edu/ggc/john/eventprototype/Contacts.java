package edu.ggc.john.eventprototype;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.widget.AdapterView;


public class Contacts extends AppCompatActivity
{

    public static final int CONTACT_LOADER_ID = 78;
    public static final String DISPLAY_NAME_PRIMARY = "";
    public static final String DISPLAY_NAME = "";
    public static final String _ID = "";
    public static final String LOOKUP_KEY = "";
    private SimpleCursorAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        setupCursorAdapter();
        ListView contactlist = (ListView) findViewById(R.id.contactlist);
        contactlist.setAdapter(adapter);
        setupCursorAdapter();
        // Initialize the loader with a special ID and the defined callbacks from above
        getSupportLoaderManager().initLoader(CONTACT_LOADER_ID,
                new Bundle(), contactsLoader);
    }

    // Create simple cursor adapter to connect the cursor dataset we load with a ListView
    private void setupCursorAdapter()
    {
        // Column data from cursor to bind views from
        String[] uiBindFrom = new String[]{ContactsContract.Contacts.DISPLAY_NAME,
                ContactsContract.Contacts.HAS_PHONE_NUMBER};
        // View IDs which will have the respective column data inserted
        int[] uiBindTo = { R.id.eName, R.id.eNumber };
        // Create the simple cursor adapter to use for our list
        // specifying the template to inflate (item_contact),
        adapter = new SimpleCursorAdapter(
                this, R.layout.contacts_list_item,
                null, uiBindFrom, uiBindTo,
                0);
    }

    // Defines the asynchronous callback for the contacts data loader
    private LoaderManager.LoaderCallbacks<Cursor> contactsLoader =
            new LoaderManager.LoaderCallbacks<Cursor>()
            {
                // Create and return the actual cursor loader for the contacts data
                @Override
                public Loader<Cursor> onCreateLoader(int id, Bundle args)
                {
                    // Define the columns to retrieve
                    String[] projectionFields = new String[]
                            {
                            ContactsContract.Contacts.DISPLAY_NAME,
                            ContactsContract.Contacts.HAS_PHONE_NUMBER
                            };
                    // Construct the loader
                    CursorLoader cursorLoader = new CursorLoader(Contacts.this,
                            ContactsContract.Contacts.CONTENT_URI, // URI
                            projectionFields, // projection fields
                            null, // the selection criteria
                            null, // the selection args
                            null // the sort order
                    );
                    // Return the loader for use
                    return cursorLoader;
                }

                // When the system finishes retrieving the Cursor through the CursorLoader,
                // a call to the onLoadFinished() method takes place.
                @Override
                public void onLoadFinished(Loader<Cursor> loader, Cursor cursor)
                {
                    // The swapCursor() method assigns the new Cursor to the adapter
                    adapter.swapCursor(cursor);
                }

                // This method is triggered when the loader is being reset
                // and the loader data is no longer available. Called if the data
                // in the provider changes and the Cursor becomes stale.
                @Override
                public void onLoaderReset(Loader<Cursor> loader)
                {
                    // Clear the Cursor we were using with another call to the swapCursor()
                    adapter.swapCursor(null);
                }
            };


}

