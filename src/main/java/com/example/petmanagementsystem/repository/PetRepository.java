package com.example.petmanagementsystem.repository;

import com.example.petmanagementsystem.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PetRepository extends JpaRepository<Pet, Long>{

}
