public class Przykładowe {
    public static void main(String args[]){
        Suma suma = new Suma();
        System.out.println(suma.dodaj(6, 3));
        System.out.println(suma.dodaj(6.0, 3.0));
        System.out.println(suma.dodaj(6, 3, 9));
        System.out.println(suma.dodaj(6.0, 3.0, 9.0));
    }
}
