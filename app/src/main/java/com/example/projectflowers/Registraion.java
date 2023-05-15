package com.example.projectflowers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class Registraion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registraion);
    }
//    protected void onClick() {
//        EditText num = (EditText) findViewById(R.id.number_input);          //получение данных с поля, не пригодных для использования
//        number = Integer.parseInt(num.getText().toString());
//        if (number < 5 && number > 15) {
//            Toast toast = Toast.makeText(context, text, duration);
//            toast.show();
//        }
//    }
}