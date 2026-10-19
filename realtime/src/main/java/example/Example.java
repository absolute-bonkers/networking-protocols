package example;

public final class Example {
    public enum Mode { LONG_POLLING,SSE,WEBSOCKET }
        public record Shape(boolean pushes,boolean duplex,boolean repeatsRequest) {}
        public static Shape shape(Mode m){return switch(m){case LONG_POLLING->new Shape(true,false,true);case SSE->new Shape(true,false,false);case WEBSOCKET->new Shape(true,true,false);};}
        public static void main(String[] args){for(var m:Mode.values())System.out.println(m+" "+shape(m));}
}
