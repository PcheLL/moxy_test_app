package com.example.testprojectmvp.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testprojectmvp.MainMVP;
import com.example.testprojectmvp.Presenter.MainPresenter;
import com.example.testprojectmvp.R;


public class MainActivity extends AppCompatActivity implements MainMVP.View, View.OnClickListener {
    MainMVP.Presenter mPresenter;
    TextView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        mPresenter = new MainPresenter(this);
    }

    @Override
    public void onClick(View view) {
        mPresenter.clickButton();
    }

    @Override
    public void showImage(String bitmap) {
        imageView.setText(bitmap);
    }
}
