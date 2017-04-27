package xyz.lokender.lokender;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prac3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac3);

    }

    public void onSendMessage(View view) {
        EditText messageView = (EditText)findViewById(R.id.textfield);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this,Prac3bActivity.class);
        intent.putExtra(Prac3bActivity.EXTRA_MESSAGE, messageText);

        startActivity(intent);
    }


}
