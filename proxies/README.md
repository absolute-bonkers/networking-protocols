# Reverse Proxy vs Forward Proxy

A forward proxy acts for clients toward destinations; a reverse proxy sits in front of origin servers and receives client traffic on their behalf. Products can support both roles.

## Example and test
Run `../../gradlew :proxies:runExample` and `../../gradlew :proxies:test` from this topic directory. `Example.java` is a dependency-free Java 21 simulation; it makes no network calls.

## Trade-offs
Proxying centralizes policy, routing, or caching but adds a hop and trust boundary. Carefully handle authentication, identity headers, and which party controls the proxy.

## Primary references checked
[RFC 9110 §3.7 defines HTTP intermediaries, proxies, gateways, and tunnels.](https://www.rfc-editor.org/rfc/rfc9110#section-3.7) — RFC 9110 §3.7 defines HTTP intermediaries, proxies, gateways, and tunnels.. The guide uses this source for the protocol/architecture semantics noted above, not as an unexplained link list.
