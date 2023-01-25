package com.HibernateDeneme.hibernates.Business;

import com.HibernateDeneme.hibernates.Dao.ICityDao;
import com.HibernateDeneme.hibernates.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
public class CityManager implements ICityService{
    private ICityDao cityDao;

    public CityManager() {
    }

    @Autowired
    public CityManager(ICityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    @Transactional
    public List<City> getAll() {
        return this.cityDao.getAll();
    }

    @Override
    @Transactional
    public void add(City city) {
        //business
    this.cityDao.add(city);
    }
    @Override
    @Transactional
    public void delete(City city) {
        this.cityDao.delete(city);
    }
    @Override
    @Transactional
    public City getById(int id) {
        this.cityDao.getById(id);

        return null;
    }
    @Override
    @Transactional
    public void Update(City city) {
        this.cityDao.Update(city);
    }
}
