package com.example.StartRest.RestKenanProject.Controller;

import com.example.StartRest.RestKenanProject.Model.AirPortSystem;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/books")
public class AirPortController {

    private final List<AirPortSystem> books = new ArrayList<>(List.of(new AirPortSystem("Kenan(Новичок 2 уровня)", 5, 11.2, 466788998),
            new AirPortSystem("Mirali(Новичок)", 3, 14.6, 463655221),
            new AirPortSystem("Cemil(Новичок)", 9, 13.5, 469965573),
            new AirPortSystem("Mansur(Новичок)", 1, 12.3, 461324327),
            new AirPortSystem("Zakir(Главный пилот!)", 7, 23.4, 999999998),
            new AirPortSystem("Elmar(Новичок)", 8, 13.9, 462247378)));


    @GetMapping("/all")
    public List<AirPortSystem> allpoi() {
        return books;
    }

//    @GetMapping("/{idPilot}")
//    public String idPilot(@PathVariable Integer idPilot) {
//        return "Здесь написанны айди пилотов" + idPilot;
//    }

    @GetMapping("/{age}")
    public String idPilot(@PathVariable Double age) {
        return "Здесь написанны возрост пилота Кянан пилотов" + age;
    }

    @GetMapping("/{idPilot}")
    public AirPortSystem getPortid(@PathVariable Integer idPilot) {
        for (AirPortSystem portSystem : books) {
            if (portSystem.getIdPilot().equals(idPilot)) {
                return portSystem;
            }
        }
        return null;
    }

    @PostMapping("/add")
    public String addnew(@RequestBody AirPortSystem newport) {
        books.add(newport);
        return "New port addend" + newport.getName();
    }

    @PutMapping("/update/{idPilot}")
    public String update(@PathVariable Integer idPilot, @RequestBody AirPortSystem updatedBanana) {

        for (int i = 0; i < books.size(); i++) {
            AirPortSystem exstingPort = books.get(i);
            if (exstingPort.getIdPilot().equals(idPilot)) {
                books.set(i, updatedBanana);
                return "Book Updated";
            }
        }
        return null;
    }
}
