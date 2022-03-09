package fibonacci;

/**
 * Class providing the method that computes the number of
 * the fibonacci sequence at index 'value'
 * @author Carlos Ortega
 */

public class fibonacci {
    public int compute(int value){
        if(value < 0) throw new RuntimeException("The value is negative: "+value);
        if(value <= 1) {
            return value;
        }
        int max = Integer.MAX_VALUE;
        int fib = 1;
        int prevFib = 1;
        boolean demasiadoMayor = false; // Para controlar que no haya overflow

        int i = 2;
        while(i<value && !demasiadoMayor) {
            int temp = fib;
            if(prevFib <= fib){
                fib+= prevFib;
                prevFib = temp;
                i++;
            }else{
                demasiadoMayor = true;
            }
        }

        if(demasiadoMayor) throw new RuntimeException("The value is too big: "+value);
        return fib;
    }
}
