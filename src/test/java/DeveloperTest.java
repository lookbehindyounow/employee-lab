import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer dev;
    @Before
    public void before(){
        dev=new Developer("Kev","PE483",4_000);
    }

    @Test
    public void hasAttributes(){
        assertEquals("Kev",dev.getName());
        assertEquals("PE483",dev.getNI());
        assertEquals(4_000,dev.getSalary(),0);
    }
    @Test
    public void canRaise(){
        dev.raise(500);
        assertEquals(4_500,dev.getSalary(),0);
    }
    @Test
    public void canBonus(){
        double bonus=dev.bonus();
        assertEquals(40,bonus,0);
    }
    @Test
    public void cantNegativeRaise(){
        dev.raise(-500);
        assertEquals(4_000,dev.getSalary(),0);
    }
    @Test
    public void canSetName(){
        dev.setName("");
        assertEquals("Kev",dev.getName());
        dev.setName(null);
        assertEquals("Kev",dev.getName());
        dev.setName("Jim");
        assertEquals("Jim",dev.getName());
    }
}
