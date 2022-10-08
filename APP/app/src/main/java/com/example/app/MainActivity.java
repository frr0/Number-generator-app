package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int max = 100;

    public static final String EXTRA_MESSAGE = "com.example.Number-generator-app.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
//        Do something in response to button
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//        TextView editText = (TextView) findViewById(R.id.textView4);
//        String message = editText.getText().toString();
        TextView txt = (TextView) findViewById(R.id.t1);
        String text = txt.getText().toString();
        max = Integer.parseInt(text);
        Random rand = new Random();
        int num = rand.nextInt(max);
        String n = Integer.toString(num);
        TextView textView = (TextView)findViewById(R.id.textView4);
        textView.setText(n);
        view.invalidate();  // for refreshment
    }
}