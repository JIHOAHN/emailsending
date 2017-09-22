package com.example.a1694174.turningtonextpage;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText myMessage;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myMessage = (EditText) findViewById(R.id.messageText);
        button = (Button) findViewById(R.id.button);
    }

    public void GotMilk(View view)
    {
       Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("SEND", myMessage.getText().toString());
        startActivity(intent);

        Intent intent1 = new Intent(this, Main2Activity.class);
        intent1.putExtra("SEND", button.getText().toString());
        startActivity(intent1);
    }
        }
