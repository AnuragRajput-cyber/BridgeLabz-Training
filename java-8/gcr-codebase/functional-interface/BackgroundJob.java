package java8.functional_interface;

public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job=()->System.out.println("Job running in background");
        new Thread(job).start();
    }
}
