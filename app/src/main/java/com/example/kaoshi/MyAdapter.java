package com.example.kaoshi;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 你瞅啥 on 2017/10/13.
 */
public class MyAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> list;
    public MyAdapter(FragmentManager fm,ArrayList<Fragment> list) {

        super(fm);
      this.list=list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
