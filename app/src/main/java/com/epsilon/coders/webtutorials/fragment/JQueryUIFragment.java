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

public class JQueryUIFragment
        extends Fragment
        implements OnItemClickListener {
    String[] listValue = {"JqueryUI Quick Guide.html", "JqueryUI Useful Resources.html", "JqueryUI Tutorial.html", "JqueryUI Overview.html", "JqueryUI Environment Setup.html", "JqueryUI Draggable.html", "JqueryUI Droppable.html", "JqueryUI Resizable.html", "JqueryUI Selectable.html", "JqueryUI Sortable.html", "JqueryUI Accordion.html", "JqueryUI Autocomplete.html", "JqueryUI Button.html", "JqueryUI Datepicker.html", "JqueryUI Dialog.html", "JqueryUI Menu.html", "JqueryUI Progressbar.html", "JqueryUI Slider.html", "JqueryUI Spinner.html", "JqueryUI Tabs.html", "JqueryUI Tooltip.html", "JqueryUI Add Class.html", "JqueryUI Color Animation.html", "JqueryUI Effect.html", "JqueryUI Hide.html", "JqueryUI Remove Class.html", "JqueryUI Show.html", "JqueryUI Switch Class.html", "JqueryUI Toggle.html", "JqueryUI Toggle Class.html", "JqueryUI Position.html", "JqueryUI Widget Factory.html"};
    ListView listView;

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        View localView = paramLayoutInflater.inflate(R.layout.fragment_jqueryui, paramViewGroup, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("JQueryUI");


        this.listView = ((ListView) localView.findViewById(R.id.listViewJQueryUI));
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

