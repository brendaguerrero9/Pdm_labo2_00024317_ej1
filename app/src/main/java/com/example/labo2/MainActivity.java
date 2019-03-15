package com.example.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button boton;
    private EditText user;
    private EditText pass;
    private TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=findViewById(R.id.btn1);
        t1=findViewById(R.id.tw1);
        user=findViewById(R.id.text1);
        pass=findViewById(R.id.text2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),user.getText(),Toast.LENGTH_LONG).show();

            }

        });

        boton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),pass.getText(),Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }



}
