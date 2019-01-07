package com.skilldistillery.bootmvc.data;

import java.util.List;

import com.skilldistillery.jpasportscar.entities.Car;
import com.skilldistillery.jpasportscar.entities.Engine;

public interface CarDAO {
	public Car create(Car car);
	public Car update(int id, Car car);
	public Car find(int id);
	public boolean destroy(int id);
	public List<Car> getCarsByKeyword(String keyWord);
	public List<Car> listAllCars();
	public Engine createEngine(Engine engine);
	List<Engine> listAllEngines();

}
