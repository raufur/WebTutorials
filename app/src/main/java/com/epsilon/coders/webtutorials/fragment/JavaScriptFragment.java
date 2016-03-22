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

public class JavaScriptFragment
        extends Fragment
        implements OnItemClickListener {
    String[] listValue = {"JavaScript Quick Guide.html", "JavaScript Built.html", "Javascript Home.html", "JavaScript Overview.html", "JavaScript Syntax.html", "JavaScript Enabling in Browsers.html", "JavaScript Placement in HTML File.html", "JavaScript Variables and DataTypes.html", "JavaScript Operators.html", "JavaScript if.html", "JavaScript Switch Case.html", "JavaScript while Loops.html", "JavaScript for Loops.html", "JavaScript for in.html", "JavaScript Loop Control.html", "JavaScript Functions.html", "JavaScript Events.html", "JavaScript and Cookies.html", "JavaScript Page Redirection.html", "JavaScript Dialog Boxes.html", "JavaScript Void Keyword.html", "JavaScript Page Printing.html", "JavaScript Objects Overview.html", "JavaScript The Number Object.html", "JavaScript The Boolean Object.html", "JavaScript The String Object.html", "JavaScript The Arrays Object.html", "JavaScript The Date Object.html", "JavaScript The Math Object.html", "JavaScript Regular Expressions and RegExp Object.html", "JavaScript Document Object Model or DOM.html", "JavaScript Errors and Exceptions Handling.html", "JavaScript Validation.html", "JavaScript Animation.html", "JavaScript Multimedia.html", "JavaScript Debugging.html", "JavaScript Image Map.html", "JavaScript Browsers Compatibility.html"};
    ListView listView;

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_javascript, paramViewGroup, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Java Script");

        this.listView = ((ListView) localView.findViewById(R.id.listViewJavaScript));
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


