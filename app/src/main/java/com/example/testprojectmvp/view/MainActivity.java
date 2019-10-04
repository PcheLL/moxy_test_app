package com.example.testprojectmvp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.testprojectmvp.in.MainMVP;
import com.example.testprojectmvp.presenter.MainPresenter;
import com.example.testprojectmvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import moxy.MvpActivity;
import moxy.presenter.InjectPresenter;


public class MainActivity extends MvpActivity implements MainMVP.View {
   // MainMVP.Presenter mPresenter;
    @BindView (R.id.textView) TextView textView;
    @BindView (R.id.button) Button button;
    @InjectPresenter
    MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        button.setOnClickListener(v->presenter.clickButton());
    }

    @Override
    public void showMessage(int second) {
        textView.setText(String.valueOf(second));
    }

}
