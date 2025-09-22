package com.marcal.bmicalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        TextView resultText = findViewById(R.id.text_view_result);

        RadioButton radioButtonMale = findViewById(R.id.radio_button_male);

        RadioButton radioButtonFemale = findViewById(R.id.radio_button_female);

        EditText editTextAge = findViewById(R.id.edit_text_age);
        EditText editTextFeet = findViewById(R.id.edit_text_feet);
        EditText editTextInches = findViewById(R.id.edit_text_inches);
        EditText editTextWeight = findViewById(R.id.edit_text_weight);

        Button calculateButton = findViewById(R.id.button_calculate);


    }
}