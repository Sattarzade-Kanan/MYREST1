package com.example.StartRest.RestKenanProject.Controller;

import com.example.StartRest.RestKenanProject.Model.AirPortSystem;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/users")
public class AirPortController {

    private final List<AirPortSystem> users = new ArrayList<>(List.of(
            new AirPortSystem("Kenan" , 1 , "Sattarzade" , "2014"),
            new AirPortSystem("Mirali" , 2 , "Mansurov" , "2010"),
            new AirPortSystem("Nadir" , 3, "Azimov" , "2010"),
            new AirPortSystem("Cemil" , 4, "Eliyev" , "2108"),
            new AirPortSystem("Zakir" , 5 , "Ashirli" , "2000"))
    );
    //Показать все пользователей!
    @GetMapping("/all")
    public List<AirPortSystem> getAllUsers(){
        return users;
    }
    //Find for id
    @GetMapping("/{idPilot}")
    public AirPortSystem getId(@PathVariable Integer idPilot){

        for (AirPortSystem user:users){
            if (user.getIdPilot().equals(idPilot)){
                return user;
            }
        }
        return null;
    }
    //Add New User
         @PostMapping("/add")
          public  String createUser(@RequestBody AirPortSystem newuser){
           users.add(newuser);
             return "Добавлен новый пользователь под именем:" + newuser.getName();
    }

    //Update User
       @PutMapping("/update/{idPilot}")
       public String updateUser(@PathVariable Integer idPilot , @RequestBody AirPortSystem updatedMyuser){
        for (int i = 0; i< users.size(); i++){
          AirPortSystem exsistingupdate = users.get(i);
             if (exsistingupdate.getIdPilot().equals(idPilot)){
                 users.set(i , updatedMyuser);
                 return "User Updated";
          }
        }
 return null;
    }
//Delete User
     @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer idPilot ){
         for (AirPortSystem portSystem :users) {
            if (portSystem.getIdPilot().equals(idPilot)){
                users.remove(portSystem);
                return "User Deleted!";
            }
         }
         return "Error The your commond!Please check code Kenan ne vnematelniy!";
    }
}
