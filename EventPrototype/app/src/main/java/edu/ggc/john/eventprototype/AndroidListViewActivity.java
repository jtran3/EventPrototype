package edu.ggc.john.eventprototype;


import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;

import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.json.JSONObject;

import java.util.ArrayList;


public class AndroidListViewActivity extends AppCompatActivity {

    ListView myList;

    Button getChoice;

    ArrayList<String> contacts = new ArrayList<>();
    ArrayList<String> phoneNumbers = new ArrayList<>();
    static ArrayList<String> phoneNumbersSelected = new ArrayList<String>();
    StringBuffer output;

    public void addContacts(){

        //to store name-number pair
        contacts = new ArrayList<String>();
        phoneNumbers = new ArrayList<String>();

        try {
            Cursor phones = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);

            while (phones.moveToNext()) {
                output = new StringBuffer();
                String name = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
                String phoneNumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                output.append(name);
                output.append("\n" + phoneNumber);
                contacts.add(output.toString());
                phoneNumbers.add(phoneNumber);
             //   Log.e("Contact list with name", " "+contacts);
            }
            phones.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * Called when the activity is first created.
     */

    @Override

    public void onCreate(Bundle savedInstanceState) {

        addContacts();

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_android_list_view);

        myList = (ListView) findViewById(R.id.list);

        getChoice = (Button) findViewById(R.id.getchoice);


        ArrayAdapter<String> adapter

                = new ArrayAdapter<String>(this,

                android.R.layout.simple_list_item_multiple_choice,

                contacts);


        myList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        myList.setAdapter(adapter);


        getChoice.setOnClickListener(new Button.OnClickListener() {


            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub


                String selected = "";



                int cntChoice = myList.getCount();

                SparseBooleanArray sparseBooleanArray = myList.getCheckedItemPositions();

                for (int i = 0; i < cntChoice; i++) {

                    if (sparseBooleanArray.get(i)) {

                        selected += myList.getItemAtPosition(i).toString() + "\n";
                        myList.getItemAtPosition(i);
                        phoneNumbersSelected.add(phoneNumbers.get(i));




                    }

                }

                startActivity(new Intent(AndroidListViewActivity.this, CreateEvent3.class));


                Toast.makeText(AndroidListViewActivity.this,

                        selected,

                        Toast.LENGTH_LONG).show();

            }
        });
    }

    public static ArrayList<String> returnPhoneNumbers() {
        return phoneNumbersSelected;
    }
}

