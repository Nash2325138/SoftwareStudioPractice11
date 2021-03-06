package com.csclab.softwarestudiopractice11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button send;
    private EditText edt;
    private Intent intent;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** To Do:
         * (1) Find the UI element on xml file
         * **/
        send = (Button) findViewById(R.id.send_button);
        edt = (EditText) findViewById(R.id.edt);

        send.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendName();
            }
        });
        intent = new Intent();
        bundle = new Bundle();
    }

    public void sendName(){

        /** To Do:
         * (1) Use intent and Bundle to pass string
         * (2) Change activity to Activity2
         * **/

        intent.setClass(MainActivity.this, Activity2.class);
        bundle.putString("name", edt.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
