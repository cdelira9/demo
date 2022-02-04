import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void remianders(){
        assertEquals(0, SkillDemo.remainder(6,2));
    }

}