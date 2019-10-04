package com.example.testprojectmvp.presenter;

import com.example.testprojectmvp.in.MainMVP;
import com.example.testprojectmvp.model.MainModel;
import com.example.testprojectmvp.view.MainActivity;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainMVP.View> {

    private MainMVP.View mView;
    private MainMVP.Model mModel;

    public MainPresenter(MainActivity mainActivity) {
        this.mView = mainActivity;
        this.mModel = new MainModel();
    }

    public void clickButton() {
        getViewState().showMessage(mModel.loadMessage());
    }
}
