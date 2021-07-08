package com.example.myapplication.Services;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class Check_Permission_Service  {

    public boolean checkPermission(Context context, Activity activity, String permission, int requestCode){
        if(ContextCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_DENIED) {
            setPermission(context,activity, permission, requestCode);
            return false;
        }
        return true;
    }

    public void setPermission(Context context, Activity activity, String permission, int requestCode){
        ActivityCompat.requestPermissions(activity, new String[]{permission}, requestCode);
    }

}
