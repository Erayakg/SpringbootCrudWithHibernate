package com.HibernateDeneme.hibernates.Dao;

import com.HibernateDeneme.hibernates.entities.City;

import java.util.List;

public interface ICityDao {
    List<City> getAll();
    void add(City city);
    void delete(City city);
    void  Update(City city);
    City getById(int id);
}
