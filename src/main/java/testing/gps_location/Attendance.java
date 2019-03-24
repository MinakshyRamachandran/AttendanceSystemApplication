package testing.gps_location;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Attendance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        Button attend;
        attend = (Button) findViewById(R.id.attend);
        attend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // gps code should be replaced here
                // if distance in the specified limit
                Toast.makeText(Attendance.this,
                        "Submitted", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
