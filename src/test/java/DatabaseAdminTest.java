import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin dataguy;
    @Before
    public void before(){
        dataguy=new DatabaseAdmin("Dev","PE4834",4_001);
    }

    @Test
    public void hasAttributes(){
        assertEquals("Dev",dataguy.getName());
        assertEquals("PE4834",dataguy.getNI());
        assertEquals(4_001,dataguy.getSalary(),0);
    }
    @Test
    public void canRaise(){
        dataguy.raise(500);
        assertEquals(4_501,dataguy.getSalary(),0);
    }
    @Test
    public void canBonus(){
        double bonus=dataguy.bonus();
        assertEquals(40.01,bonus,0);
    }
    @Test
    public void cantNegativeRaise(){
        dataguy.raise(-500);
        assertEquals(4_001,dataguy.getSalary(),0);
    }
    @Test
    public void canSetName(){
        dataguy.setName("");
        assertEquals("Dev",dataguy.getName());
        dataguy.setName(null);
        assertEquals("Dev",dataguy.getName());
        dataguy.setName("Jim");
        assertEquals("Jim",dataguy.getName());
    }
}
