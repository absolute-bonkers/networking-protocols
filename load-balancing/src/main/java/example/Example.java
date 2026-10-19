package example;

public final class Example {
    public enum Layer { L4,L7 }
        public static String route(Layer l,String ip,String host,String path) { if(l==Layer.L4)return "address:"+ip; return host.equals("api.test")&&path.startsWith("/v1")?"api-v1":"web"; }
        public static void main(String[] args) { System.out.println(route(Layer.L7,"192.0.2.1","api.test","/v1/items")); }
}
