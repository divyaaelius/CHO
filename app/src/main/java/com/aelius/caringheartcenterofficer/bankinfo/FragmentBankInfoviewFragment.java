package com.aelius.caringheartcenterofficer.bankinfo;

import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import com.aelius.caringheartcenterofficer.R;

import java.util.List;

public class FragmentBankInfoviewFragment extends Fragment  {

    private SwipeRefreshLayout swpContainer;
    private RecyclerView recBankinfo;
    BankInfoAdapter bankAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bank_infoview, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        swpContainer = (SwipeRefreshLayout) view.findViewById(R.id.swp_container);
        recBankinfo = (RecyclerView) view.findViewById(R.id.rec_bankinfo);
        AdapaterSetUp();
    }

    private void AdapaterSetUp() {
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recBankinfo.setLayoutManager(mLayoutManager);
        recBankinfo.setItemAnimator(new DefaultItemAnimator());
        bankAdapter = new BankInfoAdapter(getActivity());
        recBankinfo.setAdapter(bankAdapter);
        bankAdapter.notifyDataSetChanged();
    }
}
