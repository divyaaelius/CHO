package com.aelius.caringheartcenterofficer.utils;

import android.content.Context;

public class ConstVariable {
    Context context;



    public static String ID_DEFAULT="510";
    public static String USRDETAILSID_DEFAULT="11";
    public static String USERROLE_DEFAULT="10";

    //Image request code
    public static int PICK_IMAGE_REQUEST = 1;

    //storage permission code
    public static final int STORAGE_PERMISSION_CODE = 123;


    public static String[] PRIORITY = {"Select Priority","Normal", "Medium","High"};
    public static String[] SPNCONCERNTYPE = {"Select Concern Type","General Query", "Technical Query","Non Technical Query","Others"};
    public static String[] PRIORITY_OPD = {"Select Priority Status","Normal", "Urgent","Emergency"};
    public static String[] FOLLOWUPVISIT = {"Yes","No"};
   public static String[] FIELDTYPE = {"Select field Type","Name", "CHG ID", "Aadhar No.", "Mobile No.", "Email ID", "DOB (DD-MM-YYYY)"};
    public static String[] SERVIC_TYPE = {"Select Service", "ECG", "OPD", "VPD", "SDP","OPD,VPD,SDP"};
    public static String[] SERVIC_TYPE_REG = {"Select Service", "ECG", "OPD", "VPD", "SDP","OPD,VPD,SDP","Refund Request","Tech Support","Visit Request"};

    public static int ZERO=0;
    public static int ONE=1;
    public static int TWO=2;
    public static int THREE=3;
    public static int FOUR=4;
    public static int FIVE=5;
    public static int SIX=6;

    public static class URL{
     //   http://ch.healthcareinfosystems.in/index.php/api/Patient_code_api
        private static String BASE_URL = "http://ch.healthcareinfosystems.in/index.php/api/";
        private static String BASE_URL_IMAGE = "http://ch.healthcareinfosystems.in/assets/upload/";



    }



    public static class PARAM{

      //  --------------------------------------chc------------------------------------------------

        public static String TECHSUPPORT="techsupport";
        public static String CHCNAME="chcName";

        // shivani 10/9/18
        public static String PHYSICIANSID="physiciansId";
        public static String CARDIOLOGISTID="cardiologistId";
        public static String MY_REGISTER="my_Register";

        // shivani 11/9/18
        public static String TASK="task";
        public static String LEADID="leadId";
        public static String TASKID="taskId";
        public static String EVENTTIME="eventTime";
        public static String FORMNAME="formName";
        public static String TASKDATE="taskDate";
        public static String INDEX="index";

        // shivani 18/9
        public static String SERVICEID="serviceId";
        public static String TASK_PROGRESS="task_progress";
        public static String TRANSFER_ECG="transfer_ecg";
        public static String MESSAGE="message";


        //--------------------------------------chs------------------------------------------------

        public static String IDENTITY="identity";
        public static String PASSWORD="password";
        public static String TOKEN_DEVICE="token_device";
        public static String DEVICE_ID="deviceId";
        public static String DEVICEID_CAP="DeviceId";
        public static String MOBILEDEVICEID="mobileDeviceId";

        public static String ID="id";
        public static String STATUS="status";
        public static String TRUE="true";
        public static String DATA="data";
        public static String USERNAME="username";
        public static String USERDETAILSID="userDetailsId";
        public static String CREATEBYUSERID="createByUserId";
        public static String FIRST_NAME="first_name";
        public static String EMAIL="email";

        // shivani  8/8/18
        public static String PATIENTID="patientId";
        // dashboard
        public static String EVENTID="eventId";
        public static String ECGREVIEWTIME="ecgReviewtime";
        public static String CARDIOLOGISTSTATUS="cardiologistStatus";
        public static String DATE="date";
        public static String CARDIOLOGISTREVIEWTIME="cardiologistReviewTime";
        public static String CARDIOLOGISTIMAGE="cardiologistImage";
        public static String NAME="name";
        public static String PROFILEDETAILS="profile details";
        public static String FROMDATE="fromDate";
        public static String TODATE="toDate";
        public static String COURSELIST="courseList";
        public static String ECGREPORTS="ecgReports";
        public static String ECGOPENTIME="ecgOpenTime";
        public static String UPLOADREVIEWTIME="uploadReviewTime";
        public static String DELIVEREDTIME="deliveredTime";


        // shivani 9-8-18
        public static String PATIENT_CODE="patient_code";
        // Patient code
        public static String CHGID="chgId";

        //shivani 10-8-18
        public static String COUNTRYLIST="countryList";
        public static String COUNTRY="Country";
        public static String COUNTRY_SMALL="CountryMaintModel";
        public static String COUNTRY_NAME="countryName";
        public static String COUNTRY_ID="country_id";
        public static String SELECTCOUTRY="Select Country";
        public static String SELECTSTATE="Select State";
        public static String SELECTCITY="Select City";
        public static String ID_FIRST_CAP="Id";
        public static String STATE="state";
        public static String STATENAME="stateName";
        public static String CITYLIST="cityList";
        public static String CITY="city";
        public static String CITYNAME="cityName";
        public static String AADHARNO="aadharNo";
        public static String FIRSTNAME="firstName";
        public static String LASTNAME="lastName";
        public static String ALTMOBILE="altMobile";
        public static String MOBILE="mobile";
        public static String STREET="street";
        public static String HOUSENO="houseNo";
        public static String DOB="dob";
        public static String ADDITIONALINFO="additionalInfo";
        public static String GENDER="gender";
        public static String PATIENT_LIST="patient List";
        public static String PATIENTNAME="patientName";
        public static String EDITPATIENT="Edit patient";

        public static String POSITION_NUMBER="pos_number";
        public static String POSITION_PARENT="pos_number_parent";

        //11/08/2018 divya
        public static String PATIENT="patient";
        public static String COMPLAINT="complaint";
        public static String HISTORY="history";
        public static String MEDICATIONS="medications";
        public static String PRESENTINGILLNESS="presentingIllness";
        public static String PHYSICIANSREMARKS="physiciansRemarks";
        public static String RELEVANTEXAMINATION="relevantExamination";
        public static String TEMPERATURE="temperature";
        public static String B_PRESSURE="b_pressure";
        public static String HEARTRATE="heartRate";
        public static String RESPIRATORYRATE="respiratoryRate";
        public static String BLOODGLUCOSE="bloodGlucose";
        public static String PULSEOXIMETRY="pulseOximetry";
        public static String ECG="ecg";
        public static String ECGID="ecgId";
        public static String EVENTID_SMALL="eventid";
        public static String AGE="age";

        //  divya 13/08/2018
        public static String CHCLIST="chcList";
        public static String SPECIALTIES_NAME="specialties_name";
        public static String PHYSICIANS_NAME="physicians_name";
        public static String PHYSICIANS_NAME_DETAIL="physicians_Name";
        public static String SPECIALITYNAME="SpecialityName";
        public static String PROFILE="profile";
        public static String DOC_PROFILE="doc_profile";
        public static String QUALIFICATIONS="qualifications";
        public static String OPD_CHARGES="opd_charges";
        public static String CURRENTWORKING="currentWorking";
        public static String DOC_AMOUNT="doc_amount";
        public static String D_PHONE="d_phone";
        public static String D_EMAIL="d_email";
        public static String REGNO="regNo";
        public static String DC_NAME="dc_name";
        public static String DC_PHONE="dc_phone";
        public static String DC_EMAIL="dc_email";
        public static String HOSPITALNAME="hospitalName";
        public static String HOSPITAL="hospital";
        public static String SPECIALTIESLIST="specialtiesList";
        public static String PHYSICIANSLIST="physiciansList";
        public static String REQUESTID="requestId";
        public static String CHCID="chcId";
        public static String SPECIALTY_ID="specialty_id";
        public static String PHYSICIANS_ID="physicians_id";
        public static String TIMESLOT="timeSlot";
        public static String PRIORITY="priority";
        public static String VISITTYPE="visitType";
        public static String REMARKS="remarks";

        // shivani 11-8-18
        public static String OPDID="opdId";
        public static String VPDID="vpdId";
        public static String SDPID="sdpId";
        public static String AMOUNT="amount";
        public static String TYPE="type";
        public static String PATIENT_EVENT_HISTORY="patient_event_history";
        public static String PATIENTDETAILS="patientDetails";
        public static String CHSNAME="chsName";


        // shivani 13-8
        public static String REPORT="report";
        public static String VPDREPORT="vpdReport";
        public static String SDPREPORT="sdpReport";

        public static String PHYSICIANS_COMMENT="physicians_comment";
        public static String QUALIFICATION="qualification";
        public static String LINCENCENO="lincenceNo";
        public static String BIO="bio";
        public static String DESIGNATION="designation";
        public static String LINCENCECOPY="lincenceCopy";

        public static String SPECIALTY="specialty";
        public static String DNAME="Dname";
        public static String OPT="opt";
        public static String APPROVEDBY="approvedBy";
        public static String HCREMARKS="hcRemarks";
        public static String KEYQUESTION="keyQuestion";

        public static String PHYSICIAS="physicias";
        public static String FILENAME="fileName";
        public static String PHYSICIANS="physicians";

        //14/8/2018
        public static String TECH="tech";
        public static String EVENT_ID="event_id";
        public static String S_TITLE="s_title";
        public static String VISIT="visit";
        public static String CHCAMOUNT="chcAmount";

        public static String EC_PRICE="ec_price";
        public static String OC_PRICE="oc_price";
        public static String VC_PRICE="vc_price";
        public static String SC_PRICE="sc_price";

        //16/08/2018
        public static String FUND="fund";
        public static String PAYMENTACCOUNTID="paymentAccountId";
        public static String PAYMENTDATE="paymentDate";
        public static String PAYMENTREMARKS="paymentRemarks";
        public static String PAYMENTFILEPATH="paymentFilePath";
        public static String ADD_FUND="add_fund";
        public static String APPROVEDBALANCE="approvedBalance";
        public static String PAYMENTLIST="paymentList";
        public static String TITLE="title";
        public static String CURRENTBALANCE="currentBalance";
        public static String BANKDETAILS="bankDetails";
        public static String CHEQUE="cheque";
        public static String REFUNDAMOUNT="refundAmount";

        //17-08-2018
        public static String FROM="from";
        public static String TO="to";
        public static String STATEMENT_ACCOUNT="Statement_Account";
        public static String LASTENTRYDATE="lastEntryDate";
        public static String OPININBALANCE="opininBalance";
        public static String CHSDATA="chsData";
        public static String LEAD="lead";
        public static String PINCODE="pinCode";
        public static String DUTYTLNAME="dutyTlName";
        public static String DUTYTLMOBILE="dutyTlMobile";
        public static String DUTYTLEMAIL="dutyTlEmail";
        public static String CHSIMAGE="chsImage";
        public static String ADDRESSPROOF="addressProof";
        public static String CONNECTTO="connectTo";
        public static String SIGNFORM="signForm";
        public static String ACTVCODE="actvCode";


        public static String CHS_FUND_DETAILS="chs_fund_details";
        public static String DESCRIPTION="description";
        public static String COUNTRYCODE="countryCode";
        public static String CODE="code";
        public static String CHS_CODE="chs_code";
        public static String CHC_CODE="chc_code";
        public static String DEPOSITE="deposite";
        public static String TRANSACTIONID="transactionId";
        public static String WITHDRAWL="withdrawl";
        public static String REFUND="refund";
        public static String BALANCE="balance";
        public static String DATEHEADING="dateHeading";
        public static String DATEHEADING1="dateHeading1";
        public static String CURRENCY="currency";
        public static String TIMEZONE="timeZone";
        public static String ADDRESS="address";
        public static String PHONE="phone";
        // shivani 14-8
        public static String REPORTS="reports";
        public static String TASKTYPE="taskType";
        public static String LINK="link";
        public static String CHSID="chsid";
        public static String REC_ID="rec_id";
        public static String REVIEWTIME="reviewTime";
        public static String PROCESSSTEP="processStep";
        // shivani 16-8
        public static String PATIENTDATA="patientData";
        public static String ECGREPORT="ecgReport";
        public static String OPDREPORT="opdReport";
        public static String RESPONSETYPE="responseType";
       // public static String FROM="from";
       // public static String TO="to";
        public static String ECGDATA="ecgData";
        public static String OPDDATA="opdData";
        public static String VPDDATA="vpdData";
        public static String SDPDATA="sdpData";
        public static String FUNDREORT="fundReort";
        public static String REFUNDREORT="refundReort";
        public static String VISITREORT="visitReort";
        public static String TECHSUPPORTREORT="techSupportReort";
        public static String EVENTREPORT="eventreport";
        public static String FUNDID="fundId";
        public static String REFUNDID="refundId";
        public static String VISITID="visitId";
        public static String TECHID="techId";
        public static String CHMDATA="chmData";
      /*  public static String FUND="fund";
        public static String PAYMENTDATE="paymentDate";
        public static String REFUNDAMOUNT="refundAmount";
        public static String REFUND="refund";*/

        // 17-8 shivani
        public static String ACCOUNTNAME="accountName";
        public static String BALANCEBEFOREREFUND="balanceBeforeRefund";
        public static String P_DATA="p_data";
        public static String COUNTRYNAME="countryName";
        public static String OPINIONDOC="opinionDoc";
        public static String LICENCE_COPY="licence_copy";
        public static String HOSPITAL_CAP="Hospital";

        // 18-8
        public static String PROFILEDETAILSSPACE="profile details";
        public static String PROFILE_DETAILS="profile_details";
        public static String CENTERIMAGE="centerImage";
   //     public static String IDENTITY="identity";
        public static String OLD="old";
        public static String NEW="new";
        public static String NEW_CONFIRM="new_confirm";

    }





























}
