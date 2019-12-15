package com.example.sampleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sampleapplication.Model.User;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btPlayButton;
    EditText etNameInput;
    TextView tvGreetings;
    User mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btPlayButton = (Button)findViewById(R.id.activity_main_bt_enter);
        etNameInput = (EditText) findViewById(R.id.activity_main_et_name);
        tvGreetings = (TextView)findViewById(R.id.activity_main_tv_greetings);
        btPlayButton.setEnabled(false);
        mUser = new User();
        etNameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                btPlayButton.setEnabled(s.toString().length()!=0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        btPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUser.setFirstName(etNameInput.getText().toString());
                Intent gameActivity = new Intent(MainActivity.this, GameActivity.class);
                startActivity(gameActivity);
            }
        });
    }

}
