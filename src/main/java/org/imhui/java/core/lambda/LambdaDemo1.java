package org.imhui.java.core.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author: imhuis
 * @date: 2023/7/18
 * @description:
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(new Integer[]{2, 3,5,7});
        int factor = 2;
        primes.forEach(element -> {

//            factor++;
        });
    }
}
