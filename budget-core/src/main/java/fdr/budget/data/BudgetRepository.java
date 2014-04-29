package fdr.budget.data;

import java.util.Collection;

import fdr.budget.model.Budget;

public interface BudgetRepository {

    Collection<Budget> findByName(String name);

    void save(Budget budget);

}
