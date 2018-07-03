import org.junit.Before;

public class MouseTest {

    Mouse mouse;

    @Before
    public void setup(){
        mouse = new Mouse("Logitec", 8, 1500);
    }
}
