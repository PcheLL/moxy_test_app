package com.example.testprojectmvp.in;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface MainMVP{
    interface View extends MvpView {
        @StateStrategyType(value = AddToEndStrategy.class)
        void showMessage(String bitmap);
    }
    /*interface Presenter{
        void clickButton();
    }*/
    interface Model{
        String loadMessage();
    }
}
