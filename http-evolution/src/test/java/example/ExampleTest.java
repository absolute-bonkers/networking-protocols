package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ var p = Example.profiles(); assertFalse(p.get(0).multiplexes()); assertTrue(p.get(1).multiplexes()); assertEquals("QUIC/UDP", p.get(2).transport()); } }
