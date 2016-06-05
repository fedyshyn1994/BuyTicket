package buyticket.fedyshyn.com.buyticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton ImageButtonOne = (ImageButton) findViewById(R.id.imageButtonOne);
        ImageButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentOne = new Intent(MainActivity.this, CategoryActivity.class);
                startActivity(intentOne);
            }
        });
    }
}
