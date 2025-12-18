 package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.sql.Timestamp;

@Entity
public class VerificationLog {

    @Id
    private Long id;
    private String serviceEntry;
    private Timestamp verifiedAt = new Timestamp(System.currentTimeMillis());
    private Boolean verifiedbySystem;
    private String notes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceEntry() {
        return serviceEntry;
    }

    public void setServiceEntry(String serviceEntry) {
        this.serviceEntry = serviceEntry;
    }

    public Timestamp getVerifiedAt() {
        return verifiedAt;
    }

    public void setVerifiedAt(Timestamp verifiedAt) {
        this.verifiedAt = verifiedAt;
    }

    public Boolean getVerifiedbySystem() {
        return verifiedbySystem;
    }

    public void setVerifiedbySystem(Boolean verifiedbySystem) {
        this.verifiedbySystem = verifiedbySystem;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public VerificationLog(Long id, String serviceEntry, Timestamp verifiedAt,
                           Boolean verifiedbySystem, String notes) {
        this.id = id;
        this.serviceEntry = serviceEntry;
        this.verifiedAt = verifiedAt;
        this.verifiedbySystem = verifiedbySystem;
        this.notes = notes;
    }

    public VerificationLog() {
    }
}
