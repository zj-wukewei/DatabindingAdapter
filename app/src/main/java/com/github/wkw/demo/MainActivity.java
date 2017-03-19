package com.github.wkw.demo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import com.github.wkw.demo.databinding.ActivityMainBinding;
import com.github.wkw.recyclerview.LayoutResId;
import com.github.wkw.recyclerview.SuperAdapter;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    List<LayoutResId> mDatas = new ArrayList<>();
    SuperAdapter<LayoutResId> mAdapter;
    SuperAdapter<UserModel> mSingleTypeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initView();
        initData();
    }


    private void initData() {

    }


    private void initView() {

        for (int i = 0; i < 20; i++) {
            UserModel user = new UserModel();
            user.setName("wukewei");
            user.setAvater("wukewei lover");
            ImageModel image = new ImageModel();
            image.setName("1111111");
            image.setAvater("22222222222");
            mDatas.add(image);
            mDatas.add(user);
        }
        mAdapter = new SuperAdapter<>(this);
        mSingleTypeAdapter = new SuperAdapter<>(this);
        mAdapter.addAll(mDatas);
        mBinding.rv.setLayoutManager(new LinearLayoutManager(this));
        mBinding.rv.setAdapter(mAdapter);

    }

}
