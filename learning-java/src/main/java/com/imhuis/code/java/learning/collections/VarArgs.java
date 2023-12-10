package com.imhuis.code.java.learning.collections;
// {WillNotCompile}

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }

  static void printArray2(Object... args) {
    for (Object obj : args)
      System.out.print(obj + " ");
    System.out.println();
  }

    public static void main(String[] args) {
        printArray(new Object[]{47, (float) 3.14, 11.11});
        printArray(new Object[]{"one", "two", "three"});

        int[] arrays = {1,2,3};
        printArray2(new Object[]{"one", "two", "three"});
        printArray2(arrays);
    }
}
/* Output:
47 3.14 11.11
one two three
*/
