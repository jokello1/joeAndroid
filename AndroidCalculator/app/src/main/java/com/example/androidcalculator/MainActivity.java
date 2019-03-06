package com.example.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText op1,op2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         op1=(EditText)findViewById(R.id.num1);
         op2=(EditText)findViewById(R.id.num2);

        Button btn1=(Button)findViewById(R.id.add);
        Button btn2=(Button)findViewById(R.id.sub);

       
       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               TextView txtresult=(TextView)findViewById(R.id.result);
               int strop1=Integer.parseInt(op1.getText().toString());
               int strop2=Integer.parseInt(op2.getText().toString());
              int sum=strop1+strop2;
               Toast.makeText(MainActivity.this, "sum is", Toast.LENGTH_SHORT).show();
           }
       });

    }
}
