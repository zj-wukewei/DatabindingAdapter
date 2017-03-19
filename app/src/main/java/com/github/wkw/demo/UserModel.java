package com.github.wkw.demo;

import com.github.wkw.recyclerview.LayoutResId;

/**
 * Created by wukewei on 17/3/19.
 * Email zjwkw1992@163.com
 * GitHub https://github.com/zj-wukewei
 */

public class UserModel implements LayoutResId {

    private String name;
    private String avater;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAvater() {
        return avater;
    }


    public void setAvater(String avater) {
        this.avater = avater;
    }


    @Override
    public int getLayoutRes() {
        return R.layout.layout_item;
    }

}
