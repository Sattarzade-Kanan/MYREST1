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

    public String getName() {
        return name;
    }

    public Integer getIdPilot() {
        return idPilot;
    }

    public Double getAge() {
        return age;
    }

    public Integer getPlaneId() {
        return PlaneId;
    }
}
