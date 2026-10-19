package example;

public final class Example {
    public static final class Cache { private record Entry(String value,long expiry) {} private final java.util.Map<String,Entry> map=new java.util.HashMap<>();
            public String resolve(String name,long now,long ttl,java.util.function.Supplier<String> lookup) { if(name==null||lookup==null||ttl<0)throw new IllegalArgumentException("name and lookup are required; TTL cannot be negative");Entry e=map.get(name); if(e!=null&&now<e.expiry()) return e.value(); String v=java.util.Objects.requireNonNull(lookup.get(),"lookup result"); map.put(name,new Entry(v,Math.addExact(now,ttl))); return v; } }
        public static void main(String[] args) { System.out.println(new Cache().resolve("example.test",0,60,()->"192.0.2.7")); }
}
