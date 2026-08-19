class NumberThread extends Thread {int from,to,delay;NumberThread(int f,int t,int d){from=f;to=t;delay=d;}public void run(){for(int i=from;i<=to;i++){System.out.println(i);try{Thread.sleep(delay);}catch(InterruptedException e){interrupt();}}}}
public class Practical35 {public static void main(String[] a){new NumberThread(1,10,1000).start();new NumberThread(11,20,500).start();}}
