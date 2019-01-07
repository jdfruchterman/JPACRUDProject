package com.skilldistillery.jpasportscar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String model;
	private String make;
	private int year;
	private String trim;
	private int doors;
	@Column(name = "engine")
	private String engineLayout;
	private int weight;
	private int horsepower;
	private int torque;
	@Column(name = "0to60")
	private double zerotosixty;
	@ManyToOne
	@JoinColumn(name = "engine_id")
	private Engine engine;

	public Car() {
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
		Car other = (Car) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", make=" + make + ", year=" + year + ", trim=" + trim
				+ ", doors=" + doors + ", engineLayout=" + engineLayout + ", weight=" + weight + ", horsepower="
				+ horsepower + ", torque=" + torque + ", zerotosixty=" + zerotosixty + "]";
	}

	public Car(int id, String model, String make, int year, String trim, int doors, String engineLayout, int weight,
			int horsepower, int torque, double zerotosixty, Engine engine) {
		super();
		this.id = id;
		this.model = model;
		this.make = make;
		this.year = year;
		this.trim = trim;
		this.doors = doors;
		this.engineLayout = engineLayout;
		this.weight = weight;
		this.horsepower = horsepower;
		this.torque = torque;
		this.zerotosixty = zerotosixty;
		this.engine = engine;
	}

	public String getEngineLayout() {
		return engineLayout;
	}

	public void setEngineLayout(String engineLayout) {
		this.engineLayout = engineLayout;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTrim() {
		return trim;
	}

	public void setTrim(String trim) {
		this.trim = trim;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getTorque() {
		return torque;
	}

	public void setTorque(int torque) {
		this.torque = torque;
	}

	public double getZerotosixty() {
		return zerotosixty;
	}

	public void setZerotosixty(double zerotosixty) {
		this.zerotosixty = zerotosixty;
	}

}
