package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ assertTrue(Example.negotiate(true,true).maySendHttps()); assertFalse(Example.negotiate(false,true).maySendHttps()); assertFalse(Example.negotiate(true,false).maySendHttps()); } }
