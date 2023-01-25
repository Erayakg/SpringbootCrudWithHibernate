package com.HibernateDeneme.hibernates.Dao;

import com.HibernateDeneme.hibernates.entities.City;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Repository
public class HibernateCityDao implements ICityDao{
    private  EntityManager entityManager;
    @Autowired
    public HibernateCityDao(EntityManager entityManager) {

        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<City> getAll() {

        Session session=entityManager.unwrap(Session.class);

        List<City> cities = session.createQuery("from  City",City.class).getResultList();
        return cities;
    }
    @Override
    public City getById(int id) {

        Session session=entityManager.unwrap(Session.class);
        City city =session.get(City.class,id);
        return city;
    }

    @Override
    public void add(City city) {
        Session session=entityManager.unwrap(Session.class);
        session.persist(city);
    }
    @Override
    public void delete(City city) {
         Session session=entityManager.unwrap(Session.class);
         session.delete(city);
    }

    @Override
    public void Update(City city) {
        Session session=entityManager.unwrap(Session.class);
        session.persist(city);
    }
}
