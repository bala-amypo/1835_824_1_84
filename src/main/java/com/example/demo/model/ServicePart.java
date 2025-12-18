package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;
@Entity
public class ServicePart{
    @Id
    private Long id;
    private String serviceEntry;
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

    public String getServiceEntry(){
        return serviceEntry;
    }
    public void setServiceEntry(String serviceEntry){
        this.serviceEntry=serviceEntry;
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
    public void setPartNumber(String partNumber){
        this.partNumber=partNumber;
    }

    public BigDecimal getCost(){
        return cost;
    }
    public void setCost(BigDecimal cost){
        this.cost=cost;
    }

    public Integer getQuantity(){
        return quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity=quantity;
    }
    public ServicePart(Long id,String serviceEntry,String partName,String partNumber,BigDecimal cost,Integer quantity){
    this.id=id;
    this.serviceEntry=serviceEntry;
    this.partName=partName;
    this.partNumber=partNumber;
    this.cost=cost;
    this.quantity=quantity;
    }
    public ServicePart(){

}
}