package fdr.budget;

import fdr.budget.model.Budget;
import fdr.budget.model.Expense;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

public class BudgetTest {

    private Budget budget;

    @Before
    public void init() {
        budget = new Budget("Jan 2014");
    }

    @Test
    public void addExpenseWithNullNameWillThrow() {
        try {
            budget.addExpense(null);
            fail("Illegal Argument Exception should have thrown!");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Expense cannot be null", e.getMessage());
        }
    }

    @Test
    @Ignore
    public void addTwoExpensesWillStoreThem() {
        Expense exp0 = mock(Expense.class);
        Expense exp1 = mock(Expense.class);

        budget.addExpense(exp0);
        budget.addExpense(exp1);

        assertThat(budget.getExpenses(), contains(exp0));
        assertThat(budget.getExpenses(), contains(exp1));
    }

}
