package fdr.budget.service;

import fdr.budget.data.BudgetRepository;
import fdr.budget.model.Budget;
import org.apache.commons.lang3.StringUtils;

public class BudgetServiceImpl implements BudgetService {

    private BudgetRepository budgetRepository;

    @Override
    public void setBudgetRepository(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    @Override
    public void createBudget(String name) {
        if (!StringUtils.isEmpty(name)) {
            Budget budget = new Budget(name);
            budgetRepository.save(budget);
        }
    }

}
