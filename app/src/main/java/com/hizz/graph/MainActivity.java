package com.hizz.graph;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    LineChart lineChart;
    SeekBar seek1, seek2, seek3, seek4, seek5;
    int resolution = 250;
    ArrayList<Entry> yAxis;
    LineData lineData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lineChart = findViewById(R.id.chart);

        seek1 = findViewById(R.id.seekBar1);
        seek2 = findViewById(R.id.seekBar2);
        seek3 = findViewById(R.id.seekBar3);
        seek4 = findViewById(R.id.seekBar4);
        seek5 = findViewById(R.id.seekBar5);

        seek1.setMax(resolution);
        seek2.setMax(resolution);
        seek3.setMax(resolution);
        seek4.setMax(resolution);
        seek5.setMax(resolution);


        seek1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                setValues();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seek2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                setValues();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seek3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                setValues();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seek4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                setValues();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seek5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                setValues();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        yAxis = new ArrayList<>();

        yAxis.clear();
        yAxis.add(new Entry(0, 0));
        yAxis.add(new Entry(1, .05f));
        yAxis.add(new Entry(2, -.04f));
        yAxis.add(new Entry(3, .06f));
        yAxis.add(new Entry(4, .03f));
        yAxis.add(new Entry(5, .02f));
        yAxis.add(new Entry(6, .05f));

        LineDataSet lineDataSet2 = new LineDataSet(yAxis, "Graph");

        lineDataSet2.setDrawCircles(true);
        lineDataSet2.setColor(Color.RED);
        lineDataSet2.setCircleColor(getResources().getColor(R.color.VIOLET));
        lineDataSet2.setCircleRadius(2f);

        lineDataSet2.setMode(LineDataSet.Mode.CUBIC_BEZIER);

        lineData = new LineData(lineDataSet2);
        lineData.setDrawValues(true);
        lineChart.setData(lineData);
        lineChart.getDescription().setText("Гафік");
        lineChart.setAutoScaleMinMaxEnabled(true);

        seek1.setProgress(resolution/2);
        seek2.setProgress(resolution/2);
        seek3.setProgress(resolution/2);
        seek4.setProgress(resolution/2);
        seek5.setProgress(resolution/2);

    }

    private void setValues(){
        float s1 = ((float)seek1.getProgress()-resolution/2)/1000;
        float s2 = ((float)seek2.getProgress()-resolution/2)/1000;
        float s3 = ((float)seek3.getProgress()-resolution/2)/1000;
        float s4 = ((float)seek4.getProgress()-resolution/2)/1000;
        float s5 = ((float)seek5.getProgress()-resolution/2)/1000;


        yAxis.clear();
        yAxis.add(new Entry(0, 0));
        yAxis.add(new Entry(1, s1));
        yAxis.add(new Entry(2, s2));
        yAxis.add(new Entry(3, s3));
        yAxis.add(new Entry(4, s4));
        yAxis.add(new Entry(5, s5));
        yAxis.add(new Entry(6, 0));

        lineChart.invalidate();

        //Toast.makeText(MainActivity.this, "val: "+i, Toast.LENGTH_SHORT).show();
    }

}
