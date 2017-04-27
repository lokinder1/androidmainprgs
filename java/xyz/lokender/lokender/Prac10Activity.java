package xyz.lokender.lokender;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Prac10Activity extends AppCompatActivity {
    EditText et_username, et_password;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac10);

        et_username = (EditText) findViewById(R.id.username);
        et_password = (EditText) findViewById(R.id.password);
    }


    public void open(View view) {
        username = et_username.getText().toString();
        password = et_password.getText().toString();

        if (username.equals("user") && password.equals("pwd")) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Prac10Activity.this);

            alertDialogBuilder.setMessage("Welcome " + username);
            alertDialogBuilder.setPositiveButton("OK",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            //Toast.makeText(Prac10Activity.this, "", Toast.LENGTH_LONG).show();
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }

        else {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Prac10Activity.this);

            alertDialogBuilder.setMessage("Wrong Username or Password");
            alertDialogBuilder.setPositiveButton("OK",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            Toast.makeText(Prac10Activity.this, "Try Again", Toast.LENGTH_LONG).show();
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }

    }
}

