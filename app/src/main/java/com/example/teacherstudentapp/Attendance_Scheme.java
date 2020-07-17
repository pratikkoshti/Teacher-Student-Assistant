package com.example.teacherstudentapp;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class Attendance_Scheme extends AppCompatActivity {
    FirebaseStorage firebaseStorage;
    StorageReference storageReference,ref1,ref2,ref3,ref4,ref5,ref6;
    Button download1,download2,download3,download4,download5,download6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance__scheme);

        download1 = findViewById(R.id.download_1);
        download2 = findViewById(R.id.download_2);
        download3 = findViewById(R.id.download_3);
        download4 = findViewById(R.id.download_4);
        download5 = findViewById(R.id.download_5);
        download6 = findViewById(R.id.download_6);

        storageReference = firebaseStorage.getInstance().getReference();


        download1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download1();
            }
        });

        download2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download2();
            }
        });

        download3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download3();
            }
        });

        download4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download4();
            }
        });

        download5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download5();
            }
        });

        download6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download6();
            }
        });
    }

    public void download1(){

        ref1 = storageReference.child("uploads").child("Scheme").child("I-Scheme-First-Semester-Computer-EngineeringCO.pdf");

        ref1.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadFile(Attendance_Scheme.this,"1st Sem",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        });
    }

    public void download2(){

        ref2 = storageReference.child("uploads").child("Scheme").child("I-Scheme Second Semester-Computer Group[CO,IF,CM,CW].pdf");
        ref2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadFile(Attendance_Scheme.this,"2nd Sem",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        });
    }

    public void download3(){

        ref3 = storageReference.child("uploads").child("Scheme").child("3rdSemComputerGroupCurriculumCOCMCW_230520181307.pdf");
        ref3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadFile(Attendance_Scheme.this,"3rd Sem",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        });
    }

    public void download4(){

        ref4 = storageReference.child("uploads").child("Scheme").child("4th Sem Scheme (CO).pdf");
        ref4.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadFile(Attendance_Scheme.this,"4th Sem",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        });
    }

    public void download5(){

        ref5 = storageReference.child("uploads").child("Scheme").child("Five Semester Scheme (CO, CM, CW)).pdf");
        ref5.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadFile(Attendance_Scheme.this,"5th Sem",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        });
    }

    public void download6(){

        ref6 = storageReference.child("uploads").child("Scheme").child("Sixth-Semester-Complete-Syllabus-COCMCW.pdf");
        ref6.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadFile(Attendance_Scheme.this,"6th Sem",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        });
    }

    public long downloadFile(Context context, String fileName, String fileExtension, String destinationDirectory, String url) {


        DownloadManager downloadmanager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        return downloadmanager.enqueue(request);
    }
}
