package other;

public class Factorial {

    private Factorial() {

    }

    public static int recursive(int num) {
        if (num == 0) {
            return 1;
        }
        
        return num * recursive(num - 1);
    }
    
    public static int iterative(int num){
        if (num == 0) {
            return 1;
        }
        
        int value = 1;
        for (int i = 1; i <= num; i++) {
            value *= i;
        }
        return value;
    }
}
