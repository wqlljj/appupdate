package com.example.cloud.appupdaterclient;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = ((TextView) findViewById(R.id.tv));
//        textView.setText(getString());
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File file = Environment.getExternalStorageDirectory();
                String path = file.getAbsolutePath();
                String newApp=path+ File.separator+"newapk.apk";
                String oldApp=path+ File.separator+"oldapk.apk";
                String patchPath=path+ File.separator+"apk.patch";

                Log.d(TAG, "onClick: newApp = "+newApp  );
                Log.d(TAG, "onClick: oldApp = "+oldApp +"  "+new File(oldApp).exists());
                Log.d(TAG, "onClick: patchPath = "+patchPath +"  "+new File(patchPath).exists() );
                try {
                    Log.e(TAG, "onClick: "+getString() );
                }catch (Throwable e){

                    Log.d(TAG, "onClick: "+e.getMessage());

                }
//                catch (Exception e){
//                    e.printStackTrace();
//                }
//                appPatch(newApp,oldApp,patchPath);
            }
        });
    }
    public static native void appPatch(String newApp,String oldApp,String patchPath);

    public static native String getString();

    static {
        System.loadLibrary("native-lib");
    }
}
