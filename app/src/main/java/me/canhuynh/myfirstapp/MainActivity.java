package me.canhuynh.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "me.canhuynh.myfirstapp.MESSAGE";

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

//        Log.a(TAG, "assert");
        Log.d(TAG, "Debug");
        Log.e(TAG, "Error");
        Log.i(TAG, "Info");
        Log.v(TAG, "Verbose");
        Log.w(TAG, "Warn");

        startActivity(intent);
    }
}
