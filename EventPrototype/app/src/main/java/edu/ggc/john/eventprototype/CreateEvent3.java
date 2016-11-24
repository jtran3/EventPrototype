package edu.ggc.john.eventprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateEvent3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event3);
        Button yourButton = (Button) findViewById(R.id.button6);

        yourButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                startActivity(new Intent(CreateEvent3.this, MainActivity.class));
            }
        });
    }
}
