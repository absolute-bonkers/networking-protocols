package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ assertEquals("internet",Example.forward("laptop","internet").upstreamSide()); assertEquals("reverse",Example.reverse("browser","origin").role()); assertEquals("origin",Example.reverse("browser","origin").upstreamSide()); } }
