package com.example.administrator.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.StrictMode;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private UserTABLE objUserTABLE;
    private OrderTABLE objOrderTABLE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objUserTABLE = new UserTABLE(this);
        objOrderTABLE = new OrderTABLE(this);
        //tester
        testAddValue();

        //synJsontoSQLite
        synJSontoSQLite();

    }//onCreate
    private  void synJSontoSQLite() {
        //setUp Policy
        if (Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy myPolicy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(myPolicy);
            }
        InputStream objInputStream = null;
        String strJSon = "";
        try {
            HttpClient objHttpClient = new DefaultHttpClient();
            HttpPost objHttpPost = new HttpPost();
        }   catch (Exception e){
            Log.d("Restaurant", "ERROR from InputStream =="+e.toString());
        }
    }
    private void testAddValue(){
        objUserTABLE.addValueToUser("User","Password","Officer");
        objOrderTABLE.addValueOrder("Officer","Date","Food", 4);

    }

}
