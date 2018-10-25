package com.aelius.caringheartcenterofficer.presentationmodule.presfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aelius.caringheartcenterofficer.R;
import com.aelius.caringheartcenterofficer.presentationmodule.presadapter.PreviousCommentAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class PreviousCommentFragment extends Fragment {


    private SwipeRefreshLayout swpContainer;
    private RecyclerView recPrevComment;
    PreviousCommentAdapter adtPrevComment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_previous_comment, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        swpContainer = (SwipeRefreshLayout) view.findViewById(R.id.swp_container);
        recPrevComment = (RecyclerView) view.findViewById(R.id.rec_prev_comment);
        AdapaterSetUp();
    }

    private void AdapaterSetUp() {
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recPrevComment.setLayoutManager(mLayoutManager);
        recPrevComment.setItemAnimator(new DefaultItemAnimator());
        adtPrevComment = new PreviousCommentAdapter(getActivity());
        recPrevComment.setAdapter(adtPrevComment);
        adtPrevComment.notifyDataSetChanged();
    }
}
