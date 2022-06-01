package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtHello=findViewById(R.id.textView);
        txtHello.setText("hello");
    }
    public void onBtnClick(View v)
    {
        TextView txtHello=findViewById(R.id.textView);
        EditText edtTxtName=findViewById(R.id.editTextTextPersonName);
        txtHello.setText("Hi"+edtTxtName.getText().toString());
    }
}