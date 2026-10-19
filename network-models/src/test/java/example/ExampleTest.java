package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ assertEquals("Transport", Example.layer(4)); assertEquals(4, Example.tcpIp().size()); assertThrows(IllegalArgumentException.class, () -> Example.layer(8)); } }
