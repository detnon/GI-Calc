package samdetnon.gi_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView resultValue = (TextView) findViewById(R.id.result_value);
        final Button calculateButton = (Button) findViewById(R.id.calculateButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculateLoad newLoad = new CalculateLoad();
                resultValue.setText(newLoad.toString());
            }
        };
        calculateButton.setOnClickListener(listener);
    }
}
