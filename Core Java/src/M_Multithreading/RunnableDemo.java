package M_Multithreading;


class ThreadR implements Runnable
{
    @Override //Annotation - add in java 5 version
    public void run()
    {
        for (int i = 1; i < 10; i++) {
            System.out.print(i+ " ");
        }
    }

}
public class RunnableDemo {
    public static void main(String[] args) {
        ThreadR t1 = new ThreadR();
        Thread t = new Thread(t1);
        t.start();
    }
}
