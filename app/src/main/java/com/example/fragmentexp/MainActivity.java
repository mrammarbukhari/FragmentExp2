package com.example.fragmentexp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.fragmentexp.Frags.Contact;
import com.example.fragmentexp.Frags.Home;
import com.example.fragmentexp.Frags.Info;
import com.example.fragmentexp.Model.SendData;

public class MainActivity extends AppCompatActivity implements SendData {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void HomeClick(View view) {
        //FragmentManager
        //FragmentTransaction
//        FragmentManager myManager = getSupportFragmentManager();
//        FragmentTransaction myTrans = myManager.beginTransaction();
//        Home obj = new Home();
//        myTrans.replace(R.id.frameLayout1,obj);
//        myTrans.commit();
    }

    public void InfoClick(View view) {
//        FragmentManager myManager = getSupportFragmentManager();
//        FragmentTransaction myTrans = myManager.beginTransaction();
//        Info obj = new Info();
//        myTrans.replace(R.id.frameLayout1,obj);
//        myTrans.commit();
    }

    public void ContactClick(View view) {
//        FragmentManager myManager = getSupportFragmentManager();
//        FragmentTransaction myTrans = myManager.beginTransaction();
//        Contact obj = new Contact();
//        myTrans.replace(R.id.frameLayout1,obj);
//        myTrans.commit();
    }

    @Override
    public void SetText(String s)
    {
         Info f = (Info) getSupportFragmentManager().findFragmentById(R.id.FragInfo);
         f.setText(s);
    }
}