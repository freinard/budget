package fdr.budget.fixtures;

import fdr.budget.service.BudgetService;
import fdr.budget.service.BudgetServiceImpl;
import org.apache.commons.collections.CollectionUtils;

public class CreateABudget {

    private BudgetService budgetService;
    private BudgetRepositoryFake budgetRepository;
    private String name;

    public CreateABudget() {
        budgetRepository = new BudgetRepositoryFake();
        budgetService = new BudgetServiceImpl();
        budgetService.setBudgetRepository(budgetRepository);
    }

    public void reset() {
        budgetRepository.clear();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void execute() {
        budgetService.createBudget(name);
    }

    public String created() {
        return new YesNoConverter().toString(!CollectionUtils.isEmpty(budgetRepository.findByName(name)));
    }

}
