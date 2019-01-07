package com.skilldistillery.jpasportscar.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Engine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int cylinders;
	private String displacement;
	private String configuration;
	
	@OneToMany(mappedBy= "engine")
	private List<Car> cars;

	public void addCar(Car car) {
		if (cars == null)
			cars = new ArrayList<>();
		if (!cars.contains(car)) {
			cars.add(car);
			if (car.getEngine() != null) {
				car.getEngine().getCars().remove(car);
			}
			car.setEngine(this);
		}
	}

	public void removeCar(Car car) {
		car.setEngine(null);
		if (cars != null) {
			cars.remove(car);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", name=" + name + ", cylinders=" + cylinders + ", displacement=" + displacement
				+ ", configuration=" + configuration + "]";
	}

	public Engine() {
	}

	public Engine(int id, String name, int cylinders, String displacement, String configuration, List<Car> cars) {
		super();
		this.id = id;
		this.name = name;
		this.cylinders = cylinders;
		this.displacement = displacement;
		this.configuration = configuration;
		this.cars = cars;
	}

	public Engine(int id, String name, int cylinders, String displacement, String configuration) {
		super();
		this.id = id;
		this.name = name;
		this.cylinders = cylinders;
		this.displacement = displacement;
		this.configuration = configuration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public String getDisplacement() {
		return displacement;
	}

	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
