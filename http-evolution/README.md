# HTTP/1.1 vs HTTP/2 vs HTTP/3

Compare transport and multiplexing instead of treating version numbers as a speed ranking. HTTP/2 multiplexes streams over TCP; HTTP/3 maps HTTP onto QUIC over UDP.

## Example and test
Run `../../gradlew :http-evolution:runExample` and `../../gradlew :http-evolution:test` from this topic directory. `Example.java` is a dependency-free Java 21 simulation; it makes no network calls.

## Trade-offs
Performance depends on negotiation, workload, intermediaries, and network behavior. HTTP/2 stream multiplexing does not remove TCP-level loss effects; HTTP/3 does not guarantee every workload is faster.

## Primary references checked

- [RFC 9110 — HTTP Semantics](https://www.rfc-editor.org/rfc/rfc9110) — Defines shared HTTP semantics.
- [RFC 9112 — HTTP/1.1](https://www.rfc-editor.org/rfc/rfc9112) — Specifies HTTP/1.1 message syntax and connection handling.
- [RFC 9113 — HTTP/2](https://www.rfc-editor.org/rfc/rfc9113) — Specifies HTTP/2 framing and multiplexed streams.
- [RFC 9114 — HTTP/3](https://www.rfc-editor.org/rfc/rfc9114) — Specifies HTTP/3 over QUIC.
