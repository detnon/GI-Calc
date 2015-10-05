package samdetnon.gi_calc;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class CalculateLoad extends AppCompatActivity {

    final TextView firstValue = (TextView) findViewById(R.id.firstValue);
    final TextView secondValue = (TextView) findViewById(R.id.secondValue);

    public int indexValue = Integer.parseInt(firstValue.getText().toString());
    public int carbsInGrams = Integer.parseInt(secondValue.getText().toString());

    public float getResult() {
        float multiplied = indexValue * carbsInGrams;
        float result = multiplied / 100;
        return result;
    }
}
