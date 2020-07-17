package com.example.teacherstudentapp;

import java.util.ArrayList;
import java.util.List;

public class Attendance_Information {

    public List<String> roll;

    public Attendance_Information(ArrayList r){
            roll = new ArrayList<String>();

            for (int i = 0; i < r.size(); i++) {
                roll.add(r.get(i)+"");
            }

    }

}
