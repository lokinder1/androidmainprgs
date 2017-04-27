package xyz.lokender.lokender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class Prac5Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner = null;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac5);
        iv = (ImageView) findViewById(R.id.images);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch(position){
            case 0:
                break;
            case 1: iv.setImageResource(R.drawable.idcard);
                break;
            case 2: iv.setImageResource(R.drawable.idcard1);
                break;
            case 3: iv.setImageResource(R.drawable.test);
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}