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


public class MySQLFragment
        extends Fragment
        implements OnItemClickListener {
    String[] listValue = {"MYSQL Home.html", "MySQL Introduction.html", "MySQL Installation Linux and Windows.html", "MySQL Administration.html", "MySQL PHP Syntax.html", "MySQL Connection.html", "MySQL Selecting Database.html", "MySQL Data Types.html", "MySQL Create Tables.html", "MySQL Drop Tables.html", "MySQL INSERT Query.html", "MySQL SELECT Query.html", "MySQL WHERE Clause.html", "MySQL UPDATE Query.html", "MySQL DELETE Query.html", "MySQL LIKE Clause.html", "MySQL Sorting Results.html", "MySQL Using Joins.html", "MySQL Handling NULL Values.html", "MySQL Regexps.html", "MySQL Transactions.html", "MySQL ALTER Command.html", "MySQL INDEXES.html", "MySQL Temporary Tables.html", "MySQL Clone Tables.html", "MySQL Database Info.html", "MySQL Using Sequences.html", "MySQL Handling Duplicates.html", "MySQL and SQL Injection.html", "MySQL Database Export.html", "MySQL Database Import.html"};
    ListView listView;

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_mysql, paramViewGroup, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("MySQL");

        this.listView = ((ListView) localView.findViewById(R.id.listViewMysql));
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

