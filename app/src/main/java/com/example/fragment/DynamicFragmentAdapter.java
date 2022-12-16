package com.example.fragment;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class DynamicFragmentAdapter extends FragmentPagerAdapter {
    private static int mNumOfTabs ;
    ArrayList<String> arrayList;
    int i = 0;

    public DynamicFragmentAdapter(@NonNull FragmentManager fm, int NumOfTabs, ArrayList<String> arrayList) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        this.arrayList = arrayList;
    }

    @NonNull  @Override
    public Fragment getItem(int position) {
        // arrayList.get(0);
        Bundle b = new Bundle();
        b.putInt("position",position-1);
        Log.d("1235", "getItem: ------------------>"+position);
        if (position==arrayList.size()){
            arrayList.get(0);
        }else
        {
            arrayList.get(position);
        }
        b.putStringArrayList("arrayList",arrayList);
        Fragment frag =DynamicFragment.newInstance();
        frag.setArguments(b);
        return frag;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
