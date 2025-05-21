package com.example.expenseTracker.service.Imp;

import com.example.expenseTracker.dto.Response;
import com.example.expenseTracker.service.Interface.expenseTrc;

public class ExpenseTrcImp implements expenseTrc {
    @Override
    public Response addExpense(String description, double amount) {
        return null;
    }

    @Override
    public Response updateExpense(int expenseId, String description, double amount) {
        return null;
    }

    @Override
    public Response deleteExpense(int expenseId) {
        return null;
    }

    @Override
    public Response viewExpenses() {
        return null;
    }

    @Override
    public Response calculateTotalExpenses() {
        return null;
    }
}
