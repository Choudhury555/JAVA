package DATA_TYPE;

import java.math.BigDecimal;

public class BigDecimalPractice {
    public static void main(String[] args) {
        //in case of accurate calculation(financial) use BigDecimal instead of float/double
        BigDecimal n1 = new BigDecimal("34.56789876");
        BigDecimal n2 = new BigDecimal("34.2234");
        System.out.println(n1.add(n2));

    }
}
