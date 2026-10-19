# Connection Pooling & Keep-Alive

A bounded pool reuses a released connection until its modeled keep-alive idle timeout expires. This is local lease accounting, not a network implementation.

## Example and test
Run `../../gradlew :connections:runExample` and `../../gradlew :connections:test` from this topic directory. `Example.java` is a dependency-free Java 21 simulation; it makes no network calls.

## Trade-offs
Pool limits must fit downstream capacity and concurrency. Leaked/long-held leases starve callers, stale connections need validation/expiry, and keep-alive is not infinite lifetime.

## Primary references checked

- [Java 21 HttpClient API](https://docs.oracle.com/en/java/javase/21/docs/api/java.net.http/java/net/http/HttpClient.html) — Documents reusable client instances and typical per-client connection pools.
