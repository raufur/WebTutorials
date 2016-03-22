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

public class GuideFragment
        extends Fragment
        implements OnItemClickListener {
    String[] listValue = {"Web home.html", "Web Basic Concepts.html", "Web How it works.html", "Web Browser Types.html", "Web Server Types.html", "Web Site Advantages.html", "Web Skills Required.html", "Web Tools Required.html", "Web Domain Names.html", "Web Site Construction.html", "Web Hosting Concepts.html", "Web Ecommerce Hosting.html", "Web Site Backup.html", "Web Site Statistics.html", "Web Site Popularity.html", "Web Free Graphics.html"};
    ListView listView;

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_guide, paramViewGroup, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Developer Guide");

        this.listView = ((ListView) localView.findViewById(R.id.listViewGuide));
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

