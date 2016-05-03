/**
 * Created by vlad on 03.05.2016.
 */
public class TimeDemo {
    public static void main(String[] args) throws InterruptedException {
        new NewThread();//create second thread
        for (int i = 0;i < 100;i++){
            try {
                Thread.sleep(5000);//sleep 5 seconds
            }
            catch (InterruptedException e){//handle possible interruption
                System.out.println("The main thread has interrupted");
            }
            System.out.println("Message");
        }
        System.out.println("The main thread has finished");

    }
}

