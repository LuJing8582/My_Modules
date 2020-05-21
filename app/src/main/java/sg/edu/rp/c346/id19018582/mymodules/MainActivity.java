package sg.edu.rp.c346.id19018582.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvAndroid, tvIpad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAndroid = findViewById(R.id.textView);
        tvIpad = findViewById(R.id.textView2);

        tvAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("ModuleCode", "C346");
                i.putExtra("ModuleName", "Android Programming");
                i.putExtra("Year", 2020);
                i.putExtra("Sem", 1);
                i.putExtra("Credit", 4);
                i.putExtra("Venue", "W66M");
                startActivity(i);
            }
        });

        tvIpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("ModuleCode", "C349");
                i.putExtra("ModuleName", "iPad Programming");
                i.putExtra("Year", 2020);
                i.putExtra("Sem", 1);
                i.putExtra("Credit", 4);
                i.putExtra("Venue", "W66M");
                startActivity(i);
            }
        });
    }
}
