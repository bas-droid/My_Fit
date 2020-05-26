package ng.edu.baze.myfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.widget.TextView;
import android. widget.Toast;
import android.widget.Button;
import android.view.View;
import android.text.TextUtils;
import android.util.Patterns;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText mail;
    EditText password;
    EditText confirm_password;
    Button Register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.regName);
        mail = findViewById(R.id.regMail);
        password = findViewById(R.id.regPassword1);
        confirm_password = findViewById(R.id.regPassword2);
        Register = findViewById(R.id.regBtn);




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, 4000);
    }

    buttonClick1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick (View view){
        checkDataEntered();
    }
     )};
    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    void checkDataEntered() {
        if (isEmpty(name)) {
            Toast t = Toast.makeText(this, "You must enter  name to register!", Toast.LENGTH_SHORT);
            t.show();
        }

        if (isEmail(mail) == false) {
            mail.setError("Enter valid email!");
        }

    }
}











