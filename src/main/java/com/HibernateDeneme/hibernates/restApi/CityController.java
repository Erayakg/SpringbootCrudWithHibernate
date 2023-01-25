package com.HibernateDeneme.hibernates.restApi;

import com.HibernateDeneme.hibernates.Business.ICityService;
import com.HibernateDeneme.hibernates.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class CityController {
    private ICityService iCityService;
    @Autowired
    public CityController(ICityService iCityService) {
        this.iCityService = iCityService;
    }
    @GetMapping("/cities")
    public List<City> get(){
        return iCityService.getAll();
    }
    @PostMapping("/update")
    public void update(@RequestBody City city){
        iCityService.Update(city);
    }
    @PostMapping("/delete")
    public void delete(@RequestBody City city){
        iCityService.delete(city);
    }
    @PostMapping("/add")
    public void add(@RequestBody City city){
        iCityService.add(city);
    }
    @GetMapping("/cities/{id}")
    public City getById(@PathVariable int id){
        return iCityService.getById(id);
    }



}
