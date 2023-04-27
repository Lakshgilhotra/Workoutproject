/* ----------------Student Details----------------
Name: Laksh; Id: 222437252
CourseName: SIT305
 */
package com.example.workouttimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText duration,set_rest;
    Button START_Timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        duration=findViewById(R.id.Set_Duration);
        set_rest=findViewById(R.id.Set_Rest);
        START_Timer=findViewById(R.id.Run_Timer);

        START_Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent timerunner=new Intent(MainActivity.this,runningtime.class);
                timerunner.putExtra("Duration_Value",duration.getText().toString());
                timerunner.putExtra("Rest_Value",set_rest.getText().toString());
                startActivity(timerunner);
            }
        });

    }
}