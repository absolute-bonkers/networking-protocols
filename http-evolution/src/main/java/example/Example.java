package example;

public final class Example {
    public record Profile(String version, String transport, boolean multiplexes) {}
        public static java.util.List<Profile> profiles() { return java.util.List.of(new Profile("HTTP/1.1","TCP",false), new Profile("HTTP/2","TCP",true), new Profile("HTTP/3","QUIC/UDP",true)); }
        public static void main(String[] args) { profiles().forEach(System.out::println); }
}
