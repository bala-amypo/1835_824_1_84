package.com.example.demo.model;
import.jakarta.persistence.Entity;
import.jakarta.persistence.Id;
@Entity
public class VerificationLog{
    @ID
    private Long id;
    private String ServiceEntry;
    private Timestamp verifiedAt=new Timestamp(System.currentTimeMillis());
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
        return verifiedAt;
    }
    public void setVerifiedAt(Timestamp verifiedAtAt){
        this.verifiedAt=verifiedAt;
    }

    public Boolean getVerifiedbySystem(){
        return verifiedbySystem;
    }
    public void setVerifiedbySystem(Boolean verifiedbySystem){
        this.verifiedbySystem=verifiedbySystem;
    }

    public String getNotes(){
        return notes;
    }
    public void setNotes(String notes){
        this.notes=notes;
    }
     public VerificationLog(Long id,String serviceEntry, Timestamp verifiedAt, Boolean verifiedBySystem,String notes){
    this.id=id;
    this.serviceEntry=serviceEntry;
    this.verifiedAt=verifiedAt;
    this.verifiedBySystem=verifiedBySystem;
    
}
    public VerificationLog{

}
}