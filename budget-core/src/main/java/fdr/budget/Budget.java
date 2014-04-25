package fdr.budget;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<Expense> expenses;

    public Budget() {
        expenses = new ArrayList<Expense>();
    }

    public void addExpense(Expense expense) {
        if (expense == null) throw new IllegalArgumentException("Expense cannot be null");
        expenses.add(expense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
}
