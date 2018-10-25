package com.aelius.caringheartcenterofficer.presentationmodule.presadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aelius.caringheartcenterofficer.R;


public class PreviousCommentAdapter extends RecyclerView.Adapter<PreviousCommentAdapter.MyViewHolder> {
    Context context;

    public PreviousCommentAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_previous_comment, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        //list


    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvPhysicianName;
        private TextView tvPhysicianDrEmail;
        private TextView tvPhysicianDrphone;
        private TextView tvPhysicianCoonumber;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvPhysicianName = (TextView) itemView.findViewById(R.id.tv_physician_name);
            tvPhysicianDrEmail = (TextView) itemView.findViewById(R.id.tv_physician_drEmail);
            tvPhysicianDrphone = (TextView) itemView.findViewById(R.id.tv_physician_drphone);
            tvPhysicianCoonumber = (TextView) itemView.findViewById(R.id.tv_physician_coonumber);
        }
    }
}
