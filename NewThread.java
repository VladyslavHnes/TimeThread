
/**
 * Created by vlad on 03.05.2016.
 */
public class NewThread implements Runnable {
    Thread t;

    public NewThread(){
        t = new Thread(this, "CountThread");
        System.out.println(this + " is created");
        t.start();
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i == 1) {
                System.out.println(i + " second has passed ");
            } else {
                System.out.println(i + " seconds has passed ");
            }
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("TimeThread has interrupted");
            }
        }
    }
}
