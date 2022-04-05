package a61cntt.a61133794.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent iHome = getIntent();
        TextView textView= (TextView) findViewById(R.id.tvusername);
        textView.setText(String.valueOf(iHome.getStringExtra("ten")));
    }
}