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

//    public void onBtnClick (View view){
//
//        TextView textHello = findViewById(R.id.textMessage);
//        EditText edtTxtName = findViewById(R.id.editTxtName);
////        edtTxtName.getText().toString();
////        textHello.setText("Hello");
////        textHello.setText(edtTxtName.getText().toString());
//
//        textHello.setText("Hello" +edtTxtName.getText().toString());
//    }

    public void onRegisterBtnClick (View view){

        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        EditText edtTxtLastName = findViewById(R.id.edtTxtLastName);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);

        txtFirstName.setText("First Name : " +edtTxtFirstName.getText().toString());
        txtLastName.setText("First Name : " +edtTxtLastName.getText().toString());
        txtEmail.setText("First Name : " +edtTxtEmail.getText().toString());

    }
}