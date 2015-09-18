package com.example.comp2160.simpleui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  //  TextView textView01;
  //  Button button01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  //      textView01 = (TextView)findViewById(R.id.textView01);
  //      button01 = (Button)findViewById(R.id.button01);

       // button01.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View v) {
               //onClickExecute(v);
             //   textView01.setText("Welcome Class From Listener");
               // Log.d("SimpleUI","Listener Activated");
           // }
       // });
    }

  //  public void onClickExecute2(View v){

  //        textView01.setText("Welcome Class from View");
  //      Log.d("SimpleUI", "OnClick Button Activated");
  //  }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
