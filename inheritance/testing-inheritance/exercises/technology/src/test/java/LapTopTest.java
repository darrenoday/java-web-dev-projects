import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LapTopTest {
    @Test
    public void testGetScreenSize() {
        Laptop laptop = new Laptop("HP", "Pavilion", 1200, 15.6);
        assertEquals(15.6, laptop.getScreenSize(), 0.001);
    }
}
