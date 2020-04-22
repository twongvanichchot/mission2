package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.*;



@Service
public class petService {
    private static List<pet> petList = new ArrayList<>(Arrays.asList(
                new pet((long) 1,"dog","Tako","Male",5000),
                new pet((long)2,"dog","Micha","Female",3000),
                new pet((long)3,"cat","Nami","Female",2000)
        ));


    public List<pet> getPet() {
        return petList;
    }

    public pet getPet(Long id) {
        return petList.stream().filter(pet -> pet.getId().equals(id)).findFirst().get();
    }

    public pet addPet(pet pet) {
        petList.add(pet);
        return pet;
    }

    public void updatePet(pet pet, Long id) {
        int counter = 0;
        for (pet petTemp : petList) {
            if (petTemp.getId().equals(id)){
                petList.set(counter, pet);
            }counter++;
        }
    }

    public void deletePet(Long id) {
        petList.removeIf(pet -> pet.getId().equals(id));
    }
}
