
package threading_delia;

class multix implements Runnable{
        public void run(){
            System.out.println("thread implements is running...");
        }
    public static void main(String args[]) {
        multix m1 = new multix();
        Thread t1 = new Thread (m1);
        t1.start();
    }
    
}
