package com.aelius.caringheartcenterofficer.lead_nurture.fragment;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class NurtureListFragment extends Fragment {

    RecyclerView recyclerView;
    NurtureAdapter adapter;

    public NurtureListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_nurture_list, container, false);

        init(v);

        AdapterCalling();

        return v;
    }

    private void AdapterCalling() {

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new NurtureAdapter();
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void init(View v) {
    recyclerView=v.findViewById(R.id.list_rec_nurture);
    }

}
