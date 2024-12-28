package com.axsos.burgertracker.repository;

import com.axsos.burgertracker.model.Burger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BurgerRepo extends CrudRepository<Burger, Long> {
    List<Burger> findAll();
}
