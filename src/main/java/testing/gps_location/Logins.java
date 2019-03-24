package testing.gps_location;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static testing.gps_location.R.id.editText5;

public class Logins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logins);
        Button submit;
        EditText editText2;

        submit = (Button) findViewById(R.id.sub);
        editText2 = (EditText) findViewById(editText5);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               editText5= Integer.parseInt(editText5.getText().toString());
                if(editText5>0) {
                    Intent intent = new Intent(Logins.this, Attendance.class);
                }
        });


    }
}
