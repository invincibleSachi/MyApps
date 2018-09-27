package inspire.com.railtale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button trainsAtGlance= findViewById(R.id.trainsAtGlance);
        Button spotUrTrain= findViewById(R.id.SpotUrTrain);
        Button seatAvblibility= findViewById(R.id.SeatAvailability);
        trainsAtGlance.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_trains_at_a_glance);
            }
        });

        spotUrTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_spot_your_train);
            }
        });

        seatAvblibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_seat_availability);
            }
        });
    }
}
