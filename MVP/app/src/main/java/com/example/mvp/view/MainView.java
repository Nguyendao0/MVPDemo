package com.example.mvp.view;

import com.example.mvp.model.entity.Demo;

import java.util.List;

// lớp MainView hiển thị dữ liệu

public interface MainView {
    void displayMain(List<Demo> listDemo);
}
