package com.example.sondeshp.sharedpref;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtName,edtSurname;
    Button btnOk;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName=findViewById(R.id.edtName);
        edtSurname=findViewById(R.id.edtSurname);
        sharedPreferences=getSharedPreferences("Store",MODE_PRIVATE);
        editor=sharedPreferences.edit();

    }

    public void ok(View view) {
        s1=edtName.getText().toString();
                s2=edtSurname.getText().toString();
                editor.putString("Name",s1);
                editor.putString("Surname",s2);
                editor.commit();

        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);

        Toast.makeText(MainActivity.this, edtName.getText()+""+edtSurname.getText(), Toast.LENGTH_SHORT).show();
    }
}
