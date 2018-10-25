package com.aelius.caringheartcenterofficer.utils;

import android.content.Context;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class ParseJson {

    private Context context;
    public ParseJson(Context context){
        this.context=context;

    }

    public  boolean parseLogin(String result, PreferHelper prefHelp) {
        try {
            JSONObject jsonObject = new JSONObject(result);
            if(jsonObject.getString(ConstVariable.PARAM.STATUS).equals(ConstVariable.PARAM.TRUE ))
            {
                //String str = jsonObject.getString("status");
                JSONObject object = jsonObject.getJSONObject(ConstVariable.PARAM.DATA );

                // get the all data in variable
                String id1 = object.getString(ConstVariable.PARAM.ID   );
                String user_detail_id = object.getString(ConstVariable.PARAM.USERDETAILSID);
                String username = object.getString(ConstVariable.PARAM.USERNAME);
                String CreatedByUserId = object.getString(ConstVariable.PARAM.CREATEBYUSERID );
                String first_name = object.getString(ConstVariable.PARAM.FIRST_NAME );
                String email = object.getString(ConstVariable.PARAM.EMAIL );


                prefHelp.putLogin(true);
                prefHelp.putUserId(id1);
                prefHelp.putUserName(username);
                prefHelp.putUserFullName(first_name);
                prefHelp.putCreatedByUserId(CreatedByUserId);
                prefHelp.putUserDetailId(user_detail_id);
                prefHelp.putUserEmail(email);
                return true;
            }else {
                return false;
            }

        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(context, "Incorrect Login", Toast.LENGTH_SHORT).show();
        }
    return false;
    }
  /*  public ArrayList<DoctorMode> specilityJson(String response)
    {
        ArrayList<DoctorMode> doctorList=new ArrayList<>();
        if (response!=null && !response.equals("null"))
        {
            try {
                JSONObject object = new JSONObject(response);


                if (object.getString(ConstVariable.PARAM.STATUS).equals(ConstVariable.PARAM.TRUE)) {
                    JSONObject jOb=object.getJSONObject(ConstVariable.PARAM.COURSELIST);
                    JSONArray jsonArray = jOb.getJSONArray(ConstVariable.PARAM.SPECIALTIESLIST);

                    if (jsonArray.length() == 0) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setMessage("No Record Found");
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                    doctorList.add( new DoctorMode("0","Select Specialty"));

                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jo = jsonArray.getJSONObject(i);

                        final String id = jo.getString(ConstVariable.PARAM.ID);
                        doctorList.add( new DoctorMode(jo.getString(ConstVariable.PARAM.ID),jo.getString(ConstVariable.PARAM.SPECIALTIES_NAME)));


                    }


                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return doctorList;
    }
*/
}
