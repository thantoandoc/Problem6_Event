package com.team.ymmy.problem6_event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    private  EditText edita, editb;
    private TextView txt_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edita.getText() + "");
                editb = (EditText) findViewById(R.id.editb);
                int b = Integer.parseInt(editb.getText() + "");
                txt_result = (TextView) findViewById(R.id.kq);
                txt_result.setText(String.valueOf(a + b));
            }
        });
        btn.setOnClickListener(this);
    }

    public void tong2so() {
        System.out.print("tong2so");
        edita = (EditText) findViewById(R.id.edita);
        int a = Integer.parseInt(edita.getText() + "");
        editb = (EditText) findViewById(R.id.editb);
        int b = Integer.parseInt(editb.getText() + "");
        txt_result = (TextView) findViewById(R.id.kq);
        txt_result.setText(String.valueOf(a + b));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                tong2so();
                break;
        }
    }
}

