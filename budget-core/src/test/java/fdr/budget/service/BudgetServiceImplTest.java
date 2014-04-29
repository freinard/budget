package fdr.budget.service;

import fdr.budget.data.BudgetRepository;
import fdr.budget.model.Budget;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(MockitoJUnitRunner.class)
public class BudgetServiceImplTest {

    @Mock private BudgetRepository budgetRepository;
    private BudgetServiceImpl service;

    @Before
    public void setUp() throws Exception {
        service = new BudgetServiceImpl();
        service.setBudgetRepository(budgetRepository);
    }

    @Test
    public void givenNullBudgetNameDoNotCreate() {
        service.createBudget(null);

        verifyZeroInteractions(budgetRepository);
    }

    @Test
    public void givenEmptyBudgetNameDoesNotCreate(){
        service.createBudget("");

        verifyZeroInteractions(budgetRepository);
    }

    @Test
    public void givenBudgetNameWillCreate() {
        String budgetName = "January 2014";
        Budget budget = new Budget(budgetName);
        service.createBudget(budgetName);

        verify(budgetRepository).save(budget);
    }

}