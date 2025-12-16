package com.example.demo.model;
public class Garage{
    private Long id;
    private String garagename;
    private String address;
    private String contactNumber;
    private Boolean active;

    public Long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
     public String getGaragename(){
        return garagename;
    }
    public void setGaragename(String garagename){
        this.garagename=garagename;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber=contactNumber;
    }
    public Boolean getActive(){
        return active;
    }
    public void setActive(Boolean active){
        this.active=active;
    }
}