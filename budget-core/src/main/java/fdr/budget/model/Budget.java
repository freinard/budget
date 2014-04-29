package fdr.budget.model;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private final String name;

    private List<Expense> expenses;

    public Budget(String name) {
        this.name = name;
        expenses = new ArrayList<Expense>();
    }

    public void addExpense(Expense expense) {
        if (expense == null) throw new IllegalArgumentException("Expense cannot be null");
        expenses.add(expense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Budget budget = (Budget) o;

        if (expenses != null ? !expenses.equals(budget.expenses) : budget.expenses != null) return false;
        return name.equals(budget.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (expenses != null ? expenses.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }
}
