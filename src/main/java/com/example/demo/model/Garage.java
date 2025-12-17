package com.example.demo.model;
import jakarta.persistence.entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class Garage{
    @Id
    GeneratedValue(strategy= GenerationType.IDENTITY)
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

    public Garage(Long id, String garagename, String address, String contactNumber, Boolean active ){
        this.id=id;
        this.garagename=garagename;
         this.address=address;
         this.contactNumber=contactNumber;
         this.active=active;
     }

    public Garage(){

     }
}