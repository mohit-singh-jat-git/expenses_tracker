package com.example.expenseTracker.service.Interface;

import com.example.expenseTracker.dto.Response;

public interface expenseTrc {
    // Define methods for expense tracking operations
    Response addExpense(String description, double amount);
    Response updateExpense(int expenseId, String description, double amount);
    Response deleteExpense(int expenseId);
    Response viewExpenses();
    Response calculateTotalExpenses();
}
