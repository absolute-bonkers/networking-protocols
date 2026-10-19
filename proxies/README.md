# Reverse Proxy vs Forward Proxy

A forward proxy acts for clients toward destinations; a reverse proxy sits in front of origin servers and receives client traffic on their behalf. Products can support both roles.

## Example and test
Run `../../gradlew :proxies:runExample` and `../../gradlew :proxies:test` from this topic directory. `Example.java` is a dependency-free Java 21 simulation; it makes no network calls.

## Trade-offs
Proxying centralizes policy, routing, or caching but adds a hop and trust boundary. Carefully handle authentication, identity headers, and which party controls the proxy.

## Primary references checked

- [RFC 9110 §3.7 — Intermediaries](https://www.rfc-editor.org/rfc/rfc9110#section-3.7) — Defines HTTP proxies, gateways, and tunnels; the forward/reverse distinction here describes deployment roles rather than a separate HTTP protocol feature.
- [Refactoring.Guru — Proxy](https://refactoring.guru/design-patterns/proxy) — A related object-level structural pattern that controls access to a service; it is not the same thing as network forward/reverse proxy roles.
