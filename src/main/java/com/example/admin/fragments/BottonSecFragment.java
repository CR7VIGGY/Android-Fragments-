package com.example.admin.fragments;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottonSecFragment extends Fragment
{
    private static TextView text1,text2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.bottom_sec_fragment,container,false);
        text1 = (TextView) view.findViewById(R.id.text1);
        text2 = (TextView) view.findViewById(R.id.text2);

        return view;
    }

    public void setText(String top,String bottom)
    {
        text1.setText(top);
        text2.setText(bottom);

    }
}
