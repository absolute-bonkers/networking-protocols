package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ assertTrue(Example.shape(Example.Mode.LONG_POLLING).repeatsRequest()); assertFalse(Example.shape(Example.Mode.SSE).duplex()); assertTrue(Example.shape(Example.Mode.WEBSOCKET).duplex()); } }
