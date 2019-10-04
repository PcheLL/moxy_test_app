package com.example.testprojectmvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.testprojectmvp.in.MainMVP;
import com.example.testprojectmvp.presenter.MainPresenter;
import com.example.testprojectmvp.R;

import moxy.MvpDelegate;
import moxy.presenter.InjectPresenter;


public class MainActivity extends AppCompatActivity implements MainMVP.View, View.OnClickListener {
   // MainMVP.Presenter mPresenter;
    TextView imageView;
    Button button;
    @InjectPresenter
    MainPresenter mPresenter;
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
    public void showMessage(String bitmap) {
        imageView.setText(bitmap);
    }

}
