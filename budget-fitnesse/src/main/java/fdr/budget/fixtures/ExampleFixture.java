package fdr.budget.fixtures;

public class ExampleFixture {

    private int enteredValue;

    public void setValueEntered(int value) {
        enteredValue = value;
    }

    public int doubleTheValue() {
        return enteredValue * 2;
    }

    public void reset() {
        enteredValue = 0;
    }

}
