package com.aelius.caringheartcenterofficer.patientreport;

import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Spinner;
import android.support.v7.widget.RecyclerView;

import com.aelius.caringheartcenterofficer.R;
import com.aelius.caringheartcenterofficer.bankinfo.BankInfoAdapter;

public class PatientReportFragment extends Fragment implements View.OnClickListener {

    private TextView tvSelectFromdateReport;
    private TextView tvSelectTodateReport;
    private Spinner spnSelectPatient;
    private RecyclerView recPatientReport;
    Button btn_search_report;
    PatientReportAdapter patientReportAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_patient_report, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvSelectFromdateReport = (TextView) view.findViewById(R.id.tv_select_fromdate_report);
        tvSelectTodateReport = (TextView) view.findViewById(R.id.tv_select_todate_report);
        btn_search_report = view.findViewById(R.id.btn_search_report);
        btn_search_report.setOnClickListener(this);
        spnSelectPatient = (Spinner) view.findViewById(R.id.spn_select_patient);
        recPatientReport = (RecyclerView) view.findViewById(R.id.rec_patient_report);
        AdapaterSetUp();
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_search_report) {

        }
    }


    private void AdapaterSetUp() {
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recPatientReport.setLayoutManager(mLayoutManager);
        recPatientReport.setItemAnimator(new DefaultItemAnimator());
        patientReportAdapter = new PatientReportAdapter(getActivity());
        recPatientReport.setAdapter(patientReportAdapter);
        patientReportAdapter.notifyDataSetChanged();
    }
}
