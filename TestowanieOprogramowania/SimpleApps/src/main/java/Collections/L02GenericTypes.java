package Collections;

import java.util.ArrayList;

public class L02GenericTypes {

    public static void main(String[] args) {
/*
        ArrayList a = new ArrayList();

        a.add(new String("lala"));
        a.add(new Integer(4));

        for (int i = 0; i < a.size(); i++)
            System.out.println((String)a.get(i));
*/
        Zwykla<String> nazwaZmiennej = new Zwykla();
        nazwaZmiennej.nadajWartość("To jest tekst tekstowy");
        System.out.println(nazwaZmiennej.gveItBack());
    }
}

class Zwykla <COKOLWIEK>
{
    COKOLWIEK nazwaZmiennejTypuCokolwiek;

    public  void nadajWartość (COKOLWIEK wartosc)
    {
        this.nazwaZmiennejTypuCokolwiek = wartosc;
    }

    public COKOLWIEK gveItBack()
    {
        return this.nazwaZmiennejTypuCokolwiek;
    }
}
