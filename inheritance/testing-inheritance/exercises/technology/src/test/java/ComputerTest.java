import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerTest {
    @Test
    public void testGetBrand() {
        Computer computer = new Computer("Dell", "XPS", 1500);
        assertEquals("Dell", computer.getBrand());
    }

    @Test
    public void testGetModel() {
        Computer computer = new Computer("Dell", "XPS", 1500);
        assertEquals("XPS", computer.getModel());
    }

    @Test
    public void testGetPrice() {
        Computer computer = new Computer("Dell", "XPS", 1500);
        assertEquals(1500, computer.getPrice(), 0.001);
    }
}
