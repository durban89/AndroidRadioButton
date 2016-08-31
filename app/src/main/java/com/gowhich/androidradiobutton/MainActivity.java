package com.gowhich.androidradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) this.findViewById(R.id.button);
        radioGroup = (RadioGroup) this.findViewById(R.id.sex);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int len = radioGroup.getChildCount();
                String sex = "";
                for(int i = 0; 0 < len; i++){
                    RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i);
                    if(radioButton.isChecked()){
                        sex = radioButton.getText().toString();
                        break;
                    }
                }

                Toast.makeText(MainActivity.this, sex, 1).show();
            }
        });
    }
}
