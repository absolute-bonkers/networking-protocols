package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ assertEquals("address:192.0.2.1",Example.route(Example.Layer.L4,"192.0.2.1","api.test","/v1")); assertEquals("api-v1",Example.route(Example.Layer.L7,"192.0.2.1","api.test","/v1")); assertEquals("web",Example.route(Example.Layer.L7,"192.0.2.1","www.test","/")); } }
