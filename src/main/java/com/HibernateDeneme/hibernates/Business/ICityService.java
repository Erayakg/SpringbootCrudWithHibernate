package com.HibernateDeneme.hibernates.Business;

import com.HibernateDeneme.hibernates.entities.City;

import java.util.List;

public interface ICityService {
    List<City> getAll();
    void add(City city);
    void delete(City city);
    void  Update(City city);
    City getById(int id);

}
