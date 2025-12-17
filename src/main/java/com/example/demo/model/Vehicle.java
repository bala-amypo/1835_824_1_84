package com.example.demo.model;
import.jakarta.persistence.Entity;
import.jakarta.persistence.Id;
@Entity
public class Vehicle{
    @ID
    private Long id;
    private String vin;
    private String make;
    private String model;
    private Integer year;
    private Long ownerId;
    private Boolean active;
    private Timestamp createdAt=new;

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

     public Integer getYear(){
        return year;
    }
    public void setyear(Integer year){
        this.year=year;
    }

     public Long getOwnerId(){
        return ownerId;
    }
    public void setOwnerId(Long ownerId){
        this.ownerId=ownerId;
    }

      public Boolean getActive(){
        return active;
    }
    public void setActive(Boolean active){
        this.active=active;
    }

     public Timestamp getRecordedAt(){
        return recordedAt;
    }
    public void setRecordedAt(Timestamp recordedAt){
        this.recordedAt=recordedAt;
    }
}