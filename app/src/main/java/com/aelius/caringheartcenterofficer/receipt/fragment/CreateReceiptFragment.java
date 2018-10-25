package com.aelius.caringheartcenterofficer.receipt.fragment;


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
public class CreateReceiptFragment extends Fragment {


    TextView reciptreg_tv_commhis,reciptreg_tv_recno,reciptreg_tv_chrg_amou,reciptreg_tv_pay_proof;
    Spinner reciptreg_lead_spi,reciptreg_package_spi,reciptreg_mode_rec_spi;
    EditText reciptreg_edt_amu_recived,reciptreg_edt_remark;
    Button btn_submit_reciptreg;

    public CreateReceiptFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_create_receipt, container, false);

        init(v);

        return v;
    }

    private void init(View v) {
        reciptreg_tv_commhis=v.findViewById(R.id.reciptreg_tv_commhis);
        reciptreg_tv_recno=v.findViewById(R.id.reciptreg_tv_recno);
        reciptreg_tv_chrg_amou=v.findViewById(R.id.reciptreg_tv_chrg_amou);
        reciptreg_tv_pay_proof=v.findViewById(R.id.reciptreg_tv_pay_proof);
        //spinner
        reciptreg_lead_spi=v.findViewById(R.id.reciptreg_lead_spi);
        reciptreg_package_spi=v.findViewById(R.id.reciptreg_package_spi);
        reciptreg_mode_rec_spi=v.findViewById(R.id.reciptreg_mode_rec_spi);
        //edittext
        reciptreg_edt_remark=v.findViewById(R.id.reciptreg_edt_remark);
        reciptreg_edt_amu_recived=v.findViewById(R.id.reciptreg_edt_amu_recived);
        //button
        btn_submit_reciptreg=v.findViewById(R.id.btn_submit_reciptreg);

    }

}
