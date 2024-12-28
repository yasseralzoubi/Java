package com.axsos.burgertracker.service;


import com.axsos.burgertracker.model.Burger;
import com.axsos.burgertracker.repository.BurgerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BurgerService {
    private final BurgerRepo burgerRepo;
    public BurgerService(BurgerRepo burgerRepo) {
        this.burgerRepo = burgerRepo;
    }

//    add burger
    public void createBurger(Burger burger) {
        burgerRepo.save(burger);
    }

//   find all
    public List<Burger> findAllBurgers() {
        return burgerRepo.findAll();
    }

}
