package com.example.testmyproject;

import static com.example.testmyproject.NDKTool.loadLibrary;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button button, buttonJni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button2);
        buttonJni = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            Snackbar.make(button, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show();
        });




        ActionBar actionBar = new ActionBar() {
            @Override
            public int getNavigationMode() {
                return 0;
            }

            @Override
            public void setNavigationMode(int mode) {

            }
       };
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD | ActionBar.NABIGATION_MODE_LIST |
                ActionBar.NAVIGATION_MODE_TABS);

        loadLibrary();
        buttonJni.setOnClickListener(view -> {
            getWords();
        });

    }

    public void getWords() {
        NDKTool ndkTool = new NDKTool();
        String jString = ndkTool.callNative("12345678");
        Toast.makeText(getApplicationContext(), "return string is "+jString, Toast.LENGTH_LONG);
        System.out.println("ndkTool.so return string is: "+jString);
    }

}