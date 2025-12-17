package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Garage{
    @Id
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

    public garage(Long id, String garagename, String address, String model,Integer year, Long ownerId, Boolean active Timestamp createdAt){
        this.id=id;
        this.vin=vin;
         this.make=make;
         this.model=model;
         this.year=year;
        this.ownerId=ownerId;
         this.active=active;
         this.createdAt=createdAt;
     }

    public garage(){

     }
}