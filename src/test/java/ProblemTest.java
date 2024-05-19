import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test
    public void AtLeastOneTest(){
        Problem problem1 = new Problem(5,2);
        Result result1 = problem1.Solve(11);
        assertFalse(result1.listID.isEmpty());
    }

    @Test
    public void EmptySolution(){
        Problem problem2 = new Problem(3,4);
        Result result2 = problem2.Solve(2);
        assertTrue(result2.listID.isEmpty());
        assertEquals(0, result2.valueSum);
        assertEquals(0, result2.weightSum);
    }

    @Test
    public void WeightValueCheck(){
        Problem problem3 = new Problem(15,4);
        for(var item: problem3.items)
        {
            assertTrue(item.value >= 1 && item.value <= 10);
            assertTrue(item.weight >= 1 && item.weight <= 10);
        }
    }

    @Test
    public void CorrectnessCheck(){
        Problem problem4 = new Problem(3,11);
        Result result4 = problem4.Solve(42);
        assertEquals(result4.valueSum, 38);
        assertEquals(result4.weightSum, 42);
        assertTrue(result4.listID.contains(1));
        assertTrue(result4.listID.contains(0));
    }
}