package com.aelius.caringheartcenterofficer.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Awesome Pojo Generator
 */
public class Data {
    @SerializedName("salt")
    @Expose
    private String salt;
    @SerializedName("activation_code")
    @Expose
    private String activation_code;
    @SerializedName("last_login")
    @Expose
    private String last_login;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("userDetailsId")
    @Expose
    private String userDetailsId;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("last_name")
    @Expose
    private String last_name;
    @SerializedName("ip_address")
    @Expose
    private String ip_address;
    @SerializedName("createByUserId")
    @Expose
    private String createByUserId;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("forgotten_password_time")
    @Expose
    private String forgotten_password_time;
    @SerializedName("created_on")
    @Expose
    private String created_on;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("user_id")
    @Expose
    private String user_id;
    @SerializedName("remember_code")
    @Expose
    private String remember_code;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("userType")
    @Expose
    private String userType;
    @SerializedName("userRole")
    @Expose
    private String userRole;
    @SerializedName("first_name")
    @Expose
    private String first_name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("forgotten_password_code")
    @Expose
    private String forgotten_password_code;
    @SerializedName("username")
    @Expose
    private String username;

    public Data() {
    }
/* "id": "332",
         "ip_address": "123.201.108.163",
         "username": "malik@aelius.in",
         "password": "$2y$08$5eSIsuOG5mAF5auC0GJVWeLqnuZx.66OXgMI1g/dVBcW5DnkmbR/W",
         "salt": null,
         "email": "malik@aelius.in",
         "activation_code": null,
         "forgotten_password_code": null,
         "forgotten_password_time": null,
         "remember_code": null,
         "created_on": "1512193190",
         "last_login": "1540453644",
         "active": "1",
         "first_name": "Malik",
         "last_name": "khan",
         "company": null,
         "phone": null,
         "userDetailsId": "80",
         "userType": "13",
         "userRole": "30",
         "displayName": "Malik Khan",
         "createByUserId": "327",
         "user_id": "332"*/
    public Data(String salt, String activation_code, String last_login, String displayName, String userDetailsId, String active, String last_name, String ip_address, String createByUserId, String password, String forgotten_password_time, String created_on, String phone, String user_id, String remember_code, String company, String id, String userType, String userRole, String first_name, String email, String forgotten_password_code, String username) {
        this.salt = salt;
        this.activation_code = activation_code;
        this.last_login = last_login;
        this.displayName = displayName;
        this.userDetailsId = userDetailsId;
        this.active = active;
        this.last_name = last_name;
        this.ip_address = ip_address;
        this.createByUserId = createByUserId;
        this.password = password;
        this.forgotten_password_time = forgotten_password_time;
        this.created_on = created_on;
        this.phone = phone;
        this.user_id = user_id;
        this.remember_code = remember_code;
        this.company = company;
        this.id = id;
        this.userType = userType;
        this.userRole = userRole;
        this.first_name = first_name;
        this.email = email;
        this.forgotten_password_code = forgotten_password_code;
        this.username = username;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSalt() {
        return salt;
    }

    public void setActivation_code(String activation_code) {
        this.activation_code = activation_code;
    }

    public String getActivation_code() {
        return activation_code;
    }

    public void setLast_login(String last_login) {
        this.last_login = last_login;
    }

    public String getLast_login() {
        return last_login;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setUserDetailsId(String userDetailsId) {
        this.userDetailsId = userDetailsId;
    }

    public String getUserDetailsId() {
        return userDetailsId;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getActive() {
        return active;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setCreateByUserId(String createByUserId) {
        this.createByUserId = createByUserId;
    }

    public String getCreateByUserId() {
        return createByUserId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setForgotten_password_time(String forgotten_password_time) {
        this.forgotten_password_time = forgotten_password_time;
    }

    public String getForgotten_password_time() {
        return forgotten_password_time;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setRemember_code(String remember_code) {
        this.remember_code = remember_code;
    }

    public String getRemember_code() {
        return remember_code;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setForgotten_password_code(String forgotten_password_code) {
        this.forgotten_password_code = forgotten_password_code;
    }

    public String getForgotten_password_code() {
        return forgotten_password_code;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}