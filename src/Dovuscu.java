public class Dovuscu {
    String dovucsuIsmi;
    int hasar;
    int saglik;
    int kilogram;
    int hasarEngelIhtimali;


    Dovuscu(String dovucsuIsmi, int hasar, int saglik, int kilogram, int hasarEngelIhtimali)
    {
        this.dovucsuIsmi = dovucsuIsmi;
        this.hasar = hasar;
        this.saglik = saglik;
        this.kilogram = kilogram;
        this.hasarEngelIhtimali = hasarEngelIhtimali;
    }

    int darbe(Dovuscu rakip)
    {
        System.out.println(this.dovucsuIsmi + " => " + rakip.dovucsuIsmi + " " + this.hasar + " hasar vurdu." );
        if (rakip.hasarEngellediMi())
        {
            System.out.println();
            System.out.println(rakip.dovucsuIsmi + " Gelen Hasari Engelledi!");
            System.out.println();
            return rakip.saglik;
        }
        if (rakip.saglik - this.hasar < 0)
        {
            return 0;
        }
        return rakip.saglik - this.hasar;
    }

    boolean hasarEngellediMi()
    {
        double rastgeleSayi = Math.random() * 100;
        return rastgeleSayi <= this.hasarEngelIhtimali;
    }

}