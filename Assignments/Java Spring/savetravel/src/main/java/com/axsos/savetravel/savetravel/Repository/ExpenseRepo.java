package com.axsos.savetravel.savetravel.Repository;

import com.axsos.savetravel.savetravel.models.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepo extends CrudRepository<Expense, Long> {
    List<Expense> findAll();
}
