package example;

public final class Example {
    private static final java.util.List<String> OSI = java.util.List.of("Physical","Data Link","Network","Transport","Session","Presentation","Application");
        public static String layer(int n) { if (n < 1 || n > 7) throw new IllegalArgumentException(); return OSI.get(n - 1); }
        public static java.util.List<String> tcpIp() { return java.util.List.of("Link","Internet","Transport","Application"); }
        public static void main(String[] args) { System.out.println("L4=" + layer(4) + " TCP/IP=" + tcpIp()); }
}
