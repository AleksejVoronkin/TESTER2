package JAVA.TEST;
// не очень понял суть задания.  так то ошибка в том, что он запрашивает эллемент массива которого нет,
// это можно исправить просто создав массив, но потом то он делит на 0 и нужно ли это исправлять 
public class T22 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // нужно было создать данный массив
            double catchedRes1 = intArray[8] / d; // но на 0 делить нельзя, так что будет ошибка  by zero
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
