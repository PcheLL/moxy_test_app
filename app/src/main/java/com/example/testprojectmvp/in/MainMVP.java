package com.example.testprojectmvp.in;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface MainMVP{
    @StateStrategyType(value = AddToEndStrategy.class)
    interface View extends MvpView {
        void updateTimer(int second);
        void showTimer();
        void hideTimer();
    }

    interface Model{
        String loadMessage();
    }
}
