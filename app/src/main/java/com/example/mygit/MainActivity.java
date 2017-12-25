package com.example.mygit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * feature1
     * @param x
     * @param y
     * @return
     */
    public int feature1_sum(int x,int y){
        return x+y;
    }

}
