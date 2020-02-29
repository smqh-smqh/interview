import java.util.concurrent.atomic.AtomicInteger;

public class CasDemo {
    public static void main(String[] args){
        AtomicInteger atomicInteger=new AtomicInteger(5);
        System.out.println(atomicInteger.compareAndSet(5,2019)+"\t current data: "+atomicInteger);
        System.out.println(atomicInteger.compareAndSet(5,1024)+"\t current data: "+atomicInteger);
    }
}
