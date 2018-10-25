package com.aelius.caringheartcenterofficer.receipt.adapter;

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

public class ViewReceiptAdapter extends RecyclerView.Adapter<ViewReceiptAdapter.MyViewHolder> {

    Context context;
    int previousExpandedPosition = -1;
    int mExpandedPosition = -1;
    NurtureListFragment fragment;

    @NonNull
    @Override
    public ViewReceiptAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_list_receipt, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewReceiptAdapter.MyViewHolder holder, final int position) {
        // expand and collapas
        final boolean isExpanded = position == mExpandedPosition;

        holder.child_receipt_layout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
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

        LinearLayout parent_receipt_layout,child_receipt_layout;
        TextView tv_receipt_led_nm,tv_receipt_package_nm,tv_receipt_no,tv_receipt_amo,tv_receipt_amu_rec,
                tv_receipt_mode,tv_receipt_ckeck_no,tv_receipt_tr_id_bank,tv_receipt_tr_id_paym,
                tv_receipt_other,tv_receipt_hist,tv_receipt_edit,tv_receipt_delete;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            parent_receipt_layout=itemView.findViewById(R.id.parent_receipt_layout);
            child_receipt_layout=itemView.findViewById(R.id.child_receipt_layout);
            tv_receipt_led_nm=itemView.findViewById(R.id.tv_receipt_led_nm);
            tv_receipt_package_nm=itemView.findViewById(R.id.tv_receipt_package_nm);
            tv_receipt_no=itemView.findViewById(R.id.tv_receipt_no);
            tv_receipt_amo=itemView.findViewById(R.id.tv_receipt_amo);
            tv_receipt_amu_rec=itemView.findViewById(R.id.tv_receipt_amu_rec);
            tv_receipt_mode=itemView.findViewById(R.id.tv_receipt_mode);
            tv_receipt_ckeck_no=itemView.findViewById(R.id.tv_receipt_ckeck_no);
            tv_receipt_tr_id_bank=itemView.findViewById(R.id.tv_receipt_tr_id_bank);
            tv_receipt_tr_id_paym=itemView.findViewById(R.id.tv_receipt_tr_id_paym);
            tv_receipt_other=itemView.findViewById(R.id.tv_receipt_other);
            tv_receipt_hist=itemView.findViewById(R.id.tv_receipt_hist);
            tv_receipt_edit=itemView.findViewById(R.id.tv_receipt_edit);
            tv_receipt_delete=itemView.findViewById(R.id.tv_receipt_delete);
        }
    }
}
