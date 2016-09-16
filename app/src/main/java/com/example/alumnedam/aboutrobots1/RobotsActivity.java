package com.example.alumnedam.aboutrobots1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RobotsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robots);
        Button btnNoTocar = (Button) findViewById(R.id.buttonNoTocar);
        btnNoTocar.setOnClickListener(this);
    }
//esto viguila el boton lo que se ejecute en el contenido.
    @Override
    public void onClick(View v) {
        int cont=0;

        if (v.getId()==R.id.buttonNoTocar){
            TextView textView = (TextView) findViewById(R.id.textView);
            //cambiar el texto de el label
            textView.setText("Parece que los humanos no son muy inteligentes");
            //combierte el view en button
            Button btnNoTocar = (Button) v;
            btnNoTocar.setText("Que no me toques!!!!!!!!");
        }
    }
}
