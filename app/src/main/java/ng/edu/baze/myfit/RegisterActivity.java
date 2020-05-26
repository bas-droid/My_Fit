package ng.edu.baze.myfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setTitle("Register");
    }
    public void buttonClick1(View view) {
        switch (view.getId()) {
            case R.id.regBtn:
                navigateUpToHome();
                break;
        }
    }
    private void navigateUpToHome() {
        Intent homeIntent1 = new Intent(this, Home.class);
        startActivity(homeIntent1);
    }
}
