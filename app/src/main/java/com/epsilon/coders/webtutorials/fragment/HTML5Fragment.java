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


public class HTML5Fragment
        extends Fragment
        implements OnItemClickListener {
    String[] listValue = {"HTML5 Home.html", "HTML5 Overview.html", "HTML5 Syntax.html", "HTML5 Attributes.html", "HTML5 Events.html", "HTML5 Web Forms 2.0.html", "HTML5 SVG Tutorial.html", "HTML5 MathML Tutorial.html", "HTML5 Web Storage.html", "HTML5 Web SQL Database.html", "HTML5 Server Sent Events.html", "HTML5 WebSockets Tutorial.html", "HTML5 Canvas.html", "HTML5 Audio and Video.html", "HTML5 Geolocation.html", "HTML5 Microdata.html", "HTML5 Drag and drop.html", "HTML5 Web Workers.html", "HTML5 Tags Reference.html", "HTML5 Deprecated Tags and Attributes.html", "HTML5 New Tags.html"};
    ListView listView;

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_html5, paramViewGroup, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("HTML5");

        this.listView = ((ListView) localView.findViewById(R.id.listViewHtml5));
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

