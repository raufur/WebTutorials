package com.epsilon.coders.webtutorials.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;

import com.epsilon.coders.webtutorials.ActivityTutorialView;
import com.epsilon.coders.webtutorials.MainActivity;
import com.epsilon.coders.webtutorials.R;


public class InterviewsFragment
        extends Fragment
        implements OnItemClickListener {
    String[] listValue = {"iq_php.html", "iq_css.html", "iq_css3.html", "iq_html.html", "iq_html5.html", "iq_javascript.html", "iq_jquery.html", "iq_mysql.html"};
    ListView listView;

    public InterviewsFragment() {
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_interviews, paramViewGroup, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Interview Questions");


        this.listView = ((ListView) localView.findViewById(R.id.listViewInterviews));
        this.listView.setOnItemClickListener(this);
        return localView;
    }

    public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
        Intent localIntent = new Intent(getActivity(), ActivityTutorialView.class);
        localIntent.putExtra("listValue", this.listValue[paramInt]);
        startActivityForResult(localIntent, 0);
        getActivity().overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
    }
}

