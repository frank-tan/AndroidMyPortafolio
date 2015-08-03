package com.franktan.androidportfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Frank Tan on 22/07/2015.
 */
public class SliderPageFragment extends Fragment {
    String title;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int mNum = getArguments() != null ? getArguments().getInt("num") : 1;
        switch (mNum){
            case 0:
                title = "Responsive Web Apps";
                break;
            case 1:
                title = "Server Side Development";
                break;
            case 2:
                title = "Native Android Apps";
                break;
            case 3:
                title = "Native iOS Apps";
                break;
            case 4:
                title = "HTML Mobile Apps";
                break;
            default:
                title = "and More...";
                break;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.slider_page, container, false);

        TextView textView = (TextView) rootView.findViewById(R.id.sliderTextView);
        textView.setText(title);

        return rootView;
    }
}
