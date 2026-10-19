# OSI Model & TCP/IP

The OSI layers are a conceptual debugging model, not a claim that modern stacks are seven independent boxes. The example names layers and maps them to the smaller TCP/IP teaching model.

## Example and test
Run `../../gradlew :network-models:runExample` and `../../gradlew :network-models:test` from this topic directory. `Example.java` is a dependency-free Java 21 simulation; it makes no network calls.

## Trade-offs
Layering isolates responsibilities; real protocols can span textbook boundaries. Use captures and concrete protocol behavior when diagnosing a real network.

## Primary references checked

- [RFC 1122 — Internet host requirements](https://www.rfc-editor.org/rfc/rfc1122) — Specifies host requirements across Internet protocol layers.
- [RFC 8200 — IPv6](https://www.rfc-editor.org/rfc/rfc8200) — Defines IPv6 at the Internet/network layer.
