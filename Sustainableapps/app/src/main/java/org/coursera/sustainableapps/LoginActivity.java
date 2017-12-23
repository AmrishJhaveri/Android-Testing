package org.coursera.sustainableapps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {

    private EditText txtEmail,txtPassword;
    private TextView txtError;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtEmail=(EditText)findViewById(R.id.email_id);
        txtPassword=(EditText)findViewById(R.id.password);
        btnLogin=(Button)findViewById(R.id.btn_login);
        txtError=(TextView)findViewById(R.id.error_msg);

        btnLogin.setOnClickListener(btnLoginOnClickListener);

    }

    private View.OnClickListener btnLoginOnClickListener=new View.OnClickListener(){
        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        @Override
        public void onClick(View v) {

        }
    };
}
