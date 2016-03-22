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

public class CSSFragment
        extends Fragment
        implements OnItemClickListener {
    String[] listValue = {"CSS Reference Guide.html", "CSS Color References.html", "CSS Home.html", "CSS Introduction.html", "CSS Syntax Selectors.html", "CSS Inclusion.html", "CSS Measurement Units.html", "CSS Colors.html", "CSS Backgrounds.html", "CSS Fonts.html", "CSS Text.html", "CSS Images.html", "CSS Links.html", "CSS Tables.html", "CSS Borders.html", "CSS Margins.html", "CSS Lists.html", "CSS Paddings.html", "CSS Cursors.html", "CSS Outlines.html", "CSS Dimension.html", "CSS Scrollbars.html", "CSS Visibility.html", "CSS Positioning.html", "CSS Layers.html", "CSS Pseudo Classes.html", "CSS Pseudo Elements.html", "CSS @Rules.html", "CSS Filters Text and Image Effects.html", "CSS Media Types.html", "CSS Paged Media.html", "CSS Aural Media.html", "CSS Printing.html", "CSS Layouts.html", "CSS Validations.html"};
    ListView listView;

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_css, paramViewGroup, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("CSS");

        this.listView = ((ListView) localView.findViewById(R.id.listViewCss));
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

