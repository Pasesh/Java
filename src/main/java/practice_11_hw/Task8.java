package practice_11_hw;

import java.math.BigDecimal;

public class Task8 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.1").multiply(new BigDecimal("3"));
        BigDecimal b = new BigDecimal("0.3");
        if (a.equals(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

}
