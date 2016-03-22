package com.epsilon.coders.webtutorials.fragment;

import android.content.Intent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;

import com.epsilon.coders.webtutorials.ActivityTutorialView;
import com.epsilon.coders.webtutorials.MainActivity;
import com.epsilon.coders.webtutorials.R;


public class AngularJSFragment
        extends Fragment
        implements OnItemClickListener {
    String[] listValue = {"AngularJS Tutorial.html", "AngularJS Overview.html", "AngularJS Environment Setup.html", "AngularJS MVC Architecture.html", "AngularJS First Application.html", "AngularJS Directives.html", "AngularJS Expressions.html", "AngularJS Controllers.html", "AngularJS Filters.html", "AngularJS Tables.html", "AngularJS HTML DOM.html", "AngularJS Modules.html", "AngularJS Forms.html", "AngularJS Includes.html", "AngularJS Ajax.html", "AngularJS Views.html", "AngularJS Scopes.html", "AngularJS Services.html", "AngularJS Dependency Injection.html", "AngularJS Custom Directives.html", "AngularJS Internalization.html", "AngularJS Quick Guide.html", "AngularJS Useful Resources.html"};
    ListView listView;

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_angularjs, paramViewGroup, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("AngularJS");


        this.listView = ((ListView) localView.findViewById(R.id.listViewAngularjs));
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

