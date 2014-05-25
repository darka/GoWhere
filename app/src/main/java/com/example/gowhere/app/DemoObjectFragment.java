package com.example.gowhere.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Darius on 25/05/2014.
 */

// Instances of this class are fragments representing a single
// object in our collection.
public class DemoObjectFragment extends Fragment {
    public static final String ARG_OBJECT = "object";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.
        View rootView = inflater.inflate(
                R.layout.shark_cat, container, false);
        //Bundle args = getArguments();
        //((TextView) rootView.findViewById(android.R.id.shark_cat)).setText(Integer.toString(args.getInt(ARG_OBJECT)));
        return rootView;
    }
}