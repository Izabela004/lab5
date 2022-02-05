public class Suma {
    int dodaj(int a, int b){
        System.out.println("Typ int, parametry int");
        return a+b;
    }
    double dodaj(double a, double b){
        System.out.println("Typ double, parametry double");
        return a+b;
    }
    int dodaj(int a, int b, int c){
        System.out.println("Typ int, parametry int");
        return a+b+c;
    }
    double dodaj(double a, double b, double c){
        System.out.println("Typ double, parametry double");
        return a+b+c;
    }

}
