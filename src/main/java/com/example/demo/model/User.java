package com.example.demo.model;
@Entity
public class User{
    @ID
    private Long id;
    private String email;
    private String password;
    private String role;

   public Long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
   
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role=role;
    }
}