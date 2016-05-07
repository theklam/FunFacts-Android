package com.kalvinlam.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {
    // Declare our View variables
    private TextView mFactTextView;
    private Button mShowFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the Views from the layout files to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The button was clicked, so update the fact TextView with a new fact
                String fact = "Ostriches can run faster than horses.";

                // Update TextView to show this new fact
                mFactTextView.setText(fact);

            }
        };
        mShowFactButton.setOnClickListener(listener);

    }
}
