package com.mhadikz.toasterdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mhadikz.toaster.Toaster;

import static com.mhadikz.toaster.Toaster.Status.ERROR;
import static com.mhadikz.toaster.Toaster.Status.INFO;
import static com.mhadikz.toaster.Toaster.Status.SUCCESS;
import static com.mhadikz.toaster.Toaster.Status.WARNING;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button BtnInfo, BtnSuccess, BtnWarning, BtnError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnInfo = findViewById(R.id.btn_info);
        BtnSuccess = findViewById(R.id.btn_success);
        BtnWarning = findViewById(R.id.btn_warning);
        BtnError = findViewById(R.id.btn_error);

        BtnInfo.setOnClickListener(this);
        BtnSuccess.setOnClickListener(this);
        BtnWarning.setOnClickListener(this);
        BtnError.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == BtnInfo) {

            new Toaster.Builder(this)
                    .setTitle(getString(R.string.info_title))
                    .setDescription(getString(R.string.info_description))
                    .setDuration(Toaster.LENGTH_SHORT)
                    .setStatus(INFO)
                    .show();

        } else if(view == BtnSuccess){

            new Toaster.Builder(this)
                    .setTitle(getString(R.string.success_title))
                    .setDescription(getString(R.string.success_description))
                    .setDuration(Toaster.LENGTH_LONG)
                    .setStatus(SUCCESS)
                    .show();

        } else if(view == BtnWarning){

            new Toaster.Builder(this)
                    .setTitle(getString(R.string.warning_title))
                    .setDescription(getString(R.string.warning_description))
                    .setDuration(Toaster.LENGTH_LONG)
                    .setStatus(WARNING)
                    .show();

        } else if(view == BtnError){

            new Toaster.Builder(this)
                    .setTitle(getString(R.string.error_title))
                    .setDescription(getString(R.string.error_description))
                    .setDuration(Toaster.LENGTH_LONG)
                    .setStatus(ERROR)
                    .show();

        }
    }
}