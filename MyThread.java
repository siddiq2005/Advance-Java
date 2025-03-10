class Threads extends Thread {
    String name;

    Threads(String name) {
        setName(name);
        this.name = name;

    }

    public void run() {
        for (int j = 5; j >=1; j--) {
            System.out.println(name + ":" + j);





        }
    }
}

 public class MyThread {
     public static void main(String[] args) {

         Threads t1 = new Threads("One");
         Threads t2 = new Threads("Two");
         Threads t3 = new Threads("Three");
         t1.start();
         t2.start();
         t3.start();


         try {

             Thread.sleep(8000);


         } catch (InterruptedException e) {
             System.out.println("Interruption occurred in main thread");
         }
     }
}

                                // without sleep
                                //Three:5
                                //Three:4
                                //Three:3
                                // Three:2
                                //Three:1
                                //Two:5
                                //One:5
                                //One:4
                                //One:3
                                //One:2
                                //One:1
                                //Two:4
                                //Two:3
                                //Two:2
                                //Two:1
