package com.example.hp.myhomework;

import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.text.Editable;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button bn1 = (Button)findViewById(R.id.bn1);
        Button bn2 = (Button)findViewById(R.id.bn2);
        Button bn3 = (Button)findViewById(R.id.bn3);
        Button bn4 = (Button)findViewById(R.id.bn4);
        bn1.setOnClickListener(new MyClickListener());
        bn2.setOnClickListener(new MyClickListener());
        bn3.setOnClickListener(new MyClickListener());
        bn4.setOnClickListener(new MyClickListener());
    }
    class MyClickListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            if (v.getId()==R.id.bn1){
                EditText txt1 = (EditText) findViewById(R.id.m1);
                txt1.setText("bn1被点击了！");
            }
            else if(v.getId()==R.id.bn2) {
                EditText txt3 = (EditText) findViewById(R.id.m1);
                txt3.setText("bn2被点击了！");
            }
            else if(v.getId()==R.id.bn3) {
                EditText txt3 = (EditText) findViewById(R.id.m1);
                txt3.setText("bn3被点击了！");
            }
            else if (v.getId()==R.id.bn4)
            {
            EditText txt4 = (EditText)findViewById(R.id.m1);
            txt4.setText("bn4被点击了！");
            }
        }
    }
}
