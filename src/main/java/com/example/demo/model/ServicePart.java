package com.example.demo.model;
public class ServicePart{
    private Long id;
    private String serviceType;
    private String partName;
    private String partNumber;
    private BigDecimal cost;
    private Integer quantity;
    
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getServiceType(){
        return serviceType;
    }
    public void setServiceType(String serviceType){
        this.serviceType=serviceType;
    }

    public String getPartName(){
        return partName;
    }
    public void setPartName(String partName){
        this.partName=partName;
    }

    public String getPartNumber(){
        return partNumber;
    }
    public void setPartNumber(String vehicle){
        this.partNumber=partNumber;
    }

    public String getVehicle(){
        return vehicle;
    }
    public void setVehicle(String vehicle){
        this.vehicle=vehicle;
    }
}