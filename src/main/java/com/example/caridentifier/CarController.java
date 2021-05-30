package com.example.caridentifier;

import org.springframework.web.bind.annotation.*;


@RequestMapping("/carprediction/")
@org.springframework.web.bind.annotation.RestController
public class CarController {


    @PostMapping("/car")
    Car getCar(@RequestBody String modell){
        System.out.println("Request - " + modell);
        Car car = new Car();
        try {
            for(String s: Marke.brands){
                if(modell.startsWith(s)){
                    car.setMarke(s);
                    car.setModell(modell.substring(s.length() + 1));
                }
            }
        } catch (Exception e){
            System.out.println("ooops... something happened! " + modell);
        }

        return car;
    }
}
