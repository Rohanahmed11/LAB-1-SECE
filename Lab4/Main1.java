package Lab4;
class Main1 extends Thread{
public void run(){
System.out.println("task one");
}
public static void main(String args[]){
Main1 t1=new Main1();
Main1 t2=new Main1();
Main1 t3=new Main1();
t1.start();
t2.start();
t3.start();
}
}