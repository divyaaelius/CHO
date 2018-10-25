package com.aelius.caringheartcenterofficer.presentationmodule.presfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.aelius.caringheartcenterofficer.MainActivity;
import com.aelius.caringheartcenterofficer.R;

public class PresentationFragment extends Fragment implements View.OnClickListener {


    private Spinner spnPresLeader;
    private TextView tvPresPreviouscomment;
    private Spinner spnPresNextvisit;
    private TextView tvPresAppointmenttime;
    private TextView tvPresBizcard;
    MainActivity mActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_presentation, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mActivity=((MainActivity) getActivity());
        spnPresLeader = (Spinner) view.findViewById(R.id.spn_pres_leader);
        tvPresPreviouscomment = (TextView) view.findViewById(R.id.tv_pres_previouscomment);
        spnPresNextvisit = (Spinner) view.findViewById(R.id.spn_pres_nextvisit);
        tvPresAppointmenttime = (TextView) view.findViewById(R.id.tv_pres_appointmenttime);
        tvPresBizcard = (TextView) view.findViewById(R.id.tv_pres_bizcard);
        tvPresPreviouscomment.setOnClickListener(this);

        view.findViewById(R.id.btn_pres_submit).setOnClickListener(this);
    }

    private EditText getEdtPresRemark() {
        return (EditText) getView().findViewById(R.id.edt_pres_remark);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_pres_submit:
                //TODO implement
                break;
            case R.id.tv_pres_previouscomment:

                mActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                mActivity.getSupportActionBar().setDisplayShowHomeEnabled(true);
                PreviousCommentFragment fragPres = new PreviousCommentFragment();
                // ((MainActivity) getActivity()).FragmentReplace(addFundFrag, getString(R.string.comment_history));
                FragmentTransaction fragmentTransaction = mActivity.getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_Containt, fragPres).addToBackStack(null).commit();
                break;

        }
    }


}
