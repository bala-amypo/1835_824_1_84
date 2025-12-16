package com.example.demo.model;
public class ServiceEntry{
    private Long id;
    private String vehicle;
    private String garage;
    private String serviceType;
    private Date serviceDate;
    private Integer odometerReading;
    private String description;
    private Timestamp recordedAt;

    public Long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;

     public String getGarage(){
        return garagen;
    }
    public void setGarage(String garagename){
        this.garagename=garagename;
    }   
}