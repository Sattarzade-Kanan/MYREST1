package com.example.StartRest.RestKenanProject.Model;

public class AirPortSystem {

    private String name;
    private Integer idPilot;
    private Double age;
    private Integer PlaneId;

    public AirPortSystem(String name, Integer idPilot , Double age,Integer PlaneId){
        this.name = name;
        this.idPilot = idPilot;
        this.age = age;
        this.PlaneId = PlaneId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdPilot(Integer idPilot) {
        this.idPilot = idPilot;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public void setPlaneId(Integer planeId) {
        PlaneId = planeId;
    }

    public String getName() {
        return name;
    }

    public Integer getIdPilot() {
        return idPilot;
    }
}
