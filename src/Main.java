public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 6");
        System.out.println("Exercise 1");
        for (int i=1;i<=10;i++){
            System.out.println(i);}

        System.out.println("Exercise 2");
        for (int i=10;i>=1;i--){
            System.out.println(i);}
        System.out.println("Exercise 3");
        for (int i=0; i<17; i += 2){
            System.out.println(i);}
        System.out.println("Exercise 4");
        for (int i=10; i>=-11; i--){
            System.out.println(i);}
        System.out.println("Exercise 5");
        for (int i=1904;i<=2096;i+=4){
            System.out.println(i+" год является високосным");}
        System.out.println("Exercise 6");
        for (int i=7; i<=98;i+=7){
            System.out.println(i);}
        System.out.println("Exercise 7");
        for (int i=1;i<=512;i*=2){
            System.out.println(i);}
        System.out.println("Exercise 8");
        int salary =29000;
        int total=0;
        for (int i=0;i<12;i++){
            total=total+salary;
        }
        System.out.println(total);
        System.out.println("Exercise 9");
        int saLary = 29000;
        int toTal=0;
        for (int i=0;i<12;i++){
            toTal=toTal+toTal/100;
            toTal=toTal+saLary;
            System.out.println("Месяц"+i+"сумма накоплений равна"+toTal+"рублей");}
        System.out.println("Exercise 10");
        int a=2;
        for (int b=1;b<=10;b++){
            System.out.println(a+"*"+b+"="+a*b);
        }

    }}

