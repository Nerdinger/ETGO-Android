package com.application.etgo.etgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaLogin extends AppCompatActivity {

    private EditText etLogin, etSenha;
    private Button btEntrar;
    private TextView etCadastrese;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
    }
}
