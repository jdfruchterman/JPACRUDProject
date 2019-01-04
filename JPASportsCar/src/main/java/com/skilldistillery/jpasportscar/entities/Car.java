package com.skilldistillery.jpasportscar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String model;
	private String make;
	private int year;
	private String trim;
	private int doors;
	private String engine;
	private int weight;
	private int horsepower;
	private int torque;
	@Column(name = "0to60")
	private double zerotosixty;

	public Car() {
	}

	public Car(String model, String make, int year, String trim, int doors, String engine, int weight, int horsepower,
			int torque, double zerotosixty) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
		this.trim = trim;
		this.doors = doors;
		this.engine = engine;
		this.weight = weight;
		this.horsepower = horsepower;
		this.torque = torque;
		this.zerotosixty = zerotosixty;
	}

	public Car(int id, String model, String make, int year, String trim, int doors, String engine, int weight,
			int horsepower, int torque, double zerotosixty) {
		super();
		this.id = id;
		this.model = model;
		this.make = make;
		this.year = year;
		this.trim = trim;
		this.doors = doors;
		this.engine = engine;
		this.weight = weight;
		this.horsepower = horsepower;
		this.torque = torque;
		this.zerotosixty = zerotosixty;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", make=" + make + ", year=" + year + ", trim=" + trim
				+ ", doors=" + doors + ", engine=" + engine + ", weight=" + weight + ", horsepower=" + horsepower
				+ ", torque=" + torque + ", zerotosixty=" + zerotosixty + "]";
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

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
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
