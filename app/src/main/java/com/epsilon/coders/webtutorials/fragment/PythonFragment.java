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


public class PythonFragment
        extends Fragment
        implements OnItemClickListener {
    String[] listValue = {"Python Home.html", "Python Overview.html", "Python Environment.html", "Python Basic Syntax.html", "Python Variable Types.html", "Python Basic Operators.html", "Python Decision Making.html", "Python Loops.html", "Python Numbers.html", "Python Strings.html", "Python Lists.html", "Python Tuples.html", "Python Dictionary.html", "Python Date.html", "Python Functions.html", "Python Modules.html", "Python Files I.html", "Python Exceptions Handling.html", "Python Object Oriented.html", "Python Regular Expressions.html", "Python CGI Programming.html", "Python MySQL Database Access.html", "Python Network Programming.html", "Python Sending Email using SMTP.html", "Python Multithreaded Programming.html", "Python XML Processing.html", "Python GUI Programming.html", "", "Python Quick Guide.html", "Python Tools Utilities.html", "Python Useful Resources.html"};
    ListView listView;

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_python, paramViewGroup, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Python");

        this.listView = ((ListView) localView.findViewById(R.id.listViewPython));
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

