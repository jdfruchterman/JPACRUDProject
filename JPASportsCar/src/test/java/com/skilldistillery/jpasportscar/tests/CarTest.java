package com.skilldistillery.jpasportscar.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpasportscar.entities.Car;

class CarTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Car car;

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
		car = em.find(Car.class, 5);
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
		assertEquals("GT", car.getTrim());
		assertEquals(2, car.getDoors());
		assertEquals("4AGE", car.getEngine());
		assertEquals(2200, car.getWeight());
		assertEquals(114, car.getHorsepower());
		assertEquals(89, car.getTorque());
		assertEquals(8.9, car.getZerotosixty());
		
		
	}
	

}
