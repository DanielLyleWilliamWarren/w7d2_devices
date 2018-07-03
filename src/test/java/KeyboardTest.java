import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void setup(){
        keyboard = new Keyboard ("Logic","UK");
    }


    @Test
    public void canKeyboardSendData(){
        assertEquals("Sending data", keyboard.sendData("Sending data"));
    }
}
