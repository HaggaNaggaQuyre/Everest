package com.example.everest;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    EditText PenisText;
    Button SchwanzButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PenisText = (EditText) findViewById(R.layout.editText);
        SchwanzButton = (Button) findViewById(R.layout.button);

        SchwanzButton.setOnClickListener(this);




    }
}
