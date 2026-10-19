# SSL/TLS & HTTPS

HTTPS requires secure transport and authenticated server identity. This model checks those prerequisites conceptually; it is not cryptography and must never be used as a TLS implementation.

## Example and test
Run `../../gradlew :tls-https:runExample` and `../../gradlew :tls-https:test` from this topic directory. `Example.java` is a dependency-free Java 21 simulation; it makes no network calls.

## Trade-offs
Encryption without validating peer identity can protect a connection to the wrong endpoint. Validate certificates and hostnames, use supported TLS settings, and manage keys safely.

## Primary references checked

- [RFC 8446 — TLS 1.3](https://www.rfc-editor.org/rfc/rfc8446) — Specifies the TLS 1.3 handshake and security properties.
- [RFC 9110 §4.3.4 — HTTPS](https://www.rfc-editor.org/rfc/rfc9110#section-4.3.4) — Defines HTTPS URI semantics.
