package com.aelius.caringheartcenterofficer.login;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.aelius.caringheartcenterofficer.MainActivity;
import com.aelius.caringheartcenterofficer.R;
import com.aelius.caringheartcenterofficer.utils.ConstMethod;
import com.aelius.caringheartcenterofficer.utils.ParseJson;
import com.aelius.caringheartcenterofficer.utils.PreferHelper;
import com.aelius.caringheartcenterofficer.webservice.ApiInterface;
import com.aelius.caringheartcenterofficer.webservice.ApiRetrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//import static com.aelius.caringheartcenterofficer.utils.ConstVariable.URL.URL_PROFILE_IMAGE;

public class LoginActivity extends AppCompatActivity {

    private String TAG = "LoginActivity";
    private EditText identity, password;
    private TextView submit;
    private Context context;

    private ProgressDialog pd;
    private String user_id;
    private PreferHelper prefHelp;
    private ParseJson parseData;
    private String deviceId;
    Call<LoginModel> call;
    LoginModel loginRes;
   //Call<ProfileData> callBody;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Setup full screen
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        // find all id
        init();
        //declere preferance
        prefHelp = new PreferHelper(this);
        parseData = new ParseJson(this);
        ConstMethod.LodDebug(TAG, "login id --->" + prefHelp.getUserId());
        ConstMethod.LodDebug(TAG, "login user detail id --->" + prefHelp.getUserDetailID());

        if (prefHelp.getLogin()) {

            startActivity(new Intent(context, MainActivity.class));
            finish();
            overridePendingTransition(R.anim.enter_anim, R.anim.exit_anim);

        }

        //get deviced id
        deviceId = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
        ConstMethod.LodDebug(TAG, "login user deviceId --->" + deviceId);

        if (prefHelp.getLogin()) {

           /* startActivity(new Intent(context, DashboardActivity.class));
            finish();
            overridePendingTransition(R.anim.enter_anim, R.anim.exit_anim);*/

        }

        ConstMethod.LodDebug(TAG, "device token --->" + prefHelp.getDeviceToken());

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // check all validation
                if (ConstMethod.isInternetOn(LoginActivity.this)) {
                    if (TextUtils.isEmpty(identity.getText())) {
                        identity.requestFocus();
                        identity.setError("Enter Email ID");
                    } else if (!ConstMethod.isValidMail(identity.getText().toString())) {
                        identity.requestFocus();
                        identity.setError("Enter Valid Email");

                    } else if (TextUtils.isEmpty(password.getText())) {
                        password.requestFocus();
                        password.setError("Enter Password");
                    } else if (ConstMethod.isValidPassword(password.getText().toString())) {


                        // service calling at here
                        getUserLogin();

                    } else {
                        password.requestFocus();
                        password.setError("Enter Valid Password");
                    }
                } else {
                    ConstMethod.NetworkAlert(LoginActivity.this);

                }



            }
        });

    }

    // service calling
    private void getUserLogin() {

        final ProgressDialog myDialog = ConstMethod.showProgressDialog(this, getResources().getString(R.string.please_wait));

        String id = String.valueOf(identity.getText().toString().trim());
        String pass = password.getText().toString().trim();
        ApiInterface apiService = ApiRetrofit.getRetrofitInstance().create(ApiInterface.class);
        call = apiService.loginUser(id, pass, prefHelp.getDeviceToken(), deviceId);
        call.enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                myDialog.dismiss();
                Log.d("Login", "onSuccess body: " + response);
                try {
                    if (response.isSuccessful()) {
                        Log.d("Login", "onSuccess body: " + response.body().toString());
                        //Gson gson=new Gson();
                        String rsponseBody = response.body().toString();
                        if (rsponseBody != null) {

                            Data loginRes = response.body().getData();

                            if (response.body().getStatus()) {
                                Log.d("Login", "onSuccessstatus if: " + response.body().getStatus());

                                prefHelp.putLogin(true);
                                prefHelp.putUserId(loginRes.getId());
                                prefHelp.putUserName(loginRes.getUsername());
                                prefHelp.putUserFullName(loginRes.getFirst_name()+loginRes.getLast_name());
                                prefHelp.putCreatedByUserId(loginRes.getCreateByUserId());
                                prefHelp.putUserDetailId(loginRes.getUserDetailsId());
                                prefHelp.putUserEmail(loginRes.getEmail());
                                prefHelp.putUserRoal(loginRes.getUserRole());
                                Log.d("Login", "getUserDetailID: " + prefHelp.getUserDetailID());
                                Log.d("msg", "onSuccess: " + prefHelp.getUserDetailID());

                           //     getDataAvailable(); // to set the data into the main dashboard

                                startActivity(new Intent(context,MainActivity.class));
                                finish();
                            }
                            else {
                                Toast.makeText(context, "Username or Password is Wrong", Toast.LENGTH_SHORT).show();
                            }
                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {
                myDialog.dismiss();
                Log.d("Login", "onFailure: ");
                Toast.makeText(context, "Something Went Wrong", Toast.LENGTH_SHORT).show();

            }
        });

    }


    // find all id at here
    private void init() {

        context = LoginActivity.this;
        identity = findViewById(R.id.email);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.login);

    }
}
