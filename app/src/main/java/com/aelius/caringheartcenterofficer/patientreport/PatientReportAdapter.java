package com.aelius.caringheartcenterofficer.patientreport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aelius.caringheartcenterofficer.R;


public class PatientReportAdapter extends RecyclerView.Adapter<PatientReportAdapter.MyViewHolder> {
    Context context;
    int previousExpandedPosition = -1;
    int mExpandedPosition = -1;

    public PatientReportAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_patient_report, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        //list

        // expand and collapas
        final boolean isExpanded = position == mExpandedPosition;

        holder.child_paihis_layout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
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
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        LinearLayout child_paihis_layout, parent_paihis_layout;
        TextView tv_patient_name, tv_phy_comment, tv_details;

        public MyViewHolder(View itemView) {
            super(itemView);
            child_paihis_layout = itemView.findViewById(R.id.child_paihis_layout);
            parent_paihis_layout = itemView.findViewById(R.id.parent_paihis_layout);
            tv_patient_name = itemView.findViewById(R.id.tv_patient_name);
            tv_phy_comment = itemView.findViewById(R.id.tv_phy_comment);
            tv_details = itemView.findViewById(R.id.tv_details);


        }
    }


}
