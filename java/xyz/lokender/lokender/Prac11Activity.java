package xyz.lokender.lokender;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Prac11Activity extends AppCompatActivity {
    EditText et_username, et_password;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac11);

        et_username = (EditText) findViewById(R.id.username);
        et_password = (EditText) findViewById(R.id.password);
    }


    public void login(View view) {
        username = et_username.getText().toString();
        password = et_password.getText().toString();

        if (username.equals("user") && password.equals("pwd")) {
            Intent i = new Intent(this,Prac11bActivity.class);
            startActivity(i);
        }

        else {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Prac11Activity.this);

            alertDialogBuilder.setMessage("Wrong Username or Password");
            alertDialogBuilder.setPositiveButton("OK",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            Toast.makeText(Prac11Activity.this, "Try Again", Toast.LENGTH_LONG).show();
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }

    }
}

