package com.example.StartRest.RestKenanProject.Model;

public class AirPortSystem {

    private String name;
    private Integer idPilot;

  private String username;
  private String databershday;

    public AirPortSystem(String name, Integer idPilot ,String username,String databershday){
        this.name = name;
        this.idPilot = idPilot;
        this.username= username;
        this.databershday = databershday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public Integer getIdPilot() {
        return idPilot;
    }

    public void setIdPilot(Integer idPilot) {
        this.idPilot = idPilot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatabershday() {
        return databershday;
    }

    public void setDatabershday(String databershday) {
        this.databershday = databershday;
    }
}
