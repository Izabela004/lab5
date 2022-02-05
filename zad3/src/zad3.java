public class zad3 {
    void wypisz(String napis){
        System.out.println(napis.length());

    }

    public static void main(String[] args) throws Exception{
        try {
            zad3 ob1 = new zad3();
            ob1.wypisz(null);
        }
        catch (NullPointerException ex){
            ex.printStackTrace(System.out);
            ex.fillInStackTrace();
            throw new Exception(ex);
        }

    }

}
