package com.example.teht1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textField;
    private EditText editField;
    private TextWatcher watcher = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textField = findViewById(R.id.textView);
        textField.setText("Moikka maailma.");
        editField = findViewById((R.id.ptext));

        watcher = new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textField.setText(editField.getText().toString());

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (editField.getText().toString().length() == 0) {
                    textField.setText("Moikka maailma.");
                }
            }

        };
        editField.addTextChangedListener(watcher);

    }
    public void console(View v){
        String text = editField.getText().toString();
        textField.setText(text);

    }
}