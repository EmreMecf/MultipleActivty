package com.example.multipleactivity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView3);
        Intent intent=getIntent();
        String userName=intent.getStringExtra("userInput");
        textView.setText(userName);


    }

    public void change1(View view){
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }
}