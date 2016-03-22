package com.epsilon.coders.webtutorials.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import com.epsilon.coders.webtutorials.ActivityTutorialView;
import com.epsilon.coders.webtutorials.MainActivity;
import com.epsilon.coders.webtutorials.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AjaxFragment extends Fragment implements OnItemClickListener{
    String[] listValue = { "AJAX Quick Guide.html", "AJAX Useful Resources.html", "AJAX Tutorial.html", "AJAX What is AJAX.html", "AJAX Technologies.html", "AJAX Examples.html", "AJAX Browser Support.html", "AJAX Action.html", "AJAX XMLHttpRequest.html", "AJAX Database Operations.html", "AJAX Security.html", "AJAX Issues.html" };
    ListView listView;

    public AjaxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View localView = inflater.inflate(R.layout.fragment_ajax, container, false);
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Ajax");
        this.listView = ((ListView)localView.findViewById(R.id.listViewAjax));
        this.listView.setOnItemClickListener(this);

        return localView;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent localIntent = new Intent(getActivity(), ActivityTutorialView.class);
        localIntent.putExtra("listValue", this.listValue[position]);
        startActivityForResult(localIntent,0);
        getActivity().overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
    }
}
