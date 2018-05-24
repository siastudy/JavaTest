import org.junit.Test;


    /*Multitread: Extend Class: Thread. override run() method*/
    public class MultiThreadTest extends Thread{

        @Override
        public void run(){
            while(true){
                System.out.println("threadName:"+this.getThreadGroup().getName());
            }
        }

        @Test
        public void startThread(){
            MultiThreadTest thread = new MultiThreadTest();
            thread.start();
        }
    }
