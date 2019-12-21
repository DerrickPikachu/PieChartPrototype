package com.example.piechartprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class MainActivity extends AppCompatActivity {

    PieChartView pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<SliceValue> slices = new ArrayList<>();

        pieChart = findViewById(R.id.chart);
        slices.add(new SliceValue(15, Color.BLUE).setLabel("A:23"));
        slices.add(new SliceValue(25, Color.GRAY).setLabel("B:34"));
        slices.add(new SliceValue(10, Color.RED).setLabel("C:54"));
        slices.add(new SliceValue(60, Color.MAGENTA).setLabel("D:65"));

        PieChartData chartData = new PieChartData(slices);
        chartData.setHasLabels(true).setValueLabelTextSize(14);
        chartData.setValueLabelBackgroundColor(Color.argb(255,0,0,0));
        chartData.setHasCenterCircle(true).setCenterText1("Test all")
                .setCenterText1FontSize(20).setCenterText1Color(Color.parseColor("#0097A7"));
        pieChart.setPieChartData(chartData);
    }
}
