package asm;

/**
 * Created by Administrator on 2016/10/29.
 */
public class asmtest {


    public static void main(String[] args) throws InterruptedException {
        
        for(int i=0;i<10000;i++){
            
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getId());
                }
            }).start();
//            Thread.sleep(50);

        }
        
    }
    
}
