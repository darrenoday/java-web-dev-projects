import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartPhoneTest {
    @Test
    public void testGetOperatingSystem() {
        Smartphone phone = new Smartphone("Apple", "iPhone 12", 999, "iOS");
        assertEquals("iOS", phone.getoperatingSystem());
    }
}