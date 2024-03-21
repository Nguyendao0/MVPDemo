package com.example.mvp.presenter;

import com.example.mvp.model.LoadDemoListener;
import com.example.mvp.model.UserInterator;
import com.example.mvp.model.entity.Demo;
import com.example.mvp.view.MainView;

import java.util.List;

// MainPresenter.java lớp này dùng để xử lý các logic, nhận dữ liệu từ lớp model thông qua các hàm callback,
// nhiệm vụ đẩy lên View hướng dẫn cách View hiển thị:


public class MainPresenter implements LoadDemoListener {
    private UserInterator mainInterator;
    private MainView mainView;
    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        mainInterator = new UserInterator(this);
    }

    public void loadData() {
        mainInterator.createListData();
    }

    @Override
    public void onLoadDemoSuccess(List<Demo> listDemo) {
        mainView.displayMain(listDemo);
    }

    @Override
    public void onLoadDemoFailure(String message) {
        //Làm gì đó nếu xảy ra lỗi.
    }
}
