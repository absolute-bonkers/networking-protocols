package example;

public final class Example {
    public record Session(boolean encrypted,boolean peerIdentityValid) { public boolean maySendHttps(){return encrypted&&peerIdentityValid;} }
        public static Session negotiate(boolean tls,boolean identity){return new Session(tls,identity);}
        public static void main(String[] args){System.out.println("allowed="+negotiate(true,true).maySendHttps());}
}
