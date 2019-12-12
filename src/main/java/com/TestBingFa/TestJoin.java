package TestBingFa;

public class TestJoin {
   public static void main(String[] args){
      Thread j1 = new Thread(new Join1());
      j1.setName("进程一");
      j1.start();
   }
}

class Join1 implements Runnable{

   @Override
   public void run() {
      Thread j2 = new Thread(new Join2());
      j2.setName("进程二");
      j2.start();
      try {
         j2.join(); // 这样得进程二结束才能执行进行一
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      for (int i=0;i<=10;i++){
         System.out.println(Thread.currentThread().getName()+":"+i);
      }
   }
}

class Join2 implements Runnable{

   @Override
   public void run() {
      for (int i=0;i<=10;i++){
         System.out.println(Thread.currentThread().getName()+":"+i);
      }
   }
}


