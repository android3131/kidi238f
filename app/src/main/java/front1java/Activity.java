package com.example.kidi2;
//sdafdh
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Activity extends AppCompatActivity {
    private EditText fromDateText, toDateText;
    private ImageButton fromDateImage, toDateImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);


        LayoutInflater inflater = (LayoutInflater) this.getSystemService
                (this.LAYOUT_INFLATER_SERVICE);
        LinearLayout scrollViewLinearlayout = (LinearLayout) findViewById(R.id.scrollViewLayoutID2);
        // The layout inside scroll view
        for (int i = 0; i < 5; i++) {
            LinearLayout layout2 = new LinearLayout(this);
            layout2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            View item = inflater.inflate(R.layout.viewpager_item, null, false);
            layout2.setId(i);
            layout2.addView(item);
            scrollViewLinearlayout.addView(layout2);
        }


///////////////////////////////
        MaterialDatePicker.Builder<Pair<Long, Long>> builder = MaterialDatePicker.Builder.dateRangePicker();
        builder.setTitleText("select date");
        final MaterialDatePicker materialDatePicker = builder.build();


        fromDateText = findViewById(R.id.dateActivityTextID);
        fromDateText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDatePicker.show(getSupportFragmentManager(), "date_picker");
            }
        });

        fromDateImage = findViewById(R.id.imageButton4);
        fromDateImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDatePicker.show(getSupportFragmentManager(), "date_picker");
            }
        });

        materialDatePicker.addOnPositiveButtonClickListener
                (new MaterialPickerOnPositiveButtonClickListener<Pair<Long, Long>>() {
                    @Override
                    public void onPositiveButtonClick(Pair<Long, Long> selection) {
                        fromDateText.setText(materialDatePicker.getHeaderText());
                    }
                });


        //////////////////////////
    }

}