package com.example.testprojectmvp.Presenter;

import android.graphics.Bitmap;

import com.example.testprojectmvp.MainMVP;
import com.example.testprojectmvp.Model.MainModel;
import com.example.testprojectmvp.View.MainActivity;


public class MainPresenter implements MainMVP.Presenter {

    private MainMVP.View mView;
    private MainMVP.Model mModel;

    public MainPresenter(MainActivity mainActivity) {
        this.mView = mainActivity;
        this.mModel = new MainModel();
    }

    @Override
    public void clickButton() {
        mView.showImage(mModel.loadMessage());

    }
}
