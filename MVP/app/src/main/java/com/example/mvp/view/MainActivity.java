package com.example.mvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.mvp.R;
import com.example.mvp.model.entity.Demo;
import com.example.mvp.presenter.MainPresenter;

import java.util.List;

//MainActivity.java khởi tạo presenter, tạo sự kiện load dữ liệu, cấu hình hiển thị cho listview.

public class MainActivity extends AppCompatActivity  implements MainView{
    //Presenter
    private MainPresenter mainPresenter;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPresenter();
        Button btnLoad = (Button) findViewById(R.id.btn_load_data);
        listView = (ListView) findViewById(R.id.list_view);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.loadData();
            }
        });
    }

    private void initPresenter() {
        mainPresenter = new MainPresenter(this);
    }

    @Override
    public void displayMain(List<Demo> listDemo) {
        listView.setAdapter(new ArrayAdapter<Demo>(this,android.R.layout.simple_list_item_1,listDemo));
    }
}