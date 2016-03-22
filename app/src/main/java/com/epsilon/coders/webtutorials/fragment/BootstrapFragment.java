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


public class BootstrapFragment
        extends Fragment
        implements OnItemClickListener {
    String[] listValue = {"Bootstrap Tutorial.html", "Bootstrap Overview.html", "Bootstrap Environment Setup.html", "Bootstrap Grid System.html", "Bootstrap CSS Overview.html", "Bootstrap Typography.html", "Bootstrap Code.html", "Bootstrap Tables.html", "Bootstrap Forms.html", "Bootstrap Buttons.html", "Bootstrap Images.html", "Bootstrap Helper Classes.html", "Bootstrap Responsive utilities.html", "Bootstrap Glyphicons.html", "Bootstrap Dropdowns.html", "Bootstrap Button Groups.html", "Bootstrap Button Dropdowns.html", "Bootstrap Input Groups.html", "Bootstrap Navigation Elements.html", "Bootstrap Navbar.html", "Bootstrap Breadcrumb.html", "Bootstrap Pagination.html", "Bootstrap Labels.html", "Bootstrap Badges.html", "Bootstrap Jumbotron.html", "Bootstrap Page Header.html", "Bootstrap Thumbnails.html", "Bootstrap Alerts.html", "Bootstrap Progress Bars.html", "Bootstrap Media Object.html", "Bootstrap List Group.html", "Bootstrap Panels.html", "Bootstrap Wells.html", "Bootstrap Plugins Overview.html", "Bootstrap Transition Plugin.html", "Bootstrap Modal Plugin.html", "Bootstrap Dropdown Plugin.html", "Bootstrap Scrollspy Plugin.html", "Bootstrap Tab Plugin.html", "Bootstrap Tooltip Plugin.html", "Bootstrap Popover Plugin.html", "Bootstrap Alert Plugin.html", "Bootstrap Button Plugin.html", "Bootstrap Collapse Plugin.html", "Bootstrap Carousel Plugin.html", "Bootstrap Affix Plugin.html"};
    ListView listView;

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_bootstrap, paramViewGroup, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Bootstrap");

        this.listView = ((ListView) localView.findViewById(R.id.listViewBootstrap));
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