package com.iesvirgendelcarmen.dam.material04;

import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Material04 extends AppCompatActivity implements View.OnClickListener {
    CoordinatorLayout coordinatorLayout;
    FloatingActionButton fab;
    Button btnSimple;
    Button btnInteractivo;
    Button btnPersonalizado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material04);

        coordinatorLayout=(CoordinatorLayout)findViewById(R.id.coordinatorLayout);
        fab=(FloatingActionButton)findViewById(R.id.fab);
        btnSimple=(Button)findViewById(R.id.btnSimple);
        btnInteractivo=(Button)findViewById(R.id.btnInteractivo);
        btnPersonalizado=(Button)findViewById(R.id.btnPersonalizado);

        btnSimple.setOnClickListener(this);
        btnInteractivo.setOnClickListener(this);
        btnPersonalizado.setOnClickListener(this);

       /* btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar=Snackbar.make(coordinatorLayout,"EJEMPLO DE SNACKBAR",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

        btnInteractivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar=Snackbar.make(coordinatorLayout,"MENSAJE BORRADO",Snackbar.LENGTH_LONG).setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar snackbar1=Snackbar.make(coordinatorLayout,"MENSAJE RESTAURADO",Snackbar.LENGTH_LONG);
                        snackbar1.show();

                    }
                });
                snackbar.show();
            }
        });

        btnPersonalizado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar=Snackbar.make(coordinatorLayout,"NO ENCUENTRO LA RED",Snackbar.LENGTH_LONG).setAction("RETRY", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar snackbar1=Snackbar.make(coordinatorLayout,"CONEXION CANCELADA",Snackbar.LENGTH_LONG);

                        snackbar1.show();
                    }
                });
                View sbView=snackbar.getView();
                TextView texto=(TextView)sbView.findViewById(android.support.design.R.id.snackbar_text);
                texto.setTextColor(Color.YELLOW);
                snackbar.setActionTextColor(Color.CYAN);
                snackbar.show();
            }
        });*/
       fab.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Snackbar snackbarNombre=Snackbar.make(coordinatorLayout,"José Antonio Estrella Fernández",Snackbar.LENGTH_LONG);
               snackbarNombre.show();
           }
       });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSimple:
                Snackbar snackbar=Snackbar.make(coordinatorLayout,"EJEMPLO DE SNACKBAR",Snackbar.LENGTH_LONG);
                snackbar.show();
                break;
            case R.id.btnInteractivo:
                Snackbar snackbar2=Snackbar.make(coordinatorLayout,"MENSAJE BORRADO",Snackbar.LENGTH_LONG).setAction("UNDO", new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Snackbar snackbar1=Snackbar.make(coordinatorLayout,"MENSAJE RESTAURADO",Snackbar.LENGTH_LONG);
                        snackbar1.show();
                    }
                });
                snackbar2.show();
                break;
            case R.id.btnPersonalizado:
                Snackbar snackbar3=Snackbar.make(coordinatorLayout,"NO ENCUENTRO LA RED",Snackbar.LENGTH_LONG).setAction("RETRY", new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Snackbar snackbar1=Snackbar.make(coordinatorLayout,"CONEXION CANCELADA",Snackbar.LENGTH_LONG);
                        snackbar1.show();
                    }
                });
                View sbView=snackbar3.getView();
                TextView texto=(TextView)sbView.findViewById(android.support.design.R.id.snackbar_text);
                texto.setTextColor(Color.YELLOW);
                snackbar3.setActionTextColor(Color.CYAN);
                snackbar3.show();
        }
    }
}
