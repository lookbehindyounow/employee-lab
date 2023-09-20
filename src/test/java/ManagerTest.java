import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;
    @Before
    public void before(){
        manager=new Manager("Kev","PE483415D",40_000,"mailroom");
    }

    @Test
    public void hasAttributes(){
        assertEquals("Kev",manager.getName());
        assertEquals("PE483415D",manager.getNI());
        assertEquals(40_000,manager.getSalary(),0);
        assertEquals("mailroom",manager.getDeptName());
    }
    @Test
    public void canRaise(){
        manager.raise(500);
        assertEquals(40_500,manager.getSalary(),0);
    }
    @Test
    public void canBonus(){
        double bonus=manager.bonus();
        assertEquals(400,bonus,0);
    }
    @Test
    public void cantNegativeRaise(){
        manager.raise(-500);
        assertEquals(40_000,manager.getSalary(),0);
    }
    @Test
    public void canSetName(){
        manager.setName("");
        assertEquals("Kev",manager.getName());
        manager.setName(null);
        assertEquals("Kev",manager.getName());
        manager.setName("Jim");
        assertEquals("Jim",manager.getName());
    }
}
