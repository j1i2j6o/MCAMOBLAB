package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    String s1,s2;
    Button b1,b2,b3,b4,b5;
    Integer i1,i2,s3;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        e3=(EditText) findViewById(R.id.e3);

        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);


        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                i1=Integer.parseInt(s1);
                i2=Integer.parseInt(s2);
                s3=i1+i2;
                e3.setText(Integer.toString(s3));
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                i1=Integer.parseInt(s1);
                i2=Integer.parseInt(s2);
                s3=i1-i2;
                e3.setText(Integer.toString(s3));
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                i1=Integer.parseInt(s1);
                i2=Integer.parseInt(s2);
                s3=i1*i2;
                e3.setText(Integer.toString(s3));
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                i1=Integer.parseInt(s1);
                i2=Integer.parseInt(s2);
                s3=i1/i2;
                e3.setText(Integer.toString(s3));
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
              e1.setText(" ");
              e2.setText(" ");
              e3.setText(" ");
            }
        });
    }
}