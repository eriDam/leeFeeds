package com.eridev.android.leefeeds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                startActivity(new Intent(this, ActivityNoticias.class));
                break;
            case R.id.button_2:
                Toast texto2 = Toast.makeText(getBaseContext(), "Boton 2 pulsado!",
                        Toast.LENGTH_LONG);
                texto2.show();
                break;
            case R.id.button_3:
                Toast texto3 = Toast.makeText(getBaseContext(), "Boton 3 pulsado!",
                        Toast.LENGTH_LONG);
                texto3.show();
                break;
        }
    }

}
