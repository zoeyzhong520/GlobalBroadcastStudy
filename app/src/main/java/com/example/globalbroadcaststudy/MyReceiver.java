package com.example.globalbroadcaststudy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

// 定义一个继承BroadcastReceiver的MyReceiver类，实现onReceive方法
// onReceive会在匹配成功后调用，本例简单展示即可
public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "响应了自身设置的广播", Toast.LENGTH_SHORT).show();
    }
}
