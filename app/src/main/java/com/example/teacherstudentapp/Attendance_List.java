package com.example.teacherstudentapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Attendance_List extends AppCompatActivity {

    DatabaseReference databaseReference;
    CheckBox r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21,r22,r23,r24,r25,r26,r27,r28,r29,r30;
    Button submit;
    FirebaseAuth firebaseAuth;
    ArrayList<String> result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance__list);

        firebaseAuth = FirebaseAuth.getInstance();

        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);
        r6 = findViewById(R.id.r6);
        r7 = findViewById(R.id.r7);
        r8 = findViewById(R.id.r8);
        r9 = findViewById(R.id.r9);
        r10 = findViewById(R.id.r10);
        r11 = findViewById(R.id.r11);
        r12 = findViewById(R.id.r12);
        r13 = findViewById(R.id.r13);
        r14 = findViewById(R.id.r14);
        r15 = findViewById(R.id.r15);
        r16 = findViewById(R.id.r16);
        r17 = findViewById(R.id.r17);
        r18 = findViewById(R.id.r18);
        r19 = findViewById(R.id.r19);
        r20 = findViewById(R.id.r20);
        r21 = findViewById(R.id.r21);
        r22 = findViewById(R.id.r22);
        r23 = findViewById(R.id.r23);
        r24 = findViewById(R.id.r24);
        r25 = findViewById(R.id.r25);
        r26 = findViewById(R.id.r26);
        r27 = findViewById(R.id.r27);
        r28 = findViewById(R.id.r28);
        r29 = findViewById(R.id.r29);
        r30 = findViewById(R.id.r30);
        submit = findViewById(R.id.btn_submit);
        result = new ArrayList<>();

        databaseReference = FirebaseDatabase.getInstance().getReference();
        FirebaseUser user = firebaseAuth.getCurrentUser();

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked())
                    result.add("01");
                else
                    result.remove("1");
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r2.isChecked())
                    result.add("02");
                else
                    result.remove("2");
            }
        });


        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r3.isChecked())
                    result.add("03");
                else
                    result.remove("3");
            }
        });


        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r4.isChecked())
                    result.add("04");
                else
                    result.remove("4");
            }
        });


        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r5.isChecked())
                    result.add("05");
                else
                    result.remove("5");
            }
        });


        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r6.isChecked())
                    result.add("06");
                else
                    result.remove("6");
            }
        });


        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r7.isChecked())
                    result.add("07");
                else
                    result.remove("7");
            }
        });


        r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r8.isChecked())
                    result.add("08");
                else
                    result.remove("8");
            }
        });


        r9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r9.isChecked())
                    result.add("09");
                else
                    result.remove("9");
            }
        });


        r10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r10.isChecked())
                    result.add("10");
                else
                    result.remove("10");
            }
        });


        r11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r11.isChecked())
                    result.add("11");
                else
                    result.remove("11");
            }
        });


        r12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r12.isChecked())
                    result.add("12");
                else
                    result.remove("12");
            }
        });


        r13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r13.isChecked())
                    result.add("13");
                else
                    result.remove("13");
            }
        });


        r14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r14.isChecked())
                    result.add("14");
                else
                    result.remove("14");
            }
        });


        r15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r15.isChecked())
                    result.add("15");
                else
                    result.remove("15");
            }
        });


        r16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r16.isChecked())
                    result.add("16");
                else
                    result.remove("16");
            }
        });


        r17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r17.isChecked())
                    result.add("17");
                else
                    result.remove("17");
            }
        });


        r18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r18.isChecked())
                    result.add("18");
                else
                    result.remove("18");
            }
        });


        r19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r19.isChecked())
                    result.add("19");

            }
        });


        r20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r20.isChecked())
                    result.add("20");

            }
        });


        r21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r21.isChecked())
                    result.add("21");

            }
        });


        r22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked())
                    result.add("22");

            }
        });


        r23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked())
                    result.add("23");

            }
        });


        r24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r24.isChecked())
                    result.add("24");

            }
        });


        r25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r25.isChecked())
                    result.add("25");

            }
        });


        r26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r26.isChecked())
                    result.add("26");

            }
        });

        r27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r27.isChecked())
                    result.add("27");

            }
        });


        r28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r28.isChecked())
                    result.add("28");

            }
        });


        r29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r29.isChecked())
                    result.add("29");

            }
        });


        r30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r30.isChecked())
                    result.add("30");


            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s : result)
                stringBuilder.append(s).append("\n");

                Toast.makeText(Attendance_List.this,stringBuilder.toString(),Toast.LENGTH_SHORT).show();

                saveStudentInformation();
            }
        });

    }

    public void saveStudentInformation(){

        Bundle b = getIntent().getExtras();
        String value = "",date=""; // or other values
        if(b != null) {
            value = b.getString("sub");
            date = b.getString("date") ;}
        FirebaseUser user = firebaseAuth.getCurrentUser();
        Attendance_Information attendance_information1 = new Attendance_Information(result);

        databaseReference.child("users").child(value).child(date).setValue(attendance_information1);

//    databaseReference.child("users").child(user.getUid())
  }


}