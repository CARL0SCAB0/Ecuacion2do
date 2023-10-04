package com.example.calculadora;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText xet;
    Button xbtn7, xbtn8, xbtn9, xbtn4, xbtn5, xbtn6, xbtn1, xbtn2, xbtn3, xbtn0, xbtnfac, xbtnNM;
    int n,m,i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xet = findViewById(R.id.xet);
        xbtn0 = findViewById(R.id.xbtn0);
        xbtn1 = findViewById(R.id.xbtn1);
        xbtn2 = findViewById(R.id.xbtn2);
        xbtn3 = findViewById(R.id.xbtn3);
        xbtn4 = findViewById(R.id.xbtn4);
        xbtn5 = findViewById(R.id.xbtn5);
        xbtn6 = findViewById(R.id.xbtn6);
        xbtn7 = findViewById(R.id.xbtn7);
        xbtn8 = findViewById(R.id.xbtn8);
        xbtn9 = findViewById(R.id.xbtn9);
        xbtnfac = findViewById(R.id.xbtnfac);
        xbtnNM = findViewById(R.id.xbtnNM);

        xbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("9");
            }
        });

        xbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("8");
            }
        });

        xbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("8");
            }
        });

        xbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("6");
            }
        });

        xbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("5");
            }
        });

        xbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("4");
            }
        });

        xbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("3");
            }
        });

        xbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("2");
            }
        });

        xbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("1");
            }
        });

        xbtn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("0");
            }
        });

        xbtnfac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("!");
            }
        });

        xbtnNM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=Integer.parseInt(String.valueOf(xet.getText()));
                m=n;
                while (n!=1){
                    if(0==n%2){
                        n=n/2;
                    }else{
                        n=(n*3)+1;
                    }
                    xet.append(String.valueOf("\n"+n));
                }
                xet.append("\nEl numero " + m + " es un numero maravilloso");
            }
        });

        Button xbtnc = findViewById(R.id.xbtnc);
        xbtnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xet.setText("");
            }
        });

        Button xbtnfac = findViewById(R.id.xbtnfac);
        xbtnfac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = Integer.parseInt(String.valueOf(xet.getText()));
                xet.setText("");
                xet.append(""+Factorial(i));
            }
        });

    }
    private void agregarNumero(String numero) {
        String textoActual = xet.getText().toString();
        textoActual += numero;
        xet.setText(textoActual);
    }

    private int Factorial(int n){
        if(n>=0 && n<=1)
            return 1;
        else
            return n * Factorial(n-1);
    }
}
