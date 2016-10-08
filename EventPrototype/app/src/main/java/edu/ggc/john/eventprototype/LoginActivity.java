package edu.ggc.john.eventprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText eUsername = (EditText) findViewById(R.id.eUsername);
        final EditText ePassword = (EditText) findViewById(R.id.ePassword);
        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final TextView regisiterLink = (TextView) findViewById(R.id.tvRegisiterHere);

        regisiterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regisiterIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(regisiterIntent);
            }
        });
    }


}
