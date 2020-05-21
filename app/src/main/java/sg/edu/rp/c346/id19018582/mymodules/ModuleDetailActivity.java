package sg.edu.rp.c346.id19018582.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvModuleName, tvModuleCode, tvYear, tvSem, tvCredit, tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModuleName = findViewById(R.id.textViewModuleName);
        tvModuleCode = findViewById(R.id.textViewModuleCode);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);

        btnBack = findViewById(R.id.buttonBack);

        Intent details = getIntent();

        String value1 = details.getStringExtra("ModuleCode");
        String value2 = details.getStringExtra("ModuleName");
        int value3 = details.getIntExtra("Year", 0);
        int value4 = details.getIntExtra("Sem", 0);
        int value5 = details.getIntExtra("Credit", 0);
        String value6 = details.getStringExtra("Venue");

        tvModuleCode.setText("Module Code: " + value1);
        tvModuleName.setText("Module Name: " + value2);
        tvYear.setText("Academic Year: " + value3);
        tvSem.setText("Semester: " + value4);
        tvCredit.setText("Module Credit: " + value5);
        tvVenue.setText("Venue: " + value6);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
