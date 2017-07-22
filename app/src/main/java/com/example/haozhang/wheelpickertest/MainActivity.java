package com.example.haozhang.wheelpickertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.bigkoo.pickerview.OptionsPickerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Page> pageItem = new ArrayList<>();
    TextView tx;
    OptionsPickerView pageWheel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx = (TextView) findViewById(R.id.button);
        setPageData();
        setupOptionPicker();
        setUpButton();
    }

    private void setUpButton() {
        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pageWheel.show();
            }
        });
    }


    private void setupOptionPicker() {
        pageWheel = new OptionsPickerView.Builder(this, new OptionsPickerView.OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int options2, int options3, View v) {
                String tx = pageItem.get(options1).getPickerViewText();
                Toast.makeText(MainActivity.this, tx, Toast.LENGTH_SHORT).show();
            }
        }).build();
        pageWheel.setPicker(pageItem);
    }

    private void setPageData() {
        for (int i = 0; i < 15; i++) {
            pageItem.add(new Page(i + 1, "第" + (i + 1) + "页"));
        }
    }
}
