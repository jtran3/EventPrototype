package edu.ggc.john.eventprototype;

import android.provider.ContactsContract;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Contacts extends AppCompatActivity {

    // ... existing code ...
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // ...
        setupCursorAdapter();
    }

    // Create simple cursor adapter to connect the cursor dataset we load with a ListView
    private void setupCursorAdapter() {
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
    }
}
