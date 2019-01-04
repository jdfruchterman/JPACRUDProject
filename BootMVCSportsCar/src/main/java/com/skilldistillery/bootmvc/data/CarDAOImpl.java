package com.skilldistillery.bootmvc.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpasportscar.entities.Car;

@Transactional
@Service
public class CarDAOImpl implements CarDAO {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public Car create(Car car) {
//		em.getTransaction().begin();
		em.persist(car);
		em.flush();
//		em.getTransaction().commit();
		return car;
	}

	@Override
	@Transactional
	public Car update(int id, Car car) {
		Car carToEdit = em.find(Car.class, id);
		carToEdit.setMake(car.getMake());
		carToEdit.setModel(car.getModel());
		carToEdit.setYear(car.getYear());
		carToEdit.setTrim(car.getTrim());
		carToEdit.setDoors(car.getDoors());
		carToEdit.setEngine(car.getEngine());
		carToEdit.setWeight(car.getWeight());
		carToEdit.setHorsepower(car.getHorsepower());
		carToEdit.setTorque(car.getTorque());
		carToEdit.setZerotosixty(car.getZerotosixty());
		return carToEdit;
	}

	@Override
	public Car find(int id) {
		return em.find(Car.class, id);
	}

	@Override
	@Transactional
	public boolean destroy(int id) {
		Car carToDelete = em.find(Car.class, id);
		em.remove(carToDelete);
		return false;
	}
	
}
