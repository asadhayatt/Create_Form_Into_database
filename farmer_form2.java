package com.hayat.authentication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.EmptyStackException;

public class farmer_form2 extends AppCompatActivity {

    EditText t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_form2);
    }


    public void add_LOAN_detail(View view){

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);

        String id , name, cnic , loan;
        id      =   t1.getText().toString().trim();
        name    =   t2.getText().toString().trim();
        cnic    =   t3.getText().toString().trim();
        loan    =   t4.getText().toString().trim().trim();

        farmer_LOAN_data_holder obj = new farmer_LOAN_data_holder(name,cnic,loan);

        FirebaseDatabase    db      =   FirebaseDatabase.getInstance();
        DatabaseReference   node    =   db.getReference("students");
        if(id.isEmpty() && name.isEmpty() && cnic.isEmpty() && loan.isEmpty()){

            Toast.makeText(this, "fields are empty...", Toast.LENGTH_SHORT).show();
        }
        else
        {
            node.child(id).setValue(obj);

            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");

            Toast.makeText(this, "data added to database...", Toast.LENGTH_SHORT).show();
        }
       

    }

}