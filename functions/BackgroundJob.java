public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Processing job " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        };

        Thread thread = new Thread(job);
        thread.start();
    }
}
