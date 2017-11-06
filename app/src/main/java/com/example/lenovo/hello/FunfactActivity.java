package com.example.lenovo.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FunfactActivity extends AppCompatActivity implements View.OnClickListener{

    //variable view
    private Button btnShowFact,btnToggleLang;


    private void initView(){


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //implement class Activity
        super.onCreate(savedInstanceState);
        //Load Layout
        setContentView(R.layout.activity_funfact);

        //Merujuk button pada view ke dalam objek button
        Button btnShowFact = (Button) findViewById(R.id.button_funfact);
        Button btnToggleLang = (Button) findViewById(R.id.toggle_lang);




            }
        });

    }
}
