package buyticket.fedyshyn.com.buyticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TrainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);

        final Button buttonBuy = (Button) findViewById(R.id.buttonBuyOne);
        buttonBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTre = new Intent(TrainActivity.this, PlaceTrainActivity.class);
                startActivity(intentTre);
            }
        });
    }
}
