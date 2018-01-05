package com.ahmad.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickMe (View view)
    {
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);

        Toast.makeText(MainActivity.this,"Hi there,  " + nameEditText.getText().toString() +"!" , Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}