package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {
    @Test
    void reusesKeepAliveConnectionsUntilIdleExpiry() {
        var pool = new Example.Pool(1, 10);
        assertTrue(pool.acquire(0));
        assertFalse(pool.acquire(0));
        pool.release(0);
        assertTrue(pool.acquire(9));
        assertEquals(1, pool.opened());
        pool.release(9);
        assertTrue(pool.acquire(19));
        assertEquals(2, pool.opened());
        pool.release(19);
        assertThrows(IllegalStateException.class, () -> pool.release(20));
    }
}
