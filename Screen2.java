package com.sebbygames.project_intellect;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView result = (TextView) findViewById(R.id.result);

        Button back = findViewById(R.id.back);

        Intent intent = getIntent();
        String In1 = intent.getStringExtra("Input1");
        String In2 = intent.getStringExtra("Input2");

        if(In1.equals(inputB)){
            result.setText("Match!");
        }
        else{
            result.setText("Mismatch!");
        }


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
    }
    public void openMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}