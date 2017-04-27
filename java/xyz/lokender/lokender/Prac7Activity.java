package xyz.lokender.lokender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Prac7Activity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    RadioButton rb1,rb2,rb3;
    RadioGroup rg;
    TextView tw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac7);

        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rg = (RadioGroup)findViewById(R.id.radioGroup);
        tw = (TextView) findViewById(R.id.textView);
        rg.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(RadioGroup rg, int i){
        if(i == rb1.getId()){
            tw.setText("Mr. ABC");
        }

        if(i == rb2.getId()){
            tw.setText("Mr. XYZ");
        }

        if(i == rb3.getId()){
            tw.setText("Mrs. PQR");
        }
    }
}
