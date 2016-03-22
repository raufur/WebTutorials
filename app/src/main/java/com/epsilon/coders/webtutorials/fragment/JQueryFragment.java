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

public class JQueryFragment
        extends Fragment
        implements OnItemClickListener {
    String[] listValue = {"jQuery Quick Guide.html", "jQuery Utilities.html", "jQuery Plugins.html", "JQuery Home.html", "jQuery Overview.html", "jQuery Basics.html", "jQuery Selectors.html", "jQuery DOM Attributes.html", "jQuery DOM Traversing.html", "jQuery CSS Methods.html", "jQuery DOM Manipulation Methods.html", "jQuery Events Handling.html", "jQuery AJAX.html", "jQuery Effects.html"};
    ListView listView;

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_jquery, paramViewGroup, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("JQuery");

        this.listView = ((ListView) localView.findViewById(R.id.listViewJquery));
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


