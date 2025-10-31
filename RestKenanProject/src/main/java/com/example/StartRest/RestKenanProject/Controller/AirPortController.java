package com.example.StartRest.RestKenanProject.Controller;

import com.example.StartRest.RestKenanProject.Model.AirPortSystem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
public class AirPortController {
    @GetMapping("/banana")
    public List<AirPortSystem> getAirPortSystem(){
        return List.of(
                new AirPortSystem  ("Kenan(Новичок 2 уровня)" , 5827436 , 11.2 , 466788998),
                new AirPortSystem     ("Mirali(Новичок)" , 5824535, 14.6 , 463655221),
                new AirPortSystem   ("Cemil(Новичок)" , 5846789, 13.5 , 469965573),
                new AirPortSystem    ("Mansur(Новичок)" , 58245211 , 12.3 , 461324327),
                new AirPortSystem    ("Zakir(Главный пилот!)" , 10000000 , 23.4 , 999999998)   ,
                new AirPortSystem    ("Elmar(Новичок)" , 5827436 , 13.9 , 462247378)

        );
    }
    public void securityUser(){
        System.out.println("Кянан пороль:" + 225634995);
        System.out.println("Мирали пороль:" + 564429074);
        System.out.println("Джамиль пороль:" + 573782991);
        System.out.println("Мансур пороль:" + 673218862);
        System.out.println("Закир пороль:" + "******* Доступен только персоналу!");
        System.out.println("Ельмар пороль:" + 975643345);

    }


    public static void main(String[] args) {
        int password1 = 532111985;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Напиши пороль от главного пилота!: ");
        String password = scanner.nextLine();

    }
}
