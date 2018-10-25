package com.aelius.caringheartcenterofficer.login;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Awesome Pojo Generator
 * */
public class LoginModel{
  @SerializedName("data")
  @Expose
  private Data data;
  @SerializedName("message")
  @Expose
  private String message;
  @SerializedName("status")
  @Expose
  private Boolean status;
  public LoginModel(){
  }
  public LoginModel(Data data, String message, Boolean status){
   this.data=data;
   this.message=message;
   this.status=status;
  }
  public void setData(Data data){
   this.data=data;
  }
  public Data getData(){
   return data;
  }
  public void setMessage(String message){
   this.message=message;
  }
  public String getMessage(){
   return message;
  }
  public void setStatus(Boolean status){
   this.status=status;
  }
  public Boolean getStatus(){
   return status;
  }
}