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
        this.id=id;
    }
}