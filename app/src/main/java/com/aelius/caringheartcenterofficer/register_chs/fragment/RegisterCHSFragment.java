package com.aelius.caringheartcenterofficer.register_chs.fragment;


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
public class RegisterCHSFragment extends Fragment {


    Spinner rec_chs_lead_spi,rec_chs_state_spi,rec_chs_city_spi,rec_chs_conact_spi;
    TextView rec_chs_tv_comm_his,rec_chs_tv_img,rec_chs_tv_add_proof,rec_chs_tv_uplod_sign;
    EditText rec_chs_edt_center_nm,rec_chs_edt_add,rec_chs_edt_pin,rec_chs_edt_mno,rec_chs_edt_hed_nm,
            rec_chs_edt_hed_no,rec_chs_edt_hed_email,rec_chs_edt_remark;
    Button rec_chs_btn_submit;

    public RegisterCHSFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_register_chs, container, false);

        init(v);

        return v;
    }

    private void init(View v) {

        rec_chs_lead_spi=v.findViewById(R.id.rec_chs_lead_spi);
        rec_chs_state_spi=v.findViewById(R.id.rec_chs_state_spi);
        rec_chs_city_spi=v.findViewById(R.id.rec_chs_city_spi);
        rec_chs_conact_spi=v.findViewById(R.id.rec_chs_conact_spi);
        rec_chs_tv_comm_his=v.findViewById(R.id.rec_chs_tv_comm_his);
        rec_chs_tv_img=v.findViewById(R.id.rec_chs_tv_img);
        rec_chs_tv_add_proof=v.findViewById(R.id.rec_chs_tv_add_proof);
        rec_chs_edt_center_nm=v.findViewById(R.id.rec_chs_edt_center_nm);
        rec_chs_tv_uplod_sign=v.findViewById(R.id.rec_chs_tv_uplod_sign);
        rec_chs_edt_add=v.findViewById(R.id.rec_chs_edt_add);
        rec_chs_edt_pin=v.findViewById(R.id.rec_chs_edt_pin);
        rec_chs_edt_mno=v.findViewById(R.id.rec_chs_edt_mno);
        rec_chs_edt_hed_nm=v.findViewById(R.id.rec_chs_edt_hed_nm);
        rec_chs_edt_hed_no=v.findViewById(R.id.rec_chs_edt_hed_no);
        rec_chs_edt_hed_email=v.findViewById(R.id.rec_chs_edt_hed_email);
        rec_chs_edt_remark=v.findViewById(R.id.rec_chs_edt_remark);
        rec_chs_btn_submit=v.findViewById(R.id.rec_chs_btn_submit);
    }

}
