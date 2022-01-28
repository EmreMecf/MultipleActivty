package com.example.multipleactivity;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String UserName;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =findViewById(R.id.editText);
        UserName="";

    }
    public void change(View view){
        UserName=editText.getText().toString();
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        intent.putExtra("userInput",UserName);
        startActivity(intent);

    }
}