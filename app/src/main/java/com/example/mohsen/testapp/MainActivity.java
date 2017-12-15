package com.example.mohsen.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  public Button btnTest;
  public TextView txtTest;
  public static boolean bTest = false;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btnTest = (Button) findViewById(R.id.btnTest);
    txtTest = (TextView) findViewById(R.id.txtTest);


    btnTest.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (bTest) {
          txtTest.setText("this is a test");
          bTest = false;
        } else {
          txtTest.setText("****");
          bTest = true;
        }
      }
    });
  }
}
