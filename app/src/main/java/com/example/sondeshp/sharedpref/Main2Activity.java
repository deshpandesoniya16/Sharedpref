package com.example.sondeshp.sharedpref;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtName,txtSurname;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtName=findViewById(R.id.txtName);
        txtSurname=findViewById(R.id.txtSurname);

        sharedPreferences=getSharedPreferences("Store",MODE_PRIVATE);
        editor=sharedPreferences.edit();


    }

    public void get(View view) {

        String s=sharedPreferences.getString("Name","null");
        String s1=sharedPreferences.getString("Surname","null");
        txtName.setText(s);
        txtSurname.setText(s1);


    }
}
