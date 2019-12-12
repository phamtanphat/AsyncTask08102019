package com.example.asynctask08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // 1 : Param - tham số truyền vào doInBackground
    // 2 : Progress - tham số dùng cập dữ liệu khi doIn xử lý
    // 3 : Result - tham sau khi doIn xử lý xong trả về cho onPost

}
