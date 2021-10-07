package com.example.ejercicioformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton tb_activation = (ToggleButton) findViewById(R.id.tb_Activation);

        tb_activation.setTextOff("Desactivado");

        tb_activation.setTextOn("Activado");


    }

    public void downloadInfo(View v) {
        EditText etName = (EditText) findViewById(R.id.etName);

        EditText etEmail = (EditText) findViewById(R.id.etEmail);

        EditText etMovil = (EditText) findViewById(R.id.etMovil);

        EditText etObservations = (EditText) findViewById(R.id.etObservations);

        TextView tvValueNameEntered = (TextView) findViewById(R.id.tvShowName);

        tvValueNameEntered.setText(etName.getText().toString());

        TextView tvValueEmailEntered = (TextView) findViewById(R.id.tvShowEmail);

        tvValueEmailEntered.setText(etEmail.getText().toString());

        TextView tvValueMovilEntered = (TextView) findViewById(R.id.tvShowMovil);

        tvValueMovilEntered.setText(etMovil.getText().toString());

        TextView tvValueObservationsEntered = (TextView) findViewById(R.id.tvShowObservations);

        tvValueObservationsEntered.setText(etObservations.getText().toString());

    }

    public void ocultForm(View v) {
        TextView tvObservations = (TextView) findViewById(R.id.tvObservations);
        ToggleButton tb_activation = (ToggleButton) findViewById(R.id.tb_Activation);
        EditText etObservations = (EditText) findViewById(R.id.etObservations);

        if (tb_activation.isChecked()) {
            tvObservations.setVisibility(View.GONE);
            etObservations.setVisibility(View.GONE);
        } else {
            tvObservations.setVisibility(View.VISIBLE);
            etObservations.setVisibility(View.VISIBLE);
        }
    }
}