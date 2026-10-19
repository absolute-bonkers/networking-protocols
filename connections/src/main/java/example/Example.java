package example;

public final class Example {
    public static final class Pool {
        private final int max;
        private final long keepAliveMillis;
        private final java.util.PriorityQueue<Long> idleExpirations = new java.util.PriorityQueue<>();
        private int live;
        private int leased;
        private int opened;

        public Pool(int max, long keepAliveMillis) {
            if (max < 1 || keepAliveMillis < 0) throw new IllegalArgumentException();
            this.max = max;
            this.keepAliveMillis = keepAliveMillis;
        }

        public boolean acquire(long nowMillis) {
            while (!idleExpirations.isEmpty() && idleExpirations.peek() <= nowMillis) {
                idleExpirations.remove();
                live--;
            }
            if (!idleExpirations.isEmpty()) {
                idleExpirations.remove();
                leased++;
                return true;
            }
            if (live == max) return false;
            live++;
            leased++;
            opened++;
            return true;
        }

        public void release(long nowMillis) {
            if (leased == 0) throw new IllegalStateException("no leased connection");
            leased--;
            idleExpirations.add(nowMillis + keepAliveMillis);
        }

        public int opened() { return opened; }
    }

    public static void main(String[] args) {
        var pool = new Pool(1, 10);
        pool.acquire(0);
        pool.release(0);
        System.out.println("reused=" + pool.acquire(9) + " opened=" + pool.opened());
    }
}
