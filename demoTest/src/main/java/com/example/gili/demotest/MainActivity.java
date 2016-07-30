package com.example.gili.demotest;

import android.app.Activity;
import android.os.Bundle;

import com.example.gili.simplegraphlibrary.XYchart;
import com.example.gili.simplegraphlibrary.Point;

public class MainActivity extends Activity  {

    private XYchart g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        g = (XYchart)findViewById(R.id.graph);

        float[] x = {5067, 2846};
        float[] y = {10000, 3047};
        g.setData(x,y);

        //g.clearData();
        g.addValue(-5300, 1400);

        float[] ax = {7326, 1624};
        float[] ay = {8273, 6253};
        g.addData(ax, ay);
        //g.removeValues(x,y);

    }

}
