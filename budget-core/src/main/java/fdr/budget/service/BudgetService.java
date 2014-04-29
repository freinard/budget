package fdr.budget.service;

import fdr.budget.data.BudgetRepository;

public interface BudgetService {
    void setBudgetRepository(BudgetRepository budgetRepository);

    void createBudget(String name);
}
