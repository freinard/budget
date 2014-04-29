package fdr.budget.model;

public class Expense {
    private String name;

    public Expense(String name, double amount) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
