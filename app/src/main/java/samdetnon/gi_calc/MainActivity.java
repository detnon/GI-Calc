package samdetnon.gi_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView firstValue = (TextView) findViewById(R.id.firstValue);
        final TextView secondValue = (TextView) findViewById(R.id.secondValue);
        final TextView resultValue = (TextView) findViewById(R.id.result_value);
        final Button calculateButton = (Button) findViewById(R.id.calculateButton);



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float indexValue = Integer.parseInt(firstValue.getText().toString());
                float carbsInGrams = Integer.parseInt(secondValue.getText().toString());

                float multiplied = indexValue * carbsInGrams;
                float result = multiplied / 100;

                String resultString = Float.toString(result);

                resultValue.setText(resultString);
            }
        };
        calculateButton.setOnClickListener(listener);
    }
}
