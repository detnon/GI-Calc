package samdetnon.gi_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView firstValue =         (TextView) findViewById(R.id.firstValue);
        final TextView secondValue =        (TextView) findViewById(R.id.secondValue);
        final TextView resultValue =        (TextView) findViewById(R.id.result_value);
        final Button   calculateButton =    (Button)   findViewById(R.id.calculateButton);
        final TextView resultsList =        (TextView) findViewById(R.id.value_list);
        final TextView totalValue =         (TextView) findViewById(R.id.total_value);



        // Create an array to hold all the results
        final ArrayList<String> resultsArray = new ArrayList<String>();

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set input values for computation
                float indexValue = Integer.parseInt(firstValue.getText().toString());
                float carbsInGrams = Integer.parseInt(secondValue.getText().toString());

                float multiplied = indexValue * carbsInGrams;
                float result = multiplied / 100;

                String resultString = Float.toString(result);

                resultValue.setText(resultString);

                resultsArray.add(resultString);

                String arrayString = "";
                float arrayFloat ;
                float arraySum = 0;

                // loop through each element of the results array and format by appending
                // a new line after each result
                for (String item : resultsArray) {
                    arrayString += item + "\n";
                    resultsList.setText(arrayString);
                    arrayFloat = Float.parseFloat(item);
                    arraySum = arraySum + arrayFloat;
                    String arraySumString = Float.toString(arraySum);
                    totalValue.setText(arraySumString);

                }

            }
        };
        calculateButton.setOnClickListener(listener);
    }
}
