# Long Polling vs Server-Sent Events vs WebSockets

Long polling repeats a request after a response; SSE provides a server-to-client event stream; WebSocket enables bidirectional messages after an opening handshake.

## Example and test
Run `../../gradlew :realtime:runExample` and `../../gradlew :realtime:test` from this topic directory. `Example.java` is a dependency-free Java 21 simulation; it makes no network calls.

## Trade-offs
Long polling is compatible but repeats request overhead; SSE is simple for one-way streams; WebSockets enable duplex interaction but require lifecycle, backpressure, and reconnect design.

## Primary references checked

- [WHATWG Server-Sent Events](https://html.spec.whatwg.org/multipage/server-sent-events.html) — Defines EventSource and the SSE event-stream processing model.
- [RFC 6455 — WebSocket](https://www.rfc-editor.org/rfc/rfc6455) — Specifies the WebSocket opening handshake and framing.
