import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;
    @Before
    public void before(){
        director=new Director("Gregory","PE483415DHFADOFO627329562",400_000,"mailroom",1_000_000);
    }

    @Test
    public void hasAttributes(){
        assertEquals("Gregory",director.getName());
        assertEquals("PE483415DHFADOFO627329562",director.getNI());
        assertEquals(400_000,director.getSalary(),0);
        assertEquals("mailroom",director.getDeptName());
        assertEquals(1_000_000,director.getBudget(),0);
    }
    @Test
    public void canRaise(){
        director.raise(500);
        assertEquals(400_500,director.getSalary(),0);
    }
    @Test
    public void canBonus(){
        double bonus=director.bonus();
        assertEquals(8000,bonus,0);
    }
    @Test
    public void cantNegativeRaise(){
        director.raise(-500);
        assertEquals(400_000,director.getSalary(),0);
    }
    @Test
    public void canSetName(){
        director.setName("");
        assertEquals("Gregory",director.getName());
        director.setName(null);
        assertEquals("Gregory",director.getName());
        director.setName("Jim");
        assertEquals("Jim",director.getName());
    }
}
