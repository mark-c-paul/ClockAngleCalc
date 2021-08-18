import com.mycompany.clockanglecalc.AngleCalculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * @author Mark Paul
 */
public class AngleCalculatorTest {
    
    int hours;
    int minutes;
    int expected;
    
    @Test //base case
    public void testCalcAngle_180() {
        hours = 6;
        minutes = 0;
        expected = 180;
        int result = AngleCalculator.calcAngle(hours, minutes);
        assertEquals(expected, result);
    }
    
    @Test //hour hand offset
    public void testCalcAngle_75() {
        hours = 3;
        minutes = 30;
        expected = 75;
        int result = AngleCalculator.calcAngle(hours, minutes);
        assertEquals(expected, result);
    }
    
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    
    @Test //illegal hour input
    public void testCalcAngle_illegalArgumentHours() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Wrong input");
        hours = 100;
        minutes = 0;
        AngleCalculator.calcAngle(hours, minutes);
    }
    
    @Test //illegal minute input
    public void testCalcAngle_illegalArgumentMinutes() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Wrong input");
        hours = 12;
        minutes = -1;
        AngleCalculator.calcAngle(hours, minutes);
    }
    
}

