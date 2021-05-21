package com.govind.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView,abcde;
    String abcd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=(TextView)findViewById(R.id.textview);
        abcde=(TextView)findViewById(R.id.abcde);


        abcde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
        Toast.makeText(getApplicationContext(),"lifecycle: onCreate invoked",Toast.LENGTH_LONG).show();
        abcd ="lifecycle: onCreate invoked \n";
        textView.setText(abcd);

        Log.e("lifecycle","onCreate invoked");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("lifecycle","onStart invoked");
        Toast.makeText(getApplicationContext(),"lifecycle: onStart invoked",Toast.LENGTH_LONG).show();
        abcd +="lifecycle: onStart invoked \n";
        textView.setText(abcd);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.e("lifecycle","onResume invoked");
        Toast.makeText(getApplicationContext(),"lifecycle: onResume invoked",Toast.LENGTH_LONG).show();
        abcd +="lifecycle: onResume invoked \n";
        textView.setText(abcd);

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("lifecycle","onPause invoked");
        Toast.makeText(getApplicationContext(),"lifecycle: onPause invoked",Toast.LENGTH_LONG).show();
        abcd +=" \n lifecycle: onPause invoked \n";
        textView.setText(abcd);
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.e("lifecycle","onStop invoked");
        Toast.makeText(getApplicationContext(),"lifecycle: onStop invoked",Toast.LENGTH_LONG).show();

        abcd +="lifecycle: onStop invoked \n";
        textView.setText(abcd);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("lifecycle","onRestart invoked");
        Toast.makeText(getApplicationContext(),"lifecycle: onRestart invoked",Toast.LENGTH_LONG).show();
        abcd +="\n lifecycle: onRestart invoked \n";
        textView.setText(abcd);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("lifecycle","onDestroy invoked");
        Toast.makeText(getApplicationContext(),"lifecycle: onDestroy invoked",Toast.LENGTH_LONG).show();
        textView.setText("lifecycle: onDestroy invoke");
    }
}