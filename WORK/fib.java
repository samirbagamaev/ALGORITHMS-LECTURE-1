public class fib{
    
}
    public static void main(String[] args) {
        //List<Integer> availableDivider = findAvailableDivider(11); // findAvailableDivider(12)
        // for (Integer integer : availableDivider) {
        // System.out.println(integer);
        // }
        AtomicInteger counter = new AtomicInteger(0);
        int fib = fib(10,counter);
        System.out.println("Fib number: "+fib);
        System.out.println("Counter: "+counter.get());
    }

public class fib {
    public static int fib(int position, AtomicInteger counter){
        counter.incrementAndGet();
        if(position == 1){
            return 0;
        }
        if (position == 2){
            return 1;
        }
        return fib(position - 1, counter) +  fib(position-2, counter);

    }
}
