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

class EngineTest {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private Engine engine;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	emf = Persistence.createEntityManagerFactory("SportsCarDB");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	emf.close();}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		engine = em.find(Engine.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
	em.close();
	engine = null;
	}

	@Test
	void test_engine_to_car_mappings() {
		Engine engine = em.find(Engine.class, 1);
		List<Car> cars = engine.getCars();
		assertNotNull(cars);
		assert(cars.size() > 0);
	}
	
	@Test
	void test_mapping_to_engine() {
		assertEquals("2ZZ-GE", engine.getName());
	}

}
