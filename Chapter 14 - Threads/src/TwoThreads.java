public class TwoThreads {

  public static class Thread1 extends Thread {
    public void run() {
     for(int i=0; i<1000; i++) {
      System.out.print("A");
      System.out.print("B");
     }
    }
  }
  public static class Thread2 extends Thread {
    public void run() {
     for(int i=0; i<1000; i++) {
      System.out.print("1");
      System.out.print("2");
     }
    }
  }
  public static void main(String[] args) {
    new Thread1().start();
    new Thread2().start();
  }
}