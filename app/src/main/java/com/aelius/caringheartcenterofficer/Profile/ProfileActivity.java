package com.aelius.caringheartcenterofficer.Profile;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.aelius.caringheartcenterofficer.R;
import com.aelius.caringheartcenterofficer.utils.ConstMethod;
import com.aelius.caringheartcenterofficer.utils.FilePath;
import com.squareup.picasso.Picasso;

import java.io.File;

import de.hdodenhof.circleimageview.CircleImageView;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
;
import static com.aelius.caringheartcenterofficer.utils.ConstVariable.PICK_IMAGE_REQUEST;
import static com.aelius.caringheartcenterofficer.utils.ConstVariable.STORAGE_PERMISSION_CODE;

public class ProfileActivity extends AppCompatActivity {

    Context context;
    String TAG = "Profile Update";
    //Call<ProfileData> callBody;
    //Call<ProfileUpdate> callUpdate;

    EditText profile_edt_hnm, profile_edt_add, profile_edt_pincode, profile_edt_team_leader_nm, profile_edt_team_leader_no;
    CircleImageView profile_img;
    Button profile_btn_submit;

    private Uri filePath;
    String realFilePath;
    int isOpen=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        FindId();

        BindView();

        getDataAvailable(); // get all data at here from api

        profile_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ProfileActivity.this, new String[]{android.Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE);
                } else {
                    SelectFile();
                }
            }
        });
    }

    private void SelectFile() {
        String[] mimeTypes = {"image/*"};

        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            intent.setType(mimeTypes.length == 1 ? mimeTypes[0] : "*/*");
            if (mimeTypes.length > 0) {
                intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
            }
        } else {
            String mimeTypesStr = "";

            for (String mimeType : mimeTypes) {
                mimeTypesStr += mimeType + "|";
            }

            intent.setType(mimeTypesStr.substring(0, mimeTypesStr.length() - 1));
        }
        startActivityForResult(Intent.createChooser(intent, "Select"), PICK_IMAGE_REQUEST);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        //   super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            filePath = data.getData();
            ConstMethod.LodDebug("File path", "------------>" + filePath);
            realFilePath = FilePath.getPath(this, filePath);
            ConstMethod.LodDebug("real path", "------------>" + realFilePath);
            try {
                isOpen=2;
                Picasso.with(context)
                        .load(filePath)
                        .error(R.drawable.ic_arrow_down)
                        .placeholder(R.drawable.ic_arrow_down)
                        .into(profile_img);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

        switch (requestCode) {

            case STORAGE_PERMISSION_CODE:
                if (grantResults.length > 0) {
                    if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        SelectFile();
                    }
                }

                break;
        }
    }

    private void getDataAvailable() {

/*
        final ProgressDialog myDialog = ConstMethod.showProgressDialog(context, getResources().getString(R.string.please_wait));


        ApiInterface apiService = ApiRetrofit.getRetrofitInstance().create(ApiInterface.class);
        callBody = apiService.getProfileData(new PreferHelper(this).getUserDetailID());
        callBody.enqueue(new Callback<ProfileData>() {
            @Override
            public void onResponse(Call<ProfileData> call, Response<ProfileData> response) {
                myDialog.dismiss();
                try {
                    if (response.isSuccessful()) {
                        Log.d(TAG, "onSuccess body: " + response.body());
                        //Gson gson=new Gson();
                        String rsponseBody = response.body().toString();
                        if (rsponseBody != null) {

                            if (response.body().getStatus()) {
                                profile_edt_hnm.setText(response.body().getProfile().getHospitalName());
                                profile_edt_add.setText(response.body().getProfile().getAddress());
                                profile_edt_pincode.setText(response.body().getProfile().getPincode());
                                profile_edt_team_leader_nm.setText(response.body().getProfile().getTeamLeader());
                                profile_edt_team_leader_no.setText(response.body().getProfile().getTlMobile());
                                Log.d(TAG, "Profile picture " + URL_PROFILE_IMAGE+response.body().getProfile().getProfilePic());
                                new PreferHelper(ProfileActivity.this).putProfileImage(URL_PROFILE_IMAGE+response.body().getProfile().getProfilePic());

                                Picasso.with(context)
                                        .load(URL_PROFILE_IMAGE+response.body().getProfile().getProfilePic())
                                        .error(R.drawable.heart)
                                        .placeholder(R.drawable.heart)
                                        .into(profile_img);
                            }

                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ProfileData> call, Throwable t) {
                myDialog.dismiss();

                Log.d(TAG, "onFailure: " + t.getMessage() + "   ");
                t.printStackTrace();

            }
        });*/

    }

    private void BindView() {
        profile_btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final boolean fieldsOK = ConstMethod.validate(new EditText[]{profile_edt_hnm, profile_edt_add, profile_edt_pincode
                        , profile_edt_team_leader_nm, profile_edt_team_leader_no}, new String[]{"Enter Hospital Name", "Enter Hospital Address",
                        "Enter Pin code", "Enter Team Leader Name", "Ener Team Leader No."});

                if (fieldsOK) {
                    if (ConstMethod.isInternetOn(ProfileActivity.this)) {

                        ServiceCall();
                    }
                }
            }
        });


    }

    private void ServiceCall() {
        final ProgressDialog myDialog = ConstMethod.showProgressDialog(context, getResources().getString(R.string.please_wait));
        //ConstMethod.LodDebug("addd path lice", "------------>" + profile_img.getText().toString());

        MultipartBody.Part profileimg;
        // Parsing any Media type file
        //RequestBody requestBody = RequestBody.create(MediaType.parse("*/*"), file);
        if (isOpen==2){
            Log.d("File pah","profile =======>"+realFilePath);
            File file = new File(realFilePath);
            RequestBody requestFileLicense =
                    RequestBody.create(MediaType.parse("*/*"), file);
            profileimg =
                    MultipartBody.Part.createFormData("profilePic", file.getName(), requestFileLicense);
        }else {
            RequestBody requestFileLicense =
                    RequestBody.create(MediaType.parse("*/*"), "");
            profileimg =
                    MultipartBody.Part.createFormData("profilePic", "", requestFileLicense);
        }


        RequestBody profilehnm = RequestBody.create(MediaType.parse("text/plain"), profile_edt_hnm.getText().toString());
        RequestBody profileadd = RequestBody.create(MediaType.parse("text/plain"),profile_edt_add.getText().toString());
        RequestBody profilepincode = RequestBody.create(MediaType.parse("text/plain"),profile_edt_pincode.getText().toString());
        RequestBody profiletlnm = RequestBody.create(MediaType.parse("text/plain"),profile_edt_team_leader_nm.getText().toString());
        RequestBody profiletlno = RequestBody.create(MediaType.parse("text/plain"),profile_edt_team_leader_no.getText().toString());


       /* ApiInterface apiService = ApiRetrofit.getRetrofitInstance().create(ApiInterface.class);
        callUpdate = apiService.getUpdateProfile(profilehnm,profileadd,profilepincode,profiletlnm,profiletlno,profileimg);
        callUpdate.enqueue(new Callback<ProfileUpdate>() {
            @Override
            public void onResponse(Call<ProfileUpdate> call, Response<ProfileUpdate> response) {
                myDialog.dismiss();
                try {
                    if (response.isSuccessful()) {
                        Log.d(TAG, "onSuccess body: " + response.body());
                        //Gson gson=new Gson();
                        String rsponseBody = response.body().toString();
                        if (rsponseBody != null) {

                            if (response.body().getStatus())
                            {
                                //tv_card_code.setText(response.body().getValuesOfInvoice().getCardiologist_code());
                                Log.d("msg", "onSuccess: " + response.body().getMessage());
                                Toast.makeText(context, ""+response.body().getMessage(), Toast.LENGTH_SHORT).show();
                                finish();

                            }

                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ProfileUpdate> call, Throwable t) {
                myDialog.dismiss();

                Log.d(TAG, "onFailure: "+ t.getMessage()+"   ");
                t.printStackTrace();

            }
        });*/
    }

    private void FindId() {

        context = ProfileActivity.this;

        profile_edt_hnm = findViewById(R.id.profile_edt_hnm);
        profile_edt_add = findViewById(R.id.profile_edt_add);
        profile_edt_pincode = findViewById(R.id.profile_edt_pincode);
        profile_edt_team_leader_nm = findViewById(R.id.profile_edt_team_leader_nm);
        profile_edt_team_leader_no = findViewById(R.id.profile_edt_team_leader_no);
        profile_img = findViewById(R.id.profile_img);
        profile_btn_submit = findViewById(R.id.profile_btn_submit);
    }
}