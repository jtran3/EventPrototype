package edu.ggc.john.eventprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText eName = (EditText) findViewById(R.id.eName);
        final EditText eUsername = (EditText) findViewById(R.id.eUsername);
        final EditText ePassword = (EditText) findViewById(R.id.ePassword);
        final EditText eEmail = (EditText) findViewById(R.id.eEmail);
        final EditText ePhonenumber = (EditText) findViewById(R.id.ePhonenumber);
        final Button bRegisiter = (Button) findViewById(R.id.bRegisiter);
    }
}
