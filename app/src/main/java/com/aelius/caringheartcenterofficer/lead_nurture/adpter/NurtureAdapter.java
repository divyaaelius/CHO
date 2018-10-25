package com.aelius.caringheartcenterofficer.lead_nurture.adpter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aelius.caringheartcenterofficer.R;
import com.aelius.caringheartcenterofficer.lead_nurture.fragment.NurtureListFragment;

import java.util.List;

public class NurtureAdapter extends RecyclerView.Adapter<NurtureAdapter.MyViewHolder> {

    Context context;
    int previousExpandedPosition = -1;
    int mExpandedPosition = -1;
    NurtureListFragment fragment;

    @NonNull
    @Override
    public NurtureAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_list_nurture, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NurtureAdapter.MyViewHolder holder, final int position) {
        // expand and collapas
        final boolean isExpanded = position == mExpandedPosition;

        holder.child_nurturelist_layout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
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

        LinearLayout parent_nurturelist_layout,child_nurturelist_layout;
        TextView tv_nur_cener_nm,tv_nur_mode,tv_nur_discused,tv_nur_action_req,tv_nur_appoi_next,tv_nur_appoi_purpos,
        tv_nur_hist,tv_nur_edit,tv_nur_delete;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            parent_nurturelist_layout=itemView.findViewById(R.id.parent_nurturelist_layout);
            child_nurturelist_layout=itemView.findViewById(R.id.child_nurturelist_layout);
            tv_nur_delete=itemView.findViewById(R.id.tv_nur_delete);
            tv_nur_edit=itemView.findViewById(R.id.tv_nur_edit);
            tv_nur_hist=itemView.findViewById(R.id.tv_nur_hist);
            tv_nur_cener_nm=itemView.findViewById(R.id.tv_nur_cener_nm);
            tv_nur_mode=itemView.findViewById(R.id.tv_nur_mode);
            tv_nur_discused=itemView.findViewById(R.id.tv_nur_discused);
            tv_nur_action_req=itemView.findViewById(R.id.tv_nur_action_req);
            tv_nur_appoi_next=itemView.findViewById(R.id.tv_nur_appoi_next);
            tv_nur_appoi_purpos=itemView.findViewById(R.id.tv_nur_appoi_purpos);

        }
    }
}
