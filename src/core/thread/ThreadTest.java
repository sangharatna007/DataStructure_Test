package core.thread;

public class ThreadTest extends Thread {
    public static void main(String[] args) {

        Mythread thread = new Mythread();
        thread.start();

    }
}


class Mythread extends Thread
{
    @Override
    public void run() {
        for (int i =0; i < 5 ; i++)
        {
            System.out.println("Thread caling back to me ");
        }
    }
}