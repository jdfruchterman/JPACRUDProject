package com.skilldistillery.jpasportscar.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpasportscar.entities.Car;
import com.skilldistillery.jpasportscar.entities.Engine;

class CarTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Car car;
	private List<Car> cars;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("SportsCarDB");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		car = em.find(Car.class, 2);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		car = null;
	}

	@Test
	void test_Car_Mappings() {
		assertEquals("MR2", car.getModel() );
		assertEquals("Toyota", car.getMake());
		assertEquals(1986, car.getYear());
		assertEquals("Base", car.getTrim());
		assertEquals(2, car.getDoors());
		assertEquals(2282, car.getWeight());
		assertEquals(112, car.getHorsepower());
		assertEquals(97, car.getTorque());
		assertEquals(8.3, car.getZerotosixty());
		assertEquals("MR", car.getEngineLayout());
	}
	@Test
	void test_engine_car_mappings() {
		Car car = em.find(Car.class, 1);
		String expected = "2ZZ-GE";
		assertEquals(expected, car.getEngine().getName());
		
	}

}
