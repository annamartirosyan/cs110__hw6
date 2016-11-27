package com.utils;
public class Math {


    public static int factorial(double a) {
        int i = (int) a ;
        if (i == 1) return 1;
        else return factorial(i - 1) * i;
    }

    public static int factorialLoop(double a) {
        int num = (int) a ;
        int result = 1;
        if (num == 1) {
            return 1;
        }
        else {
            for (int i = num; i > 0; i--) {
               result = result * i;

            }

            return result;
        }

    }


}



















//    public int factorial(int n){
//        if(n>0)
//            return n * factorial(n-1);
//        else return 1;
//    }
//     public int factorialLoop(int n){
//        int result = 1;
//        for(n=n;n>0;n--) result = result * n;
//        return result;
//    }
//}
//    private int n;
//    private int num;
//
//    public Math(int n) {
//        this.num = n;
//    }
//
//    public int Factorial(num){
//       // int a = n.intValue();
//        if (num == 1) {
//            return 1;
//        }
//        int result = num * getFactorial(num-1);
//        return result;
//        }
//
//    }
//}
