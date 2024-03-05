package com.example.petmanagementsystem.controller;

import com.example.petmanagementsystem.model.Pet;
import com.example.petmanagementsystem.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

   

    @GetMapping("/")
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }

    @GetMapping("/{id}")
    public Optional<Pet> getPetById(@PathVariable Long id) {
        return petService.getPetById(id);
    }

    @PostMapping("/")
    public void savePet(@RequestBody Pet pet) {
        petService.savePet(pet);
    }

    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable Long id) {
        petService.deletePet(id);
    }
    
    
    @PutMapping("/{id}")
    public ResponseEntity<String> updatePet(@PathVariable Long id, @RequestBody Pet updatedPet) {
        Optional<Pet> optionalPet = petService.getPetById(id);
        if (optionalPet.isPresent()) {
            Pet existingPet = optionalPet.get();
            // Update only if the provided pet has non-null values
            if (updatedPet.getName() != null) {
                existingPet.setName(updatedPet.getName());
            }
            if (updatedPet.getAge() != 0) {
                existingPet.setAge(updatedPet.getAge());
            }
            if (updatedPet.getBreed() != null) {
                existingPet.setBreed(updatedPet.getBreed());
            }
            if (updatedPet.getDescription() != null) {
                existingPet.setDescription(updatedPet.getDescription());
            }
            petService.savePet(existingPet);
            return ResponseEntity.ok("Pet updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
