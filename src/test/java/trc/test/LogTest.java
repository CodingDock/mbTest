package trc.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class LogTest {


    private static final Logger LOGGER = LoggerFactory.getLogger(LogTest.class);


    public static void main(String[] args) {

//        long l=System.currentTimeMillis();
//        for(int i=0;i<100000;i++) {
////            LOGGER.trace("logback的--trace日志--输出了");
////            LOGGER.debug("logback的--debug日志--输出了");
////            LOGGER.info("logback的--info日志--输出了");
////            LOGGER.warn("logback的--warn日志--输出了");
//            LOGGER.error("logback的--error日志--输出了:\t"+i);
//        }
//        
//        l=System.currentTimeMillis()-l;
//        System.out.println("Time Cost is :"+l);


            multiThreadLogTest();
    }
    
    
    public static void multiThreadLogTest() {
        
        for(int i=0;i<10;i++){
            final int wid=i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    MDC.put("worker_id","father_"+wid);
                    Logger LOGGER = LoggerFactory.getLogger("fatherWorkerLog_"+wid);
                    LOGGER.error("father_worker_"+wid+" is start");
                    commenLog();
                    
                    
                    LOGGER.error("father_worker_"+wid+" is end");
                    MDC.remove("worker_id");
                }
            },"workerThread_"+i).start();

        }
    }
    
    public static void commenLog(){

        LOGGER.error(Thread.currentThread().getName()+"sadsadsadsadsa");
        
    }
    
}
