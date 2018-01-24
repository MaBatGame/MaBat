package com.example.amitg.mabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    private EditText username, password;
    private CardView signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        signInButton = (CardView)findViewById(R.id.sign_in_button);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO connect server.
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.equals("amit") && pass.equals("king")){
                    Toast.makeText(getApplicationContext(), "Boby Boten!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), username.getText() + ", " + password.getText(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
