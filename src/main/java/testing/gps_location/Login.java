package testing.gps_location;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
EditText editText;
    Button report, enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText = (EditText) findViewById(R.id.editText);
        report = (Button) findViewById(R.id.button2);
        enter = (Button) findViewById(R.id.button3);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              editText= Integer.parseInt(editText.getText().toString());
                if(editText=="430") {
                    report.setVisibility(View.VISIBLE);
                }
            }

        });
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, View.class);
                startActivity(intent);

            }
        });
    }

}
