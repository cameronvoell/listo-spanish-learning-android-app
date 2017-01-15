package com.cameronvoell.listo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cameronvoell.listo.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    private TextView mNumberWordsSavedView;
    private TextView mNumberScheduledView;

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home, container, false);

//        mNumberWordsSavedView = (TextView)v.findViewById(R.id.words_saved);
//        mNumberWordsSavedView.setText("0 words have been saved");
//
//        mNumberScheduledView = (TextView)v.findViewById(R.id.words_scheduled);

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        //DatabaseHelper helper = new DatabaseHelper(getContext());
        int num = 0;//helper.getNumWordsSaved();

        String text = "<font color=#C84C42>" + num + "</font> <font color=#333333> words saved today</font>";
//        mNumberWordsSavedView.setText(Html.fromHtml(text));

        String text2 = "<font color=#C84C42>  30</font> <font color=#333333> words awaiting review</font>";
 //       mNumberScheduledView.setText(Html.fromHtml(text2));

    }

//    @Override
//    public void onClick(View v) {
//        startActivity(new Intent(getContext(), CaptureWordActivity.class));
//    }
}
