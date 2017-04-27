package xyz.lokender.lokender;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Program1) {
            // Handle the camera action
           Intent i = new Intent(this,Prac1Activity.class);
            startActivity(i);

        } else if (id == R.id.Program2) {
            Intent i = new Intent(this,Prac2Activity.class);
            startActivity(i);

        } else if (id == R.id.Program3) {
            Intent i = new Intent(this,Prac3Activity.class);
            startActivity(i);

        } else if (id == R.id.Program4) {
            Intent i = new Intent(this,Prac4Activity.class);
            startActivity(i);

        }else if (id == R.id.Program5) {
            Intent i = new Intent(this,Prac5Activity.class);
            startActivity(i);

        }else if (id == R.id.Program6) {
            Intent i = new Intent(this,Prac6Activity.class);
            startActivity(i);

        }else if (id == R.id.Program7) {
            Intent i = new Intent(this,Prac7Activity.class);
            startActivity(i);

        }else if (id == R.id.Program8) {
            Intent i = new Intent(this,Prac8Activity.class);
            startActivity(i);

        }else if (id == R.id.Program9) {
            Intent i = new Intent(this,Prac9Activity.class);
            startActivity(i);

        }else if (id == R.id.Program10) {
            Intent i = new Intent(this,Prac10Activity.class);
            startActivity(i);

        }else if (id == R.id.Program11) {
            Intent i = new Intent(this,Prac11Activity.class);
            startActivity(i);

        }else if (id == R.id.Program12) {
            Intent i = new Intent(this,Prac12Activity.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
