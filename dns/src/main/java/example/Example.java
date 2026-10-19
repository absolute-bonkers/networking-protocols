package example;

public final class Example {
    public static final class Cache { private record Entry(String value,long expiry) {} private final java.util.Map<String,Entry> map=new java.util.HashMap<>();
            public String resolve(String name,long now,long ttl,java.util.function.Supplier<String> lookup) { Entry e=map.get(name); if(e!=null&&now<e.expiry()) return e.value(); String v=lookup.get(); map.put(name,new Entry(v,now+ttl)); return v; } }
        public static void main(String[] args) { System.out.println(new Cache().resolve("example.test",0,60,()->"192.0.2.7")); }
}
