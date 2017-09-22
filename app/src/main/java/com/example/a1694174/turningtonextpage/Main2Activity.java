package com.example.a1694174.turningtonextpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private ListView listView;
    Button button2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = (Button) findViewById(R.id.button2);

        Intent i = getIntent(); // Retrieve from android device
        String msg = i.getStringExtra("SEND");
        String msgNull = i.getStringExtra("NotExist");

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

        listView = (ListView) findViewById(R.id.listView);
    }
    public void sendEmail(View view)
    {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);

    }


}
