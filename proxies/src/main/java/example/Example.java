package example;

public final class Example {
    public record Proxy(String role,String clientSide,String upstreamSide) {}
        public static Proxy forward(String client,String destination) { return new Proxy("forward",client,destination); }
        public static Proxy reverse(String client,String origin) { return new Proxy("reverse",client,origin); }
        public static void main(String[] args) { System.out.println(reverse("browser","service")); }
}
