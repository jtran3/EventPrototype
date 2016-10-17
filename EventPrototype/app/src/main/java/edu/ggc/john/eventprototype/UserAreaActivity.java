package edu.ggc.john.eventprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText eUsername = (EditText) findViewById(R.id.eUsername);
        final TextView eWelcomeMessage = (TextView) findViewById(R.id.eWelcomeMsg);
        final Button eNext = (Button)findViewById(R.id.eNext);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");

        String message = name + "welcome to EventGo";
        eWelcomeMessage.setText(message);
        eUsername.setText(username);
    }
}
