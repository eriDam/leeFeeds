package com.eridev.android.leefeeds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    Button boton1, boton2, boton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initilize();
    }

    private void initilize() {
        boton1 = (Button) findViewById(R.id.button_1);
        boton1.setOnClickListener(this);

        boton2 = (Button) findViewById(R.id.button_2);
        boton2.setOnClickListener(this);

        boton3 = (Button) findViewById(R.id.button_3);
        boton3.setOnClickListener(this);

    }

   
}
