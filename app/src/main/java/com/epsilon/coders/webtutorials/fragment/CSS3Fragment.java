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

public class CSS3Fragment
        extends Fragment
        implements OnItemClickListener {
    String[] listValue = {"CSS3 Introduction.html", "CSS3 Borders.html", "CSS3 Backgrounds.html", "CSS3 Gradients.html", "CSS3 Text Effects.html", "CSS3 Web Fonts.html", "CSS3 2D Transforms.html", "CSS3 3D Transforms.html", "CSS3 Transitions.html", "CSS3 Animations.html", "CSS3 Multiple Columns.html", "CSS3 User Interface.html", "CSS3 Responsive Web Design.html"};
    ListView listView;

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_css3, paramViewGroup, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("CSS3");

        this.listView = ((ListView) localView.findViewById(R.id.listViewCss3));
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

