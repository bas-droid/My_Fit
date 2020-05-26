package ng.edu.baze.myfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");
    }

    public void buttonClick(View view) {
        switch (view.getId()) {
            case R.id.loginBtn:
                navigateUpToHome();
                break;
            case R.id.regBtn2:
                startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
                break;
}
    }
    private void navigateUpToHome() {
        Intent homeIntent = new Intent(this, Home.class);
        startActivity(homeIntent);
    }
}


