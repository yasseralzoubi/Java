package com.axsos.savetravel.savetravel.Service;


import com.axsos.savetravel.savetravel.Repository.ExpenseRepo;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.axsos.savetravel.savetravel.models.Expense;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepo expenseRepo;
    public ExpenseService(ExpenseRepo expenseRepo) {
        this.expenseRepo = expenseRepo;
    }
//    public Expense create(Expense expense) {
//        return expenseRepo.save(expense);
//    }
    public Expense create(Expense expense){
        return expenseRepo.save(expense);
    }
    public List<Expense> findAllExpenses() {
        return expenseRepo.findAll();
    }

//    get by id
    public Expense findExpenseById(Long id) {
        return expenseRepo.findById(id).orElse(null);

    }

//    Delete expense
    public void deleteExpenseById(Long id) {
        expenseRepo.deleteById(id);
    }


// Update expense
    public Expense update(Expense expense) {
        return expenseRepo.save(expense);
    }
}
