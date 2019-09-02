package thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ThreadSafe {
    public static void main(String[] args) {
        // Thread-unsafe
        DateFormat dateFormat = new SimpleDateFormat("yyyy.mm.dd");
        Calendar cal = Calendar.getInstance();
        cal.set(2019, Calendar.MARCH, 9);

        Date dateA = cal.getTime();
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2019, Calendar.JUNE, 25);
        Date dateB = cal2.getTime();

        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    String rslt = dateFormat.format(dateA);
                    System.out.println("ThreadA : " + rslt);
                }catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
        });

        Thread threadB = new Thread(() ->{
            for(int i=0;i<100;i++){
                try{
                    String rslt = dateFormat.format(dateB);
                    System.out.println("threadB : " + rslt);
                }catch(Exception e){
                    e.printStackTrace();
                    break;
                }
            }
        });

        threadA.start();
        threadB.start();
    }
}
