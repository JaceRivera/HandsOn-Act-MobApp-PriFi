package com.sebbygames.project_intellect;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText In1 = (EditText) findViewById(R.id.In1);
        EditText In2 = (EditText) findViewById(R.id.In2);

        Button swap = (Button)findViewById(R.id.swapBtn);
        Button check = (Button)findViewById(R.id.compareBtn);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Screen2.class);
                String textA = In1.getText().toString();
                String textB = In2.getText().toString();
                i.putExtra("Input1", textA);
                i.putExtra("Input2", textB);
                startActivity(i);
            }
        });

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String trash = In1.getText().toString();
                In1.setText(In2.getText().toString());
                In2.setText(trash);
            }
        });



    }
}