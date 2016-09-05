package com.example.inflgl.bildliker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button buttonname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Login();
    }

    public void Login() {
        buttonname = (Button) findViewById(R.id.btnLogin) ;
        buttonname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.print("kikikik");
            }
        });
    }
}
