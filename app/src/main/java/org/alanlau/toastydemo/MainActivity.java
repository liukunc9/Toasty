package org.alanlau.toastydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import org.alanlau.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
    Button btnTestSuccess;
    Button btnTestError;
    Button btnTestWarning;
    Button btnTestInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //设置 Toasty 显示位置
        Toasty.Config.getInstance()
                .setGravity(Gravity.CENTER);

        init();
        bindClick();
    }

    private void init(){
        btnTestSuccess=findViewById(R.id.btnTestSuccess);
        btnTestError=findViewById(R.id.btnTestError);
        btnTestWarning=findViewById(R.id.btnTestWarning);
        btnTestInfo=findViewById(R.id.btnTestInfo);
    }

    private void bindClick(){
        btnTestSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(MainActivity.this,"测试成功").show();
            }
        });

        btnTestError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(MainActivity.this,"测试失败").show();
            }
        });

        btnTestWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.warning(MainActivity.this,"测试警告").show();
            }
        });

        btnTestInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.info(MainActivity.this,"测试提示").show();
            }
        });
    }
}
