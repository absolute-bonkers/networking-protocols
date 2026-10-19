package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ var cache = new Example.Cache(); var calls = new java.util.concurrent.atomic.AtomicInteger(); var lookup = (java.util.function.Supplier<String>) () -> "ip" + calls.incrementAndGet(); assertEquals("ip1",cache.resolve("x",0,5,lookup)); assertEquals("ip1",cache.resolve("x",4,5,lookup)); assertEquals("ip2",cache.resolve("x",5,5,lookup)); assertEquals(2,calls.get()); } }
