package com.example.testprojectmvp.presenter;

import android.annotation.SuppressLint;
import android.os.AsyncTask;

import com.example.testprojectmvp.in.MainMVP;
import com.example.testprojectmvp.model.MainModel;
import com.example.testprojectmvp.view.MainActivity;

import java.util.concurrent.TimeUnit;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainMVP.View> {

    private MainMVP.View mView;
    private MainMVP.Model mModel;
    private int cl;

    public MainPresenter(){
        getViewState().showMessage(cl);
    }

    public void clickButton() {
        cl++;
        getViewState().showMessage(cl);
    }
}
