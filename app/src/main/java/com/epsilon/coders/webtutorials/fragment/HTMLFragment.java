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


public class HTMLFragment
        extends Fragment
        implements OnItemClickListener {
    String[] listValue = {"HTML Quick Reference Guide.html", "HTML Useful Resources.html", "HTML Home.html", "HTML Overview.html", "HTML Basic Tags.html", "HTML Elements.html", "HTML Attributes.html", "HTML Formatting.html", "HTML Phrase Tags.html", "HTML Meta Tags.html", "HTML Comments.html", "HTML Images.html", "HTML Tables.html", "HTML Lists.html", "HTML Text Links.html", "HTML Image Links.html", "HTML Email Links.html", "HTML Frames.html", "HTML Iframes.html", "HTML Blocks.html", "HTML Backgrounds.html", "HTML Colors.html", "HTML Fonts.html", "HTML Forms.html", "HTML Embed Multimedia.html", "HTML Marquees.html", "HTML Header.html", "HTML Style Sheet.html", "HTML JavaScript.html", "HTML Layouts.html", "HTML Tag Reference.html", "HTML Attribute Reference.html", "HTML Events Reference.html", "HTML Fonts Reference.html", "HTML ASCII Codes.html", "HTML Color Names.html", "HTML Entities.html", "MIME Media Types.html", "HTML URL Encoding.html", "HTML Character Encodings.html", "HTML Deprecated Tags.html"};
    ListView listView;

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_html, paramViewGroup, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("HTML");

        this.listView = ((ListView) localView.findViewById(R.id.listViewHtml));
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

