package com.example.king_sk.getmeme;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class bottomfragment extends Fragment {

    public static TextView editText2;
    public static TextView editText;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container, false);
        editText2 = (TextView) view.findViewById(R.id.editText2);
        editText = (TextView) view.findViewById(R.id.editText);

        return view;
    }

    public  void setMemeText(String top, String bottom){
        editText2.setText(top);
        editText.setText(bottom);
    }
}
