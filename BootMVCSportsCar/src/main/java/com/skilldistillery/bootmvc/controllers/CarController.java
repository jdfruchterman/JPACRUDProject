package com.skilldistillery.bootmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.bootmvc.data.CarDAO;
import com.skilldistillery.jpasportscar.entities.Car;

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
	public ModelAndView edit(@RequestParam("id")int id, @RequestParam("model")String model, @RequestParam("make")String make, @RequestParam("year")int year, @RequestParam("trim")String trim, @RequestParam("doors")int doors,@RequestParam("engine") String engine, @RequestParam("weight")int weight, @RequestParam("horsepower")int horsepower, @RequestParam("torque")int torque, @RequestParam("0to60")String zerotosixty ) {
		ModelAndView mv = new ModelAndView();
		Car editedCar = new Car();
//		newCar.setId(0); going to reuse id but don't need it as this is tempobject
		editedCar.setModel(model);
		editedCar.setMake(make);
		editedCar.setYear(year);
		editedCar.setTrim(trim);
		editedCar.setDoors(doors);
		editedCar.setEngine(engine);
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
	@RequestMapping(path="createCar.do", method=RequestMethod.POST)
	public ModelAndView create(@RequestParam("model")String model, @RequestParam("make")String make, @RequestParam("year")int year, @RequestParam("trim")String trim, @RequestParam("doors")int doors,@RequestParam("engine") String engine, @RequestParam("weight")int weight, @RequestParam("horsepower")int horsepower, @RequestParam("torque")int torque, @RequestParam("0to60")String zerotosixty ) {
		ModelAndView mv = new ModelAndView();
		Car newCar = new Car();
		newCar.setId(0);
		newCar.setModel(model);
		newCar.setMake(make);
		newCar.setYear(year);
		newCar.setTrim(trim);
		newCar.setDoors(doors);
		newCar.setEngine(engine);
		newCar.setWeight(weight);
		newCar.setHorsepower(horsepower);
		newCar.setTorque(torque);
		double zeroToSixty = Double.parseDouble(zerotosixty);
		newCar.setZerotosixty(zeroToSixty);
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
	
	@RequestMapping(path= {"home.do", "/"})
	public String index() {
	  return "WEB-INF/index.jsp";
	  // return "index"; // if using a ViewResolver.
	}
}
