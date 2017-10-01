package com.cv4j.ocrdemo.app;

import android.support.v7.app.AppCompatActivity;

import com.safframework.injectview.Injector;

/**
 * Created by tony on 2017/10/2.
 */

public class BaseActivity extends AppCompatActivity {

    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        Injector.injectInto(this);
    }
}
