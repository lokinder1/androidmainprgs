package xyz.lokender.lokender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Prac6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac6);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);//Menu Resource, Menu
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        TextView t=(TextView)findViewById(R.id.txtvw);
        String msg;
        switch (item.getItemId())
        {
            case R.id.item1:
                msg="Item 1 selected";
                t.setText(msg);
                return true;
            case R.id.item2:
                msg="Item 2 selected";
                t.setText(msg);
                return true;
            case R.id.item3:
                msg="Item 3 selected";
                t.setText(msg);
                return true;
            case R.id.item4:
                msg="Item 4 selected";
                t.setText(msg);
                return true;
            case R.id.item5:
                msg="Item 5 selected";
                t.setText(msg);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

