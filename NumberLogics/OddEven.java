package NumberLogics;

import java.util.*;
class OddEven{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=sc.nextInt();
        System.out.println((a&1)==1?"OddNumber":"EvenNumber");
        sc.close();
    }
}