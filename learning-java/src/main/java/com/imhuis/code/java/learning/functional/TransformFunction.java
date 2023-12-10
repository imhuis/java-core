package com.imhuis.code.java.learning.functional;

import java.util.function.Function;

class I {
    @Override
    public String toString() {
        return "Input";
    }
}

class O {
    @Override
    public String toString() {
        return "Output";
    }
}

public class TransformFunction {
    static Function<I, O> transform(Function<I, O> in) {
        return in.andThen(o -> {
            System.out.println(o);
            return o;
        });
    }

    public static void main(String[] args) {
        Function<I, O> f2 = transform(i -> {
            System.out.println(i);
            return new O();
        });
        O o = f2.apply(new I());
    }
}
/* Output:
Input
Output
*/
