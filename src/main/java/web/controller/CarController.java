package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarServiceImp carServiceImp) {
        this.carService = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String printCarsParam(@RequestParam(value = "count", defaultValue = "5") int amount, Model model) {
        model.addAttribute("cars", carService.getAmountCars(amount));
        return "cars";
    }
}
