package com.epsilon.coders.webtutorials.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.epsilon.coders.webtutorials.ActivityTutorialView;
import com.epsilon.coders.webtutorials.MainActivity;
import com.epsilon.coders.webtutorials.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class PHPFragment
        extends Fragment
        implements AdapterView.OnItemClickListener
{
    FloatingActionButton fab;
    String[] listValue = { "PHP Home.html", "PHP Introduction.html", "PHP Environment Setup.html", "PHP Syntax Overview.html", "PHP Variable Types.html", "PHP Constants.html", "PHP Operator Types.html", "PHP Decision Making.html", "PHP Loop Types.html", "PHP Arrays.html", "PHP Strings.html", "PHP Web Concepts.html", "PHP GET and POST Methods.html", "PHP File Inclusion.html", "PHP Files and IO.html", "PHP Functions.html", "PHP Cookies.html", "PHP Sessions.html", "PHP Sending Email.html", "PHP File Uploading.html", "PHP Coding Standard.html", "PHP Predefined Variables.html", "PHP Regular Expressions.html", "PHP Error and Exception Handling.html", "PHP Bugs Debugging.html", "PHP Date and Time.html", "PHP and MySQL Tutorial.html", "PHP and AJAX.html", "PHP and XML.html", "PHP Object Oriented Programming in PHP.html", "PHP for C Developers.html", "PHP for PERL Developers.html" };
    ListView listView;

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_php, paramViewGroup, false);
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("PHP");
        this.listView = ((ListView)localView.findViewById(R.id.listViewPhp));
        this.listView.setOnItemClickListener(this);
        return localView;
    }

    public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
    {
        Intent localIntent = new Intent(getActivity(), ActivityTutorialView.class);
        localIntent.putExtra("listValue", this.listValue[paramInt]);
        startActivityForResult(localIntent, 0);
        getActivity().overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
    }
}
