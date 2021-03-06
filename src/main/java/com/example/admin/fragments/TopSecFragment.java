package com.example.admin.fragments;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class TopSecFragment extends Fragment
{
    private static EditText toptext;
    private static EditText bottomtext;

    TopSectionListener activitycommander;

    public interface TopSectionListener
    {
        public void creatememe(String top,String bottom);
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            activitycommander = (TopSectionListener)activity;
        }
        catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.top_section_fragment,container,false);

        toptext = (EditText) view.findViewById(R.id.toptext);
        bottomtext = (EditText) view.findViewById(R.id.bottomtext);
        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                buttonClicked(v);
            }
        });
        return view;
    }

    public void buttonClicked(View view)
    {
        activitycommander.creatememe(toptext.getText().toString(),bottomtext.getText().toString());
    }
}














