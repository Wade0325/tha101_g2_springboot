package tw.idv.petpet.web.shelter.shelterAnimal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tw.idv.petpet.web.shelter.shelterAnimal.entity.ShelterAnimal;
import tw.idv.petpet.web.shelter.shelterAnimal.service.ShelterAnimalService;

@RestController
@RequestMapping("shelter")
public class AnimalEditController {
//	@Autowired
//	private ShelterAnimalService service;
//	@PostMapping("animalfindbyid/{animaId}")
//	@ResponseBody
//	public void edit(@PathVariable Integer animalId) {
//		service.findById(animalId);
//		System.out.println("123");
//	}
}