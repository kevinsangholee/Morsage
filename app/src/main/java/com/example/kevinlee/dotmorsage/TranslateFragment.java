package com.example.kevinlee.dotmorsage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TranslateFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_translate, container, false);

        return v;
    }

    public static TranslateFragment newInstance() {

       TranslateFragment f = new TranslateFragment();
        return f;
    }

}
