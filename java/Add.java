import java.util.*;
class Adddemo {
    Scanner obj = new Scanner(System.in);
    int a, b;
     void accept() {
        System.out.println("Enter two no's");
        a = obj.nextInt();
        b = obj.nextInt();
    }
     void sum() {
        int c = a + b;
        System.out.println("Addition is :=> " + c);

    }
     int sum_test(int a, int b) {
        return a + b;
    }
     void substract() {
        int G = 0;
        if (a < b) {
            G = b - a;
        } else {
            G = a - b;
        }
        System.out.println("Substraction is :=>" + G);
    }
     int substract_test(int a, int b) {
        return a - b;
    }
     void multi() {
        int c = a * b;
        System.out.println("Multiplication is:=>" + c);
    }
     int multi_test(int a, int b) {
        return a * b;
    }
     void div() {
        int c = a / b;
        System.out.println("Division is:=>" + c);
    }
     int Div_test(int a, int b) {
        return a / b;
    }
}
class Addtest {
    public static void main(String [] args) {
        Adddemo t1 = new Adddemo();
        t1.accept();
        t1.sum();
        t1.substract();
        t1.multi();
        t1.div();
        
      int result = t1.substract_test(10, 20);
        System.out.println("Subsctraction Test result =>" + result);
        int result1 = t1.sum_test(30, 40);
        System.out.println("Addition Test result=>" + result1);
        int result2 = t1.multi_test(20, 30);
        System.out.println("multiplication Test=>" + result2);
        int result3 = t1.Div_test(4, 2);
        System.out.println("Division Test=>" + result3);
    }
}
