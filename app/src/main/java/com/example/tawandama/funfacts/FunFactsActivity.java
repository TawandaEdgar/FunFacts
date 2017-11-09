package com.example.tawandama.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook mFactBook= new FactBook();
    private TextView mFactTextView;
    private Button mFactButton;
    private RelativeLayout mRelativeLayout;
    private ColorWheel mColorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        mFactTextView= (TextView) findViewById(R.id.facttextView);
        mFactButton= (Button) findViewById(R.id.factButton);
        mRelativeLayout= (RelativeLayout) findViewById(R.id.rLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();


                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mFactButton.setTextColor(color);

            }
        };
        mFactButton.setOnClickListener(listener);
        Toast.makeText(this, "Zvakunakidza", Toast.LENGTH_SHORT).show();

        Log.d(TAG,"We're logging from the OnCreate() method");


    }
}
