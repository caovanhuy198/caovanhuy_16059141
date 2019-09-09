package com.example.student.caovanhuy_16059141;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed_tk, ed_mk;
    CheckBox cb;
    Button bt_dn,bt_t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_tk = (EditText)findViewById(R.id.editText_tk);
        ed_mk = (EditText)findViewById(R.id.editText_mk);
        bt_dn = (Button)findViewById(R.id.button_dn);
        cb =(CheckBox)findViewById(R.id.checkBox);
        bt_dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb.isChecked()){
                    Toast.makeText(getApplicationContext()," chào mừng bạn đăng nhập vào hệ thống, Thông tin của bạn đã được lưu",Toast.LENGTH_SHORT).show();

            }
            else{
                    Toast.makeText(getApplicationContext()," chào mừng bạn đăng nhập vào hệ thống, Thông tin của bạn Không được lưu",Toast.LENGTH_SHORT).show();
                }

            }
        });
        bt_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              final AlertDialog.Builder alter= new AlertDialog.Builder(MainActivity.this);
              alter.setTitle("thong bao");
              alter.setMessage("ban co muon thoat");
              alter.setPositiveButton("co", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {
                      finish();
                  }
              });
              alter.setNegativeButton("khong", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {

                  }
              });
              AlertDialog dialog = alter.create();
              dialog.show();

            }
        });
    }

}
