package com.example.sendmail;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findViewById(R.id.SetTime).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int hour = 0;
                final int minute = 0;
                final TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                ((TextView) findViewById(R.id.hour)).setText(String.format("%1$02d", hourOfDay));
                                ((TextView) findViewById(R.id.minute)).setText(String.format("%1$02d", minute));
                            }
                        }, hour, minute, true);
                timePickerDialog.show();
            }
        });

        this.findViewById(R.id.Submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"メールを送信しました", Toast.LENGTH_SHORT).show();
                MainActivity.this.finish();
            }
        });
    }
}
