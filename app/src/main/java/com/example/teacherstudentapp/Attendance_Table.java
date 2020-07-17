package com.example.teacherstudentapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Window;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Attendance_Table extends AppCompatActivity {
    DatabaseReference databaseReference;
     String num;
    FirebaseAuth firebaseAuth;

    public void setValue(String n)
    {
        num +=n;
    }

    public String getValue()
    {
        return num;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_attendance__table);
        firebaseAuth = FirebaseAuth.getInstance();

        Bundle b = getIntent().getExtras();
        String value = "";
        String date = "";// or other values
        if(b != null) {
            value = b.getString("sub");
            date = b.getString("date");
        }


        databaseReference = FirebaseDatabase.getInstance().getReference().child("users").child(value).child(date).child("roll");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name="";
                int j=0;
                if(dataSnapshot.getChildrenCount()==0)
                {
                    Toast.makeText(Attendance_Table.this,"No Data found on that day",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Attendance_Table.this,See_Attendance.class);
                    startActivity(i);
                    return;
                }
                else {
                    for (j = 0; j < dataSnapshot.getChildrenCount(); j++) {
                        name = dataSnapshot.child("" + j).getValue().toString();
                        setValue(name + ".");
                    }

                    Toast.makeText(Attendance_Table.this, name, Toast.LENGTH_SHORT).show();

                    setValue(name);
                    Log.i("tag", num);
                    init();

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



    }
    public void init() {

        TableLayout stk = (TableLayout) findViewById(R.id.table_main);
        TableRow tbrow0 = new TableRow(this);
        TextView tv0 = new TextView(this);
        tv0.setText("Sn ");
        tv0.setTextColor(Color.BLUE);
        tv0.setTextSize(24);

        tbrow0.addView(tv0);
        TextView tv1 = new TextView(this);
        tv1.setText(" Rollno ");
        tv1.setTextColor(Color.BLUE);
        tv1.setTextSize(24);

        tbrow0.addView(tv1);
        TextView tv2 = new TextView(this);
        tv2.setText(" Status ");
        tv2.setTextSize(24);
        tv2.setTextColor(Color.BLUE);
        tbrow0.addView(tv2);



        setValue(".");



        Log.i("tag",num);
//        num = getValue();
        stk.addView(tbrow0);
        for (int i = 1; i <= 30; i++) {


            TableRow tbrow = new TableRow(this);
            TextView t1v = new TextView(this);
            t1v.setText("" + i);
            t1v.setTextSize(18);
            t1v.setTextColor(Color.BLACK);
            t1v.setGravity(Gravity.CENTER);
            tbrow.addView(t1v);
            TextView t2v = new TextView(this);
            t2v.setText("" + i);
            t2v.setTextColor(Color.BLACK);
            t2v.setGravity(Gravity.CENTER);
            t2v.setTextSize(18);
            tbrow.addView(t2v);

            TextView t3v = new TextView(this);
            String t="";
            if(i<10)
            {
                t="0"+i;
            }
            else
                t=""+i;
            if(num.contains(t))
            {
                t3v.setText("Present");
            }
            else
                t3v.setText("Absent");
//            t3v.setText("" + i);
            t3v.setTextColor(Color.BLACK);
            t3v.setGravity(Gravity.CENTER);
            t3v.setTextSize(18);
            tbrow.addView(t3v);


                        stk.addView(tbrow);
        }

    }
}