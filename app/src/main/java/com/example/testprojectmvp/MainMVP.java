package com.example.testprojectmvp;

public interface MainMVP {
    interface View{
        void showImage(String bitmap);
    }
    interface Presenter{
        void clickButton();
    }
    interface Model{
        String loadMessage();
    }
}
