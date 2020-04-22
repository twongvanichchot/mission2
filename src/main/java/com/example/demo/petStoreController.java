package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/v1")
public class petStoreController {

    @Autowired
    private petService petService;

    //GET all pet
    @GetMapping("/pets")
    public List<pet> getPet() {
        return petService.getPet();
    }

    //GET specific pet by ID
    @GetMapping("/pets/{id}")
    public pet getPet(@PathVariable Long id) {
        return petService.getPet(id);
    }

    //POST create new pet
    @PostMapping("/pets")
    public pet addPet(@RequestBody pet pet) {
        return petService.addPet(pet);
    }

    //PUT update pet
    @PutMapping("/pets/{id}")
    public void updatePet(@RequestBody pet pet, @PathVariable Long id) {
        petService.updatePet(pet, id);
    }

    //DELETE remove pet
    @DeleteMapping("pets/{id}")
    public void deletePet(@PathVariable Long id) {
        petService.deletePet(id);
    }

}