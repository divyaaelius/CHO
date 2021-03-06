package com.aelius.caringheartcenterofficer.register_chs.adpter;

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

public class ViewCHSAdapter extends RecyclerView.Adapter<ViewCHSAdapter.MyViewHolder> {

    Context context;
    int previousExpandedPosition = -1;
    int mExpandedPosition = -1;
    NurtureListFragment fragment;

    @NonNull
    @Override
    public ViewCHSAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_list_viewchs, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewCHSAdapter.MyViewHolder holder, final int position) {
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
        TextView tv_viewchs_led,tv_viewchs_uni_id,tv_viewchs_chs_nm,tv_viewchs_add,tv_viewchs_country,
                tv_viewchs_state,tv_viewchs_city,tv_viewchs_mno,tv_viewchs_hist,tv_viewchs_edit,
                tv_viewchs_delete,tv_viewchs_view;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            parent_chsview_layout=itemView.findViewById(R.id.parent_chsview_layout);
            child_chsview_layout=itemView.findViewById(R.id.child_chsview_layout);
            tv_viewchs_led=itemView.findViewById(R.id.tv_viewchs_led);
            tv_viewchs_uni_id=itemView.findViewById(R.id.tv_viewchs_uni_id);
            tv_viewchs_chs_nm=itemView.findViewById(R.id.tv_viewchs_chs_nm);
            tv_viewchs_add=itemView.findViewById(R.id.tv_viewchs_add);
            tv_viewchs_country=itemView.findViewById(R.id.tv_viewchs_country);
            tv_viewchs_state=itemView.findViewById(R.id.tv_viewchs_state);
            tv_viewchs_city=itemView.findViewById(R.id.tv_viewchs_city);
            tv_viewchs_mno=itemView.findViewById(R.id.tv_viewchs_mno);
            tv_viewchs_hist=itemView.findViewById(R.id.tv_viewchs_hist);
            tv_viewchs_edit=itemView.findViewById(R.id.tv_viewchs_edit);
            tv_viewchs_delete=itemView.findViewById(R.id.tv_viewchs_delete);
            tv_viewchs_view=itemView.findViewById(R.id.tv_viewchs_view);
        }
    }
}
