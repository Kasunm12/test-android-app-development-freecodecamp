package com.hasthiya.testapplication;

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

//        TextView textHello = findViewById(R.id.textMessage);
//        textHello.setText("Hello");

//        EditText edtTxtName = findViewById(R.id.editTxtName);
//        edtTxtName.getText().toString();
    }

    public void onBtnClick (View view){

        TextView textHello = findViewById(R.id.textMessage);
        EditText edtTxtName = findViewById(R.id.editTxtName);
//        edtTxtName.getText().toString();
//        textHello.setText("Hello");
        textHello.setText(edtTxtName.getText().toString());
    }
}