package com.nhc.cuongnguyen.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_tong(View v)
    {
        EditText txt_a = (EditText) findViewById(R.id.so_a);
        EditText txt_b = (EditText) findViewById(R.id.so_b);

        int a = Integer.parseInt(txt_a.getText().toString());
        int b = Integer.parseInt(txt_b.getText().toString());

        TextView kq = (TextView) findViewById(R.id.txt_kq);
        kq.setText((a+b)+"");
    }
}
