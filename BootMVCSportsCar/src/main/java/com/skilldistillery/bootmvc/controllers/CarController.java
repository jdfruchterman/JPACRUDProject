package com.skilldistillery.bootmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.bootmvc.data.CarDAO;
import com.skilldistillery.jpasportscar.entities.Car;
import com.skilldistillery.jpasportscar.entities.Engine;

@Controller
public class CarController {
	@Autowired
	private CarDAO dao;
	
	@RequestMapping(path="getCar.do", method=RequestMethod.GET)
	public ModelAndView getCar(@RequestParam("id") int id) {
		Car car = dao.find(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject(car);
		mv.setViewName("WEB-INF/car/showCar.jsp");
		return mv;
	}
	@RequestMapping(path="getCarByKeyword.do", method=RequestMethod.GET)
	public ModelAndView getCarsByKeyword(@RequestParam("keyword") String key) {
		List<Car> cars = dao.getCarsByKeyword(key);
		ModelAndView mv = new ModelAndView();
		mv.addObject("car", cars);
		mv.setViewName("WEB-INF/car/listCarsByKeyword.jsp");
		return mv;
	}
	@RequestMapping(path="listCars.do", method=RequestMethod.GET)
	public ModelAndView listCars() {
		List<Car> cars = dao.listAllCars();
		ModelAndView mv = new ModelAndView();
		mv.addObject("car", cars);
		mv.setViewName("WEB-INF/car/listCars.jsp");
		return mv;
	}
	@RequestMapping(path="listEngines.do", method=RequestMethod.GET)
	public ModelAndView listEngines() {
		List<Engine> engines = dao.listAllEngines();
		ModelAndView mv = new ModelAndView();
		mv.addObject("engine", engines);
		mv.setViewName("WEB-INF/car/listEngines.jsp");
		return mv;
	}
	
	
	
	@RequestMapping(path="editCar.do", method=RequestMethod.GET)
	public ModelAndView editCar(@RequestParam("id") int id) {
		Car car = dao.find(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject(car);
		mv.setViewName("WEB-INF/car/editCar.jsp");
		return mv;
	}
	
	
	
	@RequestMapping(path="deleteCar.do", method=RequestMethod.GET)
	public String deleteCar(@RequestParam("id") int id) {
		boolean destroyed = dao.destroy(id);
//		ModelAndView mv = new ModelAndView();
		
		return "WEB-INF/car/carDeleted.jsp";
	}
	
	
	
	
	@RequestMapping(path="editCar.do", method=RequestMethod.POST)
	public ModelAndView edit(@RequestParam("id")int id, @RequestParam("model")String model, @RequestParam("make")String make, @RequestParam("year")int year, @RequestParam("trim")String trim, @RequestParam("doors")int doors,@RequestParam("engineLayout") String engineLayout, @RequestParam("weight")int weight, @RequestParam("horsepower")int horsepower, @RequestParam("torque")int torque, @RequestParam("0to60")String zerotosixty ) {
		ModelAndView mv = new ModelAndView();
		Car editedCar = new Car();
//		newCar.setId(0); going to reuse id but don't need it as this is tempobject
		editedCar.setModel(model);
		editedCar.setMake(make);
		editedCar.setYear(year);
		editedCar.setTrim(trim);
		editedCar.setDoors(doors);
		editedCar.setEngineLayout(engineLayout);
		editedCar.setWeight(weight);
		editedCar.setHorsepower(horsepower);
		editedCar.setTorque(torque);
		double zeroToSixty = Double.parseDouble(zerotosixty);
		editedCar.setZerotosixty(zeroToSixty);
		editedCar = dao.update(id, editedCar);
		if(editedCar != null) {
			mv.addObject("car", editedCar);
			mv.setViewName("WEB-INF/car/editedCar.jsp");
		}
		else {
			mv.addObject("error", "Could not edit car, try again");
		}
		return mv;
	}
	
	@RequestMapping(path="createEngine.do", method=RequestMethod.POST)
	public ModelAndView createEngine(@RequestParam("name")String name, @RequestParam("displacement")String displacement, @RequestParam("cylinders")int cylinders, @RequestParam("configuration")String configuration) {
		ModelAndView mv = new ModelAndView();
		Engine newEngine = new Engine();
		newEngine.setId(0);
		newEngine.setName(name);
		newEngine.setCylinders(cylinders);
		newEngine.setDisplacement(displacement);
		newEngine.setConfiguration(configuration);
//		newEngine.setCars(null);
		
		newEngine = dao.createEngine(newEngine);
		if(newEngine != null) {
			mv.addObject("engine", newEngine);
			mv.setViewName("WEB-INF/car/newEngine.jsp");
		}
		else {
			mv.addObject("error", "Could not create engine, try again");
		}
		return mv;
	}
	@RequestMapping(path="createCar.do", method=RequestMethod.POST)
	public ModelAndView create(@RequestParam("model")String model, @RequestParam("make")String make, @RequestParam("year")int year, @RequestParam("trim")String trim, @RequestParam("doors")int doors,@RequestParam("engineLayout") String engineLayout, @RequestParam("weight")int weight, @RequestParam("horsepower")int horsepower, @RequestParam("torque")int torque, @RequestParam("0to60")String zerotosixty ) {
		ModelAndView mv = new ModelAndView();
		Car newCar = new Car();
		newCar.setId(0);
		newCar.setModel(model);
		newCar.setMake(make);
		newCar.setYear(year);
		newCar.setTrim(trim);
		newCar.setDoors(doors);
		newCar.setEngineLayout(engineLayout);
		newCar.setWeight(weight);
		newCar.setHorsepower(horsepower);
		newCar.setTorque(torque);
		double zeroToSixty = Double.parseDouble(zerotosixty);
		newCar.setZerotosixty(zeroToSixty);
		
		// add engine later:
		newCar.setEngine(null);
		
		newCar = dao.create(newCar);
		if(newCar != null) {
			mv.addObject("car", newCar);
			mv.setViewName("WEB-INF/car/newCar.jsp");
		}
		else {
			mv.addObject("error", "Could not create car, try again");
		}
		return mv;
	}
	@RequestMapping(path="createCar.do", method=RequestMethod.GET)
	public String addCar() {
		return "WEB-INF/car/addCar.jsp";
	}
	@RequestMapping(path="createEngine.do", method=RequestMethod.GET)
	public String addEngine() {
		return "WEB-INF/car/addEngine.jsp";
	}
	
	@RequestMapping(path= {"home.do", "/"})
	public String index() {
	  return "WEB-INF/index.jsp";
	  // return "index"; // if using a ViewResolver.
	}
}
