package xyz.lokender.lokender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Prac8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac8);
    }

    public void change_bg(View v) {
        LinearLayout l = (LinearLayout)findViewById(R.id.activity_main);
        switch (v.getId()) {
            case R.id.blue:
                l.setBackgroundColor(getResources().getColor(R.color.blue));
                break;

            case R.id.red:
                l.setBackgroundColor(getResources().getColor(R.color.red));
                break;

            case R.id.green:
                l.setBackgroundColor(getResources().getColor(R.color.green));
                break;

        }
    }
}
