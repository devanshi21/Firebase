package com.example.devanshipatel.firebase_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.example.devanshipatel.firebase_test.Calling;
public class MainActivity extends AppCompatActivity {
   String id="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calling c=new Calling();
        c.onTokenRefresh();
    }
}
