package buyticket.fedyshyn.com.buyticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaceTrainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_train);

        final Button buttonBuyOne = (Button) findViewById(R.id.buttonBuyTwo);
        buttonBuyOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGo = new Intent(PlaceTrainActivity.this, CardActivity.class);
                startActivity(intentGo);
            }
        });

    }
}
