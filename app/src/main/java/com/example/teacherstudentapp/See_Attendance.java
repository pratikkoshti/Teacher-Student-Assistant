package com.example.teacherstudentapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

import java.text.DateFormat;
import java.util.Calendar;

public class See_Attendance extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{
    DatabaseReference databaseReference;
    Button mgt,pwp,mad,eti,wpb;
    TextView date;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see__attendance);

        firebaseAuth = FirebaseAuth.getInstance();

        Button btn_date = findViewById(R.id.calendar);
        mgt = findViewById(R.id.btn_mgt);
        pwp = findViewById(R.id.btn_pwp);
        mad = findViewById(R.id.btn_mad);
        eti = findViewById(R.id.btn_eti);
        wpb = findViewById(R.id.btn_wpb);
        date = findViewById(R.id.txt_date);


        btn_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialogFragment = new DatePickerFragment();
                dialogFragment.show(getSupportFragmentManager(),"date picker");
            }
        });


       
        checkDate();
    }

    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, i);
        c.set(Calendar.MONTH, i1);
        c.set(Calendar.DAY_OF_MONTH, i2);
        String currentDateString = DateFormat.getDateInstance().format(c.getTime());
        TextView textView = findViewById(R.id.txt_date);
        textView.setText(currentDateString);
    }

    public void checkDate(){
        mgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str= date.getText().toString().trim();
                if (str.equals(" ") || str.equals("") || str.trim().isEmpty()) {
                    Toast.makeText(See_Attendance.this, "Please select date", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Intent i = new Intent(See_Attendance.this,Attendance_Table.class);
                    Bundle b = new Bundle();
                    b.putString("sub", "MGT");
                    b.putString("date",date.getText().toString());//Your id
                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });

        pwp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str= date.getText().toString().trim();
                if (str.equals(" ") || str.equals("") || str.trim().isEmpty()) {
                    Toast.makeText(See_Attendance.this, "Please select date", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Intent i = new Intent(See_Attendance.this,Attendance_Table.class);
                    Bundle b = new Bundle();
                    b.putString("sub", "PWP"); //
                    b.putString("date",date.getText().toString());//Your id
// Your id
                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });

        mad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str= date.getText().toString().trim();
                if (str.equals(" ") || str.equals("") || str.trim().isEmpty()) {
                    Toast.makeText(See_Attendance.this, "Please select date", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Intent i = new Intent(See_Attendance.this,Attendance_Table.class);
                    Bundle b = new Bundle();
                    b.putString("sub", "MAD"); //Your id
                    b.putString("date",date.getText().toString());//Your id

                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });

        eti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str= date.getText().toString().trim();
                if (str.equals(" ") || str.equals("") || str.trim().isEmpty()) {
                    Toast.makeText(See_Attendance.this, "Please select date", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Intent i = new Intent(See_Attendance.this,Attendance_Table.class);
                    Bundle b = new Bundle();
                    b.putString("sub", "ETI"); //Your id
                    b.putString("date",date.getText().toString());//Your id
                    i.putExtras(b); //Put your id to your next Intent

                    startActivity(i);
                }
            }
        });

        wpb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str= date.getText().toString().trim();
                if (str.equals(" ") || str.equals("") || str.trim().isEmpty()) {
                    Toast.makeText(See_Attendance.this, "Please select date", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Intent i = new Intent(See_Attendance.this,Attendance_Table.class);
                    Bundle b = new Bundle();
                    b.putString("sub", "WPB"); //Your id
                    b.putString("date",date.getText().toString());//Your id

                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });


    }
}
