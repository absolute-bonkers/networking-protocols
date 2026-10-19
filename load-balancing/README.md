# Load Balancing (L4 vs L7, Algorithms)

L4 can select a backend from connection/address metadata; L7 can route using HTTP authority and path. The simulation demonstrates the information boundary, not a complete balancing algorithm.

## Example and test
Run `../../gradlew :load-balancing:runExample` and `../../gradlew :load-balancing:test` from this topic directory. `Example.java` is a dependency-free Java 21 simulation; it makes no network calls.

## Trade-offs
L4 is protocol-agnostic and has less application parsing; L7 enables richer routing but adds complexity and a hop. Production choices also depend on health, locality, connection reuse, and load signals.

## Primary references checked

- [Envoy load balancing](https://www.envoyproxy.io/docs/envoy/latest/intro/arch_overview/upstream/load_balancing/load_balancing) — Documents routing algorithms and host selection.
- [RFC 9110 — HTTP Semantics](https://www.rfc-editor.org/rfc/rfc9110) — Defines HTTP request fields that an L7 intermediary can use.
