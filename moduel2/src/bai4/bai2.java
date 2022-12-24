package bai4;

public class bai2 {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start();
        try {
            Thread.sleep(5 * 60 * 10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sw.stop();
        System.out.println("The Elapsed time is: " + sw.getElapsedTime() + " milisec");
    }
}
