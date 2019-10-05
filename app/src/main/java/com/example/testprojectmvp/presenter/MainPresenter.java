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

    @SuppressLint("StaticFieldLeak")
    public MainPresenter() {
        new AsyncTask<Void, Integer, Void>() {

            @Override
            protected void onPreExecute() {
                getViewState().showTimer();
            }

            @Override
            protected Void doInBackground(Void... voids) {
                for (int i = 10; i > 0; i--) {
                    progressUpdate(i);
                    sleepSeoond();
                }
                return null;
            }

            private void progressUpdate(int i) {
                onProgressUpdate(i);
            }

            private void sleepSeoond() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            @Override
            protected void onProgressUpdate(Integer... values) {
                getViewState().updateTimer(values[0]);
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                getViewState().hideTimer();
            }
        }.execute();
    }
}
