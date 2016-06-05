package buyticket.fedyshyn.com.buyticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        final ImageButton ImageButtonTree = (ImageButton) findViewById(R.id.imageButton3);
        ImageButtonTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTwo = new Intent(CategoryActivity.this, TrainActivity.class);
                startActivity(intentTwo);
            }
        });
    }
}
