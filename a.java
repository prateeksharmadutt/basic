 
//(1)
//final class A{
//
//     void f()
//    {
//        System.out.println("hekko");
//    }
//
//}
//public class Main {
//    public static void main(String[] args)
//    {
//      A k= new A();
//      k.f();
//
//    }
//
//}

//(2)

//final class A{
//
//   final  void f()
//    {
//        System.out.println("hekko");
//    }
//
//}
//public class Main {
//    public static void main(String[] args)
//    {
//      A k= new A();
//      k.f();
//
//    }
//
//}

///(3)
//final class A{
//
//    final  void f(int a)
//    {
//        System.out.println(a);
//    }
//
//}
//public class Main {
//    public static void main(String[] args)
//    {
//        A k= new A();
//        k.f(4);
//
//    }
//
//}

//(4)

//final class A{
//
//    final  void f(int a,int b)
//    {
//        System.out.println(a+b);
//    }
//
//}
//public class Main {
//    public static void main(String[] args)
//    {
//        A k= new A();
//        k.f(4);
//
//    }
//
//}

//(b)
//
//import java.util.*;
//final class A{
//
//
//
//    Scanner sc = new Scanner(System.in);
//    int a =sc.nextInt();
//    int b= sc.nextInt();
//
//    final  void f()
//    {
//
//        System.out.println(a+b);
//    }
//
//}
//public class Main {
//    public static void main(String[] args)
//    {
//
//        new A().f();
//
//    }
//
//}

//(5)

//import java.util.*;
//final class A{
//    void f(int a,int b)
//    {
//        System.out.println(a+b);
//    }
//
//        }
//        public class Main {
//            public static void main(String[] args) {
//
//                Scanner sc= new Scanner(System.in);
//                int a =sc.nextInt();
//                int b= sc.nextInt();
//                new A().f(a,b);
//            }
//}

///(6)
//(a)
//final class B{
//    int a=5;
//    int b=6;
//    final int f()
//    {
//        return 5+6;
//    }
//}
//public class Main {
//    public static void main(String[] args)
//    {
//
//        System.out.println(new B().f());
//
//    }
//}

//(b)

//import java.util.*;
//final class B{
//
//    Scanner sc = new Scanner(System.in);
//    int a= sc.nextInt();
//    int b=sc.nextInt();
//    final int f()
//    {
//        return a+b;
//    }
//}
//public class Main {
//    public static void main(String[] args)
//    {
//
//        System.out.println(new B().f());
//
//    }
//}

// 7

//(a)

//import java.util.*;
//final class D{
//
//    final int add(int a,int b)
//    {
//        return a+b;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        System.out.println(new D().add(a,b));
//
//    }
//
//}

//(b)

//final class D{
//
//    final int add()
//    {
//        int a=4;
//        int b=5;
//        return a+b;
//    }
//}
//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.println(new D().add());
//
//    }
////}

//8

//final  class F{
//    void f(int a)
//    {
//        System.out.println("hello"+" "+a);
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//
//        new F().f(6);
//    }
//}

//(9)


//(a)
//final class G {
//    void f()
//    {
//        int a=5,b=6;
//        System.out.println(a+b);
//    }
//
//}
//public class Main {
//    public static void main(String[] args) {
//
//        new G().f();
//    }
//}

//(b)

//import java .util.*;
//
//final class G{
//    void f()
//    {
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        System.out.println(a+b);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        new G().f();
//    }
//}

//(10)


//(a)
//final class F{
//
//    void f(int a,int b)
//    {
//
//        System.out.println(a+b);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        new F().f(4,5);
//    }
//}

//(b)

//import java.util.*;
//
//final class D{
//
//    void f(int a,int b)
//    {
//        System.out.println(a+b);
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int a =sc.nextInt();
//        int b= sc.nextInt();
//        new D().f(a,b);
//    }
//}

//(11)

//(a)
//final class D{
//    int  f()
//    {
//        int a=5;
//        int b=3;
//        return a+b;
//    }
//}
//public  class Main {
//    public static void main(String[] args) {
//
//        System.out.println(new D().f());
//    }
//}

//(b)


//import java.util.*;
//
//final class F{
//
//    int add()
//    {
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b =sc.nextInt();
//        return a+b;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println(new F().add());
//    }
//

//(12)

//(a)

//final class F{
//    int add(int a,int b)
//    {
//        return a+b;
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//
//        System.out.println(new F().add(4,5));
//    }
//}

//(b)

//import java.util.*;
//
//final class F{
//
//    int add(int a,int b)
//    {
//        return a+b;
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        System.out.println(new F().add(a,b));
//    }
//}

//(13)

//final class F{
//    final void  show()
//    {
//        System.out.println("hello");
//    }
//    final void show1()
//    {
//        System.out.println("bye bye");
//    }
//    final void show2()
//    {
//        System.out.println("Where are you");
//    }
//    final void show3()
//    {
//        System.out.println("you tube");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//
//        new F().show();
//        new F().show1();
//        new F().show2();
//        new F().show3();
//    }
//}

//(14)

// class F{
//    final void  show()
//    {
//        System.out.println("hello");
//    }
//    final void show1()
//    {
//        System.out.println("bye bye");
//    }
//    final void show2()
//    {
//        System.out.println("Where are you");
//    }
//    final void show3()
//    {
//        System.out.println("you tube");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//
//        new F().show();
//        new F().show1();
//        new F().show2();
//        new F().show3();
//    }
//}

//(15)

import com.sun.security.jgss.GSSUtil;

//class Final{
//
//    final void  show()
//    {
//        System.out.println("gk");
//    }
//    void show1()
//    {
//        System.out.println("gear");
//    }
//    final void show2()
//    {
//        System.out.println("Guest");
//    }g(
//    void show3()
//    {
//        System.out.println("hope");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        new Final().show();
//        new Final().show1();
//        new Final().show2();
//        new Final().show3();
//    }
//}

//(16)


//(a)

//final class D {
//    final void show(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    void show1() {
//        System.out.println("rear");
//    }
//    final void show2(int a,int  b)
//    {
//        System.out.println("help"+" "+ (a-b));
//    }
//
//    void show3() {
//        System.out.println("whrer");
//    }
//}
//    public class Main{
//        public static void main(String[] args) {
//
//        new D().show(4,5);
//            new D().show1();
//            new D().show2(7,5);
//            new D().show3();
//    }
//}

//(b)


//import java.util.*;
//final class D {
//    final void show(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    void show1() {
//        System.out.println("rear");
//    }
//    final void show2(int a,int  b)
//    {
//        System.out.println("help"+" "+ (a-b));
//    }
//
//    void show3() {
//        System.out.println("whrer");
//    }
//}
//    public class Main{
//        public static void main(String[] args) {
//
//            Scanner sc = new Scanner(System.in);
//            int a= sc.nextInt();
//            int b= sc.nextInt();
//        new D().show(a,b);
//            new D().show1();
//            int c =sc.nextInt();
//            int d =sc.nextInt();
//            new D().show2(c,d);
//            new D().show3();
//    }
//}

//(17)
//final class D{
//    final void f()
//    {
//        System.out.println("Welcome");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        new D().f();
//    }
//}

//(18)

//(a)

//final class Y {
//
//    void fgg(int a,int b)
//    {
//        System.out.println("Multply"+" "+ a*b);
//    }
//    void div(int c,int d)
//    {
//        System.out.println("Div"+" "+c/d);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        new Y().fgg(4,6);
//        new Y().div(12,4);
//    }
//}

//(b)

//import java.util.*;
//final class Y {
//
//    void fgg(int a,int b)
//    {
//        System.out.println("Multply"+" "+ a*b);
//    }
//    void div(int c,int d)
//    {
//        System.out.println("Div"+" "+c/d);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        new Y().fgg(a,b);
//        int c= sc.nextInt();
//        int d= sc.nextInt();
//        new Y().div(c,d);
//    }
//}

//(19)


//(a)

//final class Ab{
//
//   final void reverse()
//    {
//        int a=123;
//        int c=0;
//        while(a!=0)
//        {
//           int b= a%10;
//            c= c*10+b;
//            a=a/10;
//        }
//        System.out.println(c);
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//
//        new Ab().reverse();
//    }
//
//}

//(b)

//import java.util.*;
//
//final class Ab{
//
//   final void reverse()
//    {
//          Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int c=0;
//        while(a!=0)
//        {
//           int b= a%10;
//            c= c*10+b;
//            a=a/10;
//        }
//        System.out.println(c);
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//
//        new Ab().reverse();
//    }
//
//}


//(20)

//final class F{
//    final void fg(int a)
//    {
//        int d=a;
//        int c=0;
//        while(a>0)
//        {
//            int b= a%10;
//            c=c*10+b;
//            a=a/10;
//
//        }
//        if(d==c)
//        {
//            System.out.println("Palindromic number");
//        }
//        else
//        {
//            System.out.println("not palindromic");
//        }
//
//    }
//}
//public class Main{
//    public static void main(String[] args)
//    {
//        new F().fg(234);
//    }
//}

//(22)

final class B {
    int b = 23;

    final int fg() {

        int g = b;
        int c = 0;
        while (b > 0) {
            int d = b % 10;
            c = c + d;
            d = d / 10;

        }
        if (g == c)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("not armstrong nunber");
        }
        return 0;

    }
}


    public class Main {
        public static void main(String[] args) {

            new B().fg();
        }
    }
