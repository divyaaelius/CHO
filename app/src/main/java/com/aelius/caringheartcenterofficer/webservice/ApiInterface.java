package com.aelius.caringheartcenterofficer.webservice;


import com.aelius.caringheartcenterofficer.login.LoginModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    //login  http://ch.healthcareinfosystems.in/index.php/api/Login_module_api/CHCLogin
    @FormUrlEncoded
    @POST("Login_module_api/CHCLogin")
    Call<LoginModel> loginUser(@Field("identity") String Username,
                               @Field("password") String password,
                               @Field("token_device") String device_token,
                               @Field("deviceId") String device_id);

   /* // cardilogist view
    @FormUrlEncoded
    @POST("Cardiologist_view_api/index")
    Call<CardiologistModel> getCardioView(@Field("id") String id);

    // cardioligst code
    @FormUrlEncoded
    @POST("CHC_cardiologist_code_api")
    Call<CardioCodeModel> getCardioCode(@Field("userRole") String userRole,
                                        @Field("userDetailsId") String userDetailId,
                                        @Field("id") String id);

    // specility droupdowen
    @GET("Speciality_dropdown_api")
    // specify the sub url for our base url
    Call<Example> getSpecialitySpinner();

    // code of visit request
    @FormUrlEncoded
    @POST("CHC_visit_requestcode_api")
    Call<VisitRequestCode> getVisitCode(@Field("userDetailsId") String userDetailId);

    //visit request post
    @FormUrlEncoded
    @POST("CHC_visit_request_api")
    Call<VisitRequest> getVisitRequest(@Field("userDetailsId") String userDetailId,
                                       @Field("id") String id,
                                       @Field("requestId") String eventid,
                                       @Field("timeSlot") String apptime,
                                       @Field("chcName") String chcnm,
                                       @Field("priority") String priorityId,
                                       @Field("remarks") String remark
    );

    // cardiologist add
    @Multipart
    @POST("CHC_cardiologist_register_api")
    Call<CardRegisreResMode> registerCardiologist(@Part("name") RequestBody name,
                                                  @Part("qualification") RequestBody qualification,
                                                  @Part("bio") RequestBody bio,
                                                  @Part("mobile") RequestBody mobile,
                                                  @Part("email") RequestBody email,
                                                  @Part("secretaryName") RequestBody secretaryName,
                                                  @Part("secretaryEmail") RequestBody secretaryEmail,
                                                  @Part("secretaryMobile") RequestBody secretaryMobile,
                                                  @Part("secretaryDirectPhone") RequestBody secretaryDirectPhone,
                                                  @Part("remarks") RequestBody remarks,
                                                  @Part("trainingDueOn") RequestBody trainingDueOn,
                                                  @Part("displayName") RequestBody displayName,
                                                  @Part("lincenceNo") RequestBody lincenceNo,
                                                  @Part("designation") RequestBody designation,
                                                  @Part("password") RequestBody password,
                                                  @Part("userRole") RequestBody userRole,
                                                  @Part("userDetailsId") RequestBody userDetailsId,
                                                  @Part("id") RequestBody id,
                                                  @Part("cardiologist_code") RequestBody cardiologist_code,
                                                  @Part MultipartBody.Part certificate_image,
                                                  @Part MultipartBody.Part cardiologist_image);


    //profile view
    @GET("CHC_profile_edit_api/index/{id}")
    Call<ProfileData> getProfileData(@Path("id") String id);

    // profile Update
    @Multipart
    @POST("CHC_profile_update_api/index/11")
    Call<ProfileUpdate> getUpdateProfile(
            @Part("hospitalName") RequestBody profilehnm,
            @Part("address") RequestBody profileadd,
            @Part("pincode") RequestBody profilepincode,
            @Part("teamLeader") RequestBody profiletlnm,
            @Part("tlMobile") RequestBody profiletlno,
            @Part MultipartBody.Part profile_image);

    // network status list
    @FormUrlEncoded
    @POST("CHC_network_list_api")
    Call<DataNetworkList> getNetworkList(@Field("userDetailsId") String userDetailsId);

    //Physician View
    @FormUrlEncoded
    @POST("CHC_physicians_list_api")
    Call<PhysiciansListModel> getPhysicianView(@Field("id") String id);


    //speciality phisicna view
    @GET("Select_speciality_api/index/{id}")
    Call<SpecialityPhysicianModel> getSpecialityPhiscian(@Path("id") String id);

    // HC droupdowen
    @FormUrlEncoded
    @POST("CHC_select_hc_list_api")
    // specify the sub url for our base url
    Call<HcListModel> getHcList(@Field("userDetailsId") String userDetailsId);

    //hc details view
    @GET("CHC_hc_details_api/index/{id}")
    Call<HCDetailsModelMain> getHcDetails(@Path("id") String id);

    //physician register

    @Multipart
    @POST("CHC_physicians_register_api")
    Call<PhysicianRegisteModel> getRegisterPhysician(
            @Part("physicians_Name") RequestBody phnm,
            @Part("specialty_id") RequestBody sid,
            @Part("profile") RequestBody profile,
            @Part("qualifications") RequestBody que,
            @Part("regNo") RequestBody regno,
            @Part("currentWorking") RequestBody cwork,
            @Part("d_phone") RequestBody dphno,
            @Part("d_email") RequestBody demail,
            @Part("dc_phone") RequestBody cphno,
            @Part("dc_email") RequestBody cemail,
            @Part("hc_id") RequestBody hcid,
            @Part("id") RequestBody id,
            @Part("userDetailsId") RequestBody userDetailsId,
            @Part MultipartBody.Part doc_profile,
            @Part MultipartBody.Part licence_copy
    );

    //update physician
    @Multipart
    @POST("CHC_physicians_update_api/")
    Call<UpdatePhysicianModel> UpdatePhysician(
            @Part("physicians_Name") RequestBody phnm,
            @Part("specialty_id") RequestBody sid,
            @Part("profile") RequestBody profile,
            @Part("qualifications") RequestBody que,
            @Part("regNo") RequestBody regno,
            @Part("currentWorking") RequestBody cwork,
            @Part("d_phone") RequestBody dphno,
            @Part("d_email") RequestBody demail,
            @Part("dc_phone") RequestBody cphno,
            @Part("dc_email") RequestBody cemail,
            @Part("hc_id") RequestBody hcid,
            @Part("id") RequestBody id,
            @Part("userDetailsId") RequestBody userDetailsId,
            @Part("editid") RequestBody phyid,
            @Part MultipartBody.Part doc_profile,
            @Part MultipartBody.Part licence_copy
    );

    // physician details
    @GET("CHC_physicians_edit_api/index/{id}")
    Call<PhysicianDataModel> getPhysicanData(@Path("id") String id);

    // hc code api
    @FormUrlEncoded
    @POST("CHC_hc_code_api")
    Call<HcCodeMainMode> getHcCode(@Field("userDetailsId") String userDetailsId);

    // hospital api
    @FormUrlEncoded
    @POST("CHC_hospital_name_api")
    Call<HospitalListMainModel> getHospitalList(@Field("userDetailsId") String userDetailsId);

    // cardiologist add
    @Multipart
    @POST("CHC_hc_register_api")
    Call<HCRegisterModel> registerHc(
            @Part("id") RequestBody iduser,
            @Part("chcId") RequestBody chcId,
            @Part("hc_code") RequestBody hc_code,
            @Part("name") RequestBody name,
            @Part("displayName") RequestBody displayName,
            @Part("email") RequestBody email,
            @Part("phone1") RequestBody phone1,
            @Part("phone2") RequestBody phone2,
            @Part("password") RequestBody password,
            @Part("remarks") RequestBody remarks,
            @Part MultipartBody.Part picture
    );

    // CHC Account Api
    @FormUrlEncoded
    @POST("CHC_statement_account_api")
    Call<StatementAccountModel> getStatementAccountData(@Field("userDetailsId") String userDetailId,
                                                        @Field("from") String from,
                                                        @Field("to") String to,
                                                        @Field("physiciansId") String phyid,
                                                        @Field("serviceId") String serviceId,
                                                        @Field("cardiologistId") String carid);

    // ValuesOfInvoice List
    @FormUrlEncoded
    @POST("CHC_cardiologist_api")
    Call<CardologistListModel> getCardiologist(@Field("userDetailsId") String userDetailsId);

    // physician droupdowen
    @FormUrlEncoded
    @POST("CHC_select_physicians_api")
    Call<PhysicianListMainModel> getPhysicianList(@Field("userDetailsId") String userDetailsId);

    // get Refund Request Code
    @FormUrlEncoded
    @POST("CHC_refundrequest_code_api")
    Call<RefundRequestCodeModel> getRefundReqCode(@Field("userDetailsId") String userDetailsId);

    // Refund request add
    @Multipart
    @POST("CHC_refundrequest_api")
    Call<RefndRequestModel> RefundRequestRegister(@Part("id") RequestBody id,
                                                  @Part("userDetailsId") RequestBody userDetailId,
                                                  @Part("currentBalance") RequestBody bal,
                                                  @Part("eventId") RequestBody eveid,
                                                  @Part("refundAmount") RequestBody amount,
                                                  @Part("bankDetails") RequestBody bankDetails,
                                                  @Part("remarks") RequestBody remarks,
                                                  @Part MultipartBody.Part canceledCheque
    );

    // search of Invoice Service
    @FormUrlEncoded
    @POST("CHC_service_invoice_api")
    Call<InvoiceSearchModel> getInvoiceSearch(@Field("userDetailsId") String userDetailsId,
                                              @Field("from") String fromDate,
                                              @Field("to") String toDate);

    // code of Invoice Service
    @FormUrlEncoded
    @POST("CHC_invoice_code_api")
    Call<CodeOfServiceInvoiceModel> getInvoiceCode(@Field("userDetailsId") String userDetailsId);


    //invoice request
    @Multipart
    @POST("CHC_invoice_request_api")
    Call<InvoiceServiceReguest> invoiceRequestRegister(@Part("id") RequestBody id,
                                                       @Part("userDetailsId") RequestBody userDetailId,
                                                       @Part("chcName") RequestBody chcName,
                                                       @Part("requestId") RequestBody eveid,
                                                       @Part("taxName") RequestBody taxName,
                                                       @Part("taxRate") RequestBody taxRate,
                                                       @Part("taxAmount") RequestBody taxAmount,
                                                       @Part("hospitaInvoiceNo") RequestBody hospitaInvoiceNo,
                                                       @Part("hospitalInvoiceAmount") RequestBody hospitalInvoiceAmount,
                                                       @Part("bankingDetails") RequestBody bankingDetails,
                                                       @Part("remarks") RequestBody remarks,
                                                       @Part("from") RequestBody from,
                                                       @Part("to") RequestBody to,
                                                       @Part MultipartBody.Part invoiceProof,
                                                       @Part MultipartBody.Part canceledCheque
    );

    // changehc droupdowen
    @FormUrlEncoded
    @POST("CHC_changeHC_api")
    Call<ChangeHCResponseModel> getChangeHCReponseApi(@Field("id") String userDetailsId, @Field("hc_id") String hc_id);


    // CHC event registered Api
    @FormUrlEncoded
    @POST("CHC_event_register_api")
    Call<MyRegisterModel> getMyRegisterApi(@Field("userDetailsId") String userDetailId,
                                           @Field("from") String from,
                                           @Field("to") String to,
                                           @Field("physiciansId") String phyid,
                                           @Field("cardiologistId") String carid);

    // getCardioligst View
    @GET("CHC_cardiologist_edit_api/index/{id}")
    Call<CardiologistDataById> getCardiologistView(@Path("id") String id);

    // getCardioligst View
    @GET("CHC_cardiologist_delete_api/index/{id}")
    Call<CardiologistDelete> deleteCardiologist(@Path("id") String id);

    // cardiologist update

    @Multipart
    @POST("CHC_cardiologist_update_api")
    Call<CardiologistUpdate> editCardioligstData(
            @Part("editid") RequestBody editid,
            @Part("cardiologist_code") RequestBody cardiologist_code,
            @Part("name") RequestBody name,
            @Part("qualification") RequestBody qualification,
            @Part("bio") RequestBody bio,
            @Part("mobile") RequestBody mobile,
            @Part("email") RequestBody email,
            @Part("secretaryName") RequestBody secretaryName,
            @Part("secretaryEmail") RequestBody secretaryEmail,
            @Part("secretaryMobile") RequestBody secretaryMobile,
            @Part("secretaryDirectPhone") RequestBody secretaryDirectPhone,
            @Part("remarks") RequestBody remarks,
            @Part("trainingDueOn") RequestBody trainingDueOn,
            @Part("id") RequestBody id,
            @Part MultipartBody.Part certificate_image,
            @Part MultipartBody.Part cardiologist_image);

    // getCardioligst View
    @GET("CHC_physicians_delete_api/index/{id}")
    Call<DeletePhysician> deletePhysician(@Path("id") String id);


    //hc View
    @FormUrlEncoded
    @POST("CHC_hc_view_api")
    Call<HcViewMainModel> getHcViewApi(@Field("id") String id);

    // hc details
    @GET("CHC_hc_edit_api/index/{id}")
    Call<HcEditModel> gethcEditApi(@Path("id") String id);


    // cardiologist add
    @Multipart
    @POST("CHC_hc_update_api")
    Call<UpdateResModel> updateHc(@Part("editid") RequestBody chcId,
                                  @Part("name") RequestBody name,
                                  @Part("phone1") RequestBody phone1,
                                  @Part("phone2") RequestBody phone2
    );*/

}

