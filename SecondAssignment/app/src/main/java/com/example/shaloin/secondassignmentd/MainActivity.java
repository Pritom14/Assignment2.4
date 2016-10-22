package com.example.shaloin.secondassignmentd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.buttonID);
        image=(ImageView)findViewById(R.id.imageID);


    }

    public void clickme(View v){

        if(button.getText().equals("HIDE")){
            image.setVisibility(View.INVISIBLE);
            button.setText("SHOW");

        }
        else if(button.getText().equals("SHOW")){
            image.setVisibility(View.VISIBLE);
            button.setText("HIDE");
        }

    }



}
