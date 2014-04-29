package fdr.budget.fixtures;

import java.util.Collection;

import com.google.common.collect.ArrayListMultimap;
import fdr.budget.data.BudgetRepository;
import fdr.budget.model.Budget;

public class BudgetRepositoryFake implements BudgetRepository {

    private ArrayListMultimap<String, Budget> budgets;

    public BudgetRepositoryFake() {
        budgets = ArrayListMultimap.create();
    }

    @Override
    public Collection<Budget> findByName(String name) {
        return budgets.get(name);
    }

    @Override
    public void save(Budget budget) {
        budgets.put(budget.getName(), budget);
    }

    public void clear() {
        budgets.clear();
    }

}
