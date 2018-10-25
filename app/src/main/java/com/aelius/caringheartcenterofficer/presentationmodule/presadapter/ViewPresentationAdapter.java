package com.aelius.caringheartcenterofficer.presentationmodule.presadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.aelius.caringheartcenterofficer.R;
import com.aelius.caringheartcenterofficer.lead_nurture.fragment.NurtureListFragment;

public class ViewPresentationAdapter extends RecyclerView.Adapter<ViewPresentationAdapter.MyViewHolder> {

    Context context;
    int previousExpandedPosition = -1;
    int mExpandedPosition = -1;
    NurtureListFragment fragment;

    @NonNull
    @Override
    public ViewPresentationAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_presentation_view, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPresentationAdapter.MyViewHolder holder, final int position) {
        // expand and collapas
        final boolean isExpanded = position == mExpandedPosition;

        holder.child_chsview_layout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
        holder.itemView.setActivated(isExpanded);

        if (isExpanded)
            previousExpandedPosition = position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExpandedPosition = isExpanded ? -1 : position;
                notifyItemChanged(previousExpandedPosition);
                notifyItemChanged(position);

            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        LinearLayout parent_chsview_layout,child_chsview_layout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            parent_chsview_layout=itemView.findViewById(R.id.parent_presenation);
            child_chsview_layout=itemView.findViewById(R.id.child_presentation);
        }
    }
}
