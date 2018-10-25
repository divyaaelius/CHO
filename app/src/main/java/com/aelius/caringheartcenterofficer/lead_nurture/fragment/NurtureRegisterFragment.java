package com.aelius.caringheartcenterofficer.lead_nurture.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.aelius.caringheartcenterofficer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NurtureRegisterFragment extends Fragment {

    TextView nur_tv_comm_his,nur_tv_appoi;
    Spinner nur_spi_lead,nur_spi_mode,nur_spi_purpose;
    EditText nur_edt_diss,nur_edt_remark;
    Button nur_btn_submit;

    public NurtureRegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_nurture, container, false);

        init(v);

        return v;
    }

    private void init(View v) {
        nur_btn_submit=v.findViewById(R.id.nur_btn_submit);
        nur_edt_diss=v.findViewById(R.id.nur_edt_diss);
        nur_edt_remark=v.findViewById(R.id.nur_edt_remark);
        nur_tv_comm_his=v.findViewById(R.id.nur_tv_comm_his);
        nur_tv_appoi=v.findViewById(R.id.nur_tv_appoi);
        nur_spi_lead=v.findViewById(R.id.nur_spi_lead);
        nur_spi_mode=v.findViewById(R.id.nur_spi_mode);
        nur_spi_purpose=v.findViewById(R.id.nur_spi_purpose);
    }

}
