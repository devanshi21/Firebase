package com.example.devanshipatel.firebase_test;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static android.content.ContentValues.TAG;

/**
 * Created by Devanshi Patel on 3/26/2018.
 */
public class Calling extends FirebaseInstanceIdService {
  public void onTokenRefresh() {
      String id = FirebaseInstanceId.getInstance().getToken();
      Log.d(TAG, "Registeration id: " + id);
  }
}