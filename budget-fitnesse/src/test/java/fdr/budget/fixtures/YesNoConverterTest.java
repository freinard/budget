package fdr.budget.fixtures;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class YesNoConverterTest {

    private static YesNoConverter converter;

    @BeforeClass
    public static void init() {
        converter = new YesNoConverter();
    }

    @Test
    public void givenTrueWillReturnYes() {
        assertEquals("Yes", converter.toString(true));
    }

    @Test
    public void givenFalseWillReturnNo() {
        assertEquals("No", converter.toString(false));
    }

    @Test
    public void givenYesWillReturnTrue() {
        assertTrue(converter.fromString("Yes"));
        assertTrue(converter.fromString("YES"));
        assertTrue(converter.fromString("yes"));
        assertTrue(converter.fromString("yeS"));
    }

    @Test
    public void givenNoWillReturnFalse() {
        assertFalse(converter.fromString("No"));
        assertFalse(converter.fromString("NO"));
        assertFalse(converter.fromString("no"));
        assertFalse(converter.fromString("nO"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenNullStringWillThrowException() {
        converter.fromString(null);
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test(expected = IllegalArgumentException.class)
    public void givenNullBooleanWillThrowException() {
        converter.toString(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenNotYesOrNoWillThrowException(){
        converter.fromString("bam");
    }

}