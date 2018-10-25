package com.aelius.caringheartcenterofficer.register_chs.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aelius.caringheartcenterofficer.R;
import com.aelius.caringheartcenterofficer.lead_nurture.adpter.NurtureAdapter;
import com.aelius.caringheartcenterofficer.register_chs.adpter.ViewCHSAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViewCHSFragment extends Fragment {

    RecyclerView recyclerView;
    ViewCHSAdapter adapter;
    public ViewCHSFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_view_ch, container, false);


        init(v);

        AdapterCalling();

        return v;
    }

    private void AdapterCalling() {
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new ViewCHSAdapter();
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void init(View v) {

        recyclerView=v.findViewById(R.id.list_rec_regchs);
    }

}
