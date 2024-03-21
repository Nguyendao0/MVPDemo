package com.example.mvp.model;

import com.example.mvp.model.entity.Demo;

import java.util.List;

// interface: LoadDemoListener.java làm callback cho lớp Model


public interface LoadDemoListener {
    void onLoadDemoSuccess(List<Demo> listDemo);
    void onLoadDemoFailure(String message);
}
