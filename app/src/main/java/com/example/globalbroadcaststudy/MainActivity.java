package com.example.globalbroadcaststudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*发出全局广播*/
    public void sendGlobalBroadcast(View view) {
        // 设置一个Button当作广播信号的发送方
        // 广播也仍然是使用Intent来发送的，当按下Button，就会通过Intent发动一条广播
        // 注意这里用到了sendBroadcast()方法，这将发出一个全局广播，所有广播接收器都能收到这条广播
        Intent intent = new Intent("com.example.globalbroadcaststudy.MY_TEST");
        sendBroadcast(intent);
    }
}