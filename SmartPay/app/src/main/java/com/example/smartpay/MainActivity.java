package com.example.smartpay;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
DatePicker dpicker;
Button btnext;
Spinner spn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn=(Spinner)findViewById(R.id.spina);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R. layout.simple_spinner_item);
        adapter.setDropDownViewResource();
        spn.setAdapter(adapter);
        spn.setOnItemSelectedListener(this);
        dpicker =(DatePicker)findViewById(R.id.dp);
        dpicker.init(2019,03,04,null);
        btnext=(Button)findViewById(R.id.btn);
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              displayNextAlert();
            }
        });
    }
    private void displayNextAlert(){
        EditText nameInput=(EditText)findViewById(R.id.name);
        DatePicker dobInput=(DatePicker)findViewById(R.id.dp);
        EditText emailInput=(EditText)findViewById(R.id.ed2);
        String strname=nameInput.getText().toString();
        String strdob=dobInput.getDayOfMonth()+"/"+dobInput.getMonth()+"/"+dobInput.getYear();
        String stremail=emailInput.getText().toString();
        new AlertDialog.Builder(this).setTitle("details Entered").setMessage("details Entered:\n"+strname+"\n"+strdob+"\n"+stremail)
                .setNeutralButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String text=parent.getItemAtPosition(position).toString():
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
