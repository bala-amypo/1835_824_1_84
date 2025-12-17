package.com.example.demo.model;
public class VerificationLog{
    private Long id;
    private String ServiceEntry;
    private Timestamp verifiedAt=new;
    private Boolean verifiedbySystem;
    private String notes;

    public Long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }

     public String getServiceEntry(){
        return ServiceEntry;
    }
    public void setServiceEntry(String ServiceEntry){
        this.serviceEntry=serviceEntry;
    }

     public Timestamp getVerifiedAt(){
        return recordedAt;
    }
    public void setRecordedAt(Timestamp recordedAt){
        this.recordedAt=recordedAt;
    }
}