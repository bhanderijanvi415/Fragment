package com.example.fragment;

import android.content.Context;
import android.icu.text.Transliterator;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DynamicFragment extends Fragment {
      int ab;
    ArrayList<String> arrayList;

    public static DynamicFragment newInstance(  ) {
        return new DynamicFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dynamic, container, false);
        initViews(view);
        return view;

    }

    private void initViews(View view) {
        TextView textView = view.findViewById(R.id.commonTextView);
         ab = getArguments().getInt("position");
        arrayList = getArguments().getStringArrayList("arrayList");
        if (ab==arrayList.size()){
            textView.setText(arrayList.get(0));
        }else
        {
            textView.setText(arrayList.get(ab));
        }
//        textView.setText(""+getArguments().getStringArrayList("arrayList"). getArguments().getInt("position"));

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}