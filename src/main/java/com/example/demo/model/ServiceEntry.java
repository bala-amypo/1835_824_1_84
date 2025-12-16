package com.example.demo.model;
public class ServiceEntry
{
    private Long id;
    private String vehicle;
    private String garage;
    private String serviceType;
    private Date serviceDate;
    private Integer odometerReading;
    private String description;
    private Timestamp recordedAt=new;

    public Long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    
    public String getVehicle(){
        return vehicle;
    }
    public void setVehicle(String vehicle){
        this.vehicle=vehicle;
    }
     public String getGarage(){
        return garage;
    }
    public void setGarage(String garage){
        this.garage=garage;
    }   

    public String getServiceType(){
        return serviceType;
    }
    public void setServiceType(String serviceType){
        this.serviceType=serviceType;
    }
   public Date getServiceDate(){
        return serviceDate;
    }
    public void setServiceDate(Date serviceDate){
        this.serviceDate=serviceDate; 
}
    public Integer getOdometerReading(){
        return odometerReading;
    }
    public void setOdometerReading(Integer odometerReading){
        this.odometerReading=odometerReading;
    }

    public String getDescription(){
        return description;
    }
    public void set description(String vehicle){
        this.vehicle=vehicle;
    }

}
    