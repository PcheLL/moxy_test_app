package com.example.testprojectmvp.in;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface MainMVP{
    @StateStrategyType(value = AddToEndStrategy.class)
    interface View extends MvpView {
        void showMessage(int second);
    }
    /*interface Presenter{
        void clickButton();
    }*/
    interface Model{
        String loadMessage();
    }
}
