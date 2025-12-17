package com.example.demo.model;
public class Vehicle{
    private Long id;
    private String vin;
    private String make;
    private String model;
    private Integer year;
    private Long ownerId;
    private Boolean active;
    private Timestamp createdAt;

    public Long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }

    public String getVin(){
        return vin;
    }
    public void setVin(String vin){
        this.vin=vin;
    }

     public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make=make;
    }

     public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }

     public St getYear(){
        return vin;
    }
    public void setVin(String vin){
        this.vin=vin;
    }
}