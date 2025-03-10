class Test extends Thread {
    int fact=1;
      int number;
      String name;
        Test(int number,String name) {
            this.number = number;
            this.name=name;

            
            
            }
             public void run() {
                 for (int i = 1; i <= number; i++) {
                     fact *= i;
                 }
                 System.out.println(name + "  Factorial is " + fact);
        }

    }


public class Factorial {
    public static void main(String[] args) {
        Test t1 = new Test(5,"Five");
        Test t2 = new Test(7,"Seven");
        Test t3 = new Test(9,"Nine");
        t1.start();
        t2.start();
        t3.start();


    }

}


