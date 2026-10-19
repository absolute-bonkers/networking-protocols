# DNS & How It Works

A cache returns a still-live answer or invokes an upstream lookup and stores the result until its TTL expires. This focused resolver model omits delegation, DNSSEC, and negative caching.

## Example and test
Run `../../gradlew :dns:runExample` and `../../gradlew :dns:test` from this topic directory. `Example.java` is a dependency-free Java 21 simulation; it makes no network calls.

## Trade-offs
Caching reduces repeat lookup work but retains old answers until expiry. TTL is not an exact global switchover time; resolvers and clients can have independent caches.

## Primary references checked

- [RFC 1034 — Domain concepts](https://www.rfc-editor.org/rfc/rfc1034) — Describes DNS concepts, resolution, and caching.
- [RFC 1035 — DNS implementation](https://www.rfc-editor.org/rfc/rfc1035) — Defines DNS records, messages, and TTL fields.
