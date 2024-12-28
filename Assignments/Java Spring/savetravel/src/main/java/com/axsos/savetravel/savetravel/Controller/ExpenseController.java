package com.axsos.savetravel.savetravel.Controller;


import com.axsos.savetravel.savetravel.models.Expense;
import com.axsos.savetravel.savetravel.Service.ExpenseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;
    @GetMapping("/")
    public String index (@ModelAttribute(   "expense") Expense expense , Model model ) {

        model.addAttribute("expenses", expenseService.findAllExpenses());
        return "home.jsp";
    }
    @GetMapping("/{id}")
    public String getExpenseById(@PathVariable Long id, Model model) {
        model.addAttribute("expense", expenseService.findExpenseById(id));
        return "expense-details";
    }





    @PostMapping("/create")
    public String createExpense(@Valid @ModelAttribute("expense") Expense expense , BindingResult result,Model model) {
        if (result.hasErrors()) {
            model.addAttribute("expenses", expenseService.findAllExpenses());
            return "home.jsp";
        }
        expenseService.create(expense);
        return "redirect:/";
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") long id, Model model, @ModelAttribute("exp") Expense expense) {
        model.addAttribute("expense", expenseService.findExpenseById(id));
        return "edit.jsp";
    }


    @RequestMapping( value = "/update/{id}" , method = RequestMethod.PUT)
    public String editUser(@Valid @ModelAttribute("exp") Expense expense,BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        }
        else {
            expenseService.update(expense);
            return "redirect:/";
        }
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public String deleteExp(@ModelAttribute("expensess") Expense expense ) {
        expenseService.deleteExpenseById(expense.getId());
        return "redirect:/";

    }
    @RequestMapping(value = "/expense/{id}", method = RequestMethod.GET)
    public String showExpense(@PathVariable Long id, Model model) {
        model.addAttribute("expense", expenseService.findExpenseById(id));
        return "index.jsp";
    }



}
