package com.tecii.android.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText txtDinero;
    private TextView txt100;
    private TextView txt50;
    private TextView txt20;
    private TextView txt5;
    private TextView txt2;
    private TextView txt1;
    private TextView txt50c;
    private TextView txt20c;
    private TextView txt10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDinero=(EditText)findViewById(R.id.txtDinero);
        txt100=(TextView)findViewById(R.id.txt100);
        txt50=(TextView)findViewById(R.id.txt50);
        txt20=(TextView)findViewById(R.id.txt20);
        txt5=(TextView)findViewById(R.id.txt5);
        txt2=(TextView)findViewById(R.id.txt2);
        txt1=(TextView)findViewById(R.id.txt1);
        txt50c=(TextView)findViewById(R.id.txt50c);
        txt20c=(TextView)findViewById(R.id.txt20c);
        txt10=(TextView)findViewById(R.id.txt10);
    }

    public void convertir (View view){
        int ent, dec;
        int b100, b50, b20, m5, m2, m1, m50, m20, m10;
        String cantidad = txtDinero.getText().toString();
        double d = Double.parseDouble(cantidad);
        ent = (int)(d);
        b100 = ent/100;
        ent = ent%100;
        b50 = ent/50;
        ent = ent%50;
        b20 = ent/20;
        ent = ent%20;
        m5 = ent/5;
        ent = ent%5;
        m2 = ent/2;
        ent = ent%2;
        m1 = ent;
        dec = (int)(d * 1000+0.5);
        m50 = dec/500;
        dec = dec%500;
        m20 = dec/200;
        dec = dec % 200;
        m10 = dec/100;
        String res = "Total de billetes de 100 es:" + b100 + "\n";
        String res2 = "Total de billetes de 50 es:" + b50 + "\n";
        String res3 = "Total de billetes de 20 es:" + b20 + "\n";
        String res4 = "Total de monedas de 5  es:" + m5 + "\n";
        String res5 = "Total de Monedas de 2  es:" + m2 + "\n";
        String res6 = "Total de monedas de 1  es:" + m1 + "\n";
        String res7 = "Total de centavos de 50  es:" + m50 + "\n";
        String res8 = "Total de centavos de 20  es:" + m20 + "\n";
        String res9 = "Total de monedas de 10  es:" + m10 + "\n";
        txt100.setText(res);
        txt50.setText(res2);
        txt20.setText(res3);
        txt5.setText(res4);
        txt2.setText(res5);
        txt1.setText(res6);
        txt50c.setText(res7);
        txt20c.setText(res8);
        txt10.setText(res9);
    }
}
