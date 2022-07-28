import java.util.Random;

public class Musabaka {
    Dovuscu d1;
    Dovuscu d2;
    int minDovuscuAgirligi;
    int maxDovuscuAgirligi;

    Musabaka(Dovuscu d1, Dovuscu d2, int minDovuscuAgirligi, int maxDovuscuAgirligi)
    {
        this.d1 = d1;
        this.d2 = d2;
        this.minDovuscuAgirligi = minDovuscuAgirligi;
        this.maxDovuscuAgirligi = maxDovuscuAgirligi;
    }

    void dovusBaslat()
    {
        if (kontrolEt())
        {
            if (kimBaslayacak())
            {
                System.out.println();
                System.out.println("******YENI ROUND******");
                System.out.println();

                this.d2.saglik = this.d1.darbe(this.d2);

                this.d1.saglik = this.d2.darbe(this.d1);

                System.out.println("----------------------");
                System.out.println(this.d1.dovucsuIsmi + " Kalan Saglik : " + this.d1.saglik);
                System.out.println(this.d2.dovucsuIsmi + " Kalan Saglik : " + this.d2.saglik);
                System.out.println("======================");
                while (this.d1.saglik > 0 && this.d2.saglik > 0)
                {

                    System.out.println();
                    System.out.println("******YENI ROUND******");
                    System.out.println();

                    this.d2.saglik = this.d1.darbe(this.d2);
                    if (kimKazandi())
                    {
                        break;
                    }

                    this.d1.saglik = this.d2.darbe(this.d1);
                    if (kimKazandi())
                    {
                        break;
                    }
                    System.out.println("----------------------");
                    System.out.println(this.d1.dovucsuIsmi + " Kalan Saglik : " + this.d1.saglik);
                    System.out.println(this.d2.dovucsuIsmi + " Kalan Saglik : " + this.d2.saglik);
                    System.out.println("======================");
                }
            }
            else if (kimBaslayacak() == false)
            {
                System.out.println();
                System.out.println("******YENI ROUND******");
                System.out.println();

                this.d1.saglik = this.d2.darbe(this.d1);

                this.d2.saglik = this.d1.darbe(this.d2);

                System.out.println("----------------------");
                System.out.println(this.d1.dovucsuIsmi + " Kalan Saglik : " + this.d1.saglik);
                System.out.println(this.d2.dovucsuIsmi + " Kalan Saglik : " + this.d2.saglik);
                System.out.println("======================");

                while (this.d2.saglik > 0 && this.d1.saglik > 0)
                {

                    System.out.println();
                    System.out.println("******YENI ROUND******");
                    System.out.println();

                    this.d1.saglik = this.d2.darbe(this.d1);
                    if (kimKazandi())
                    {
                        break;
                    }

                    this.d2.saglik = this.d1.darbe(this.d2);
                    if (kimKazandi())
                    {
                        break;
                    }
                    System.out.println("----------------------");
                    System.out.println(this.d1.dovucsuIsmi + " Kalan Saglik : " + this.d1.saglik);
                    System.out.println(this.d2.dovucsuIsmi + " Kalan Saglik : " + this.d2.saglik);
                    System.out.println("======================");
                }
            }
        }
        else
        {
            System.out.println("Dovusculerin Sikletleri Uymuyor! \nRinge gecis yapamazlar!");
        }
    }

    boolean kontrolEt()
    {
        return ((this.d1.kilogram >= minDovuscuAgirligi && this.d1.kilogram <= maxDovuscuAgirligi)
                && (this.d2.kilogram >= minDovuscuAgirligi && this.d2.kilogram <= maxDovuscuAgirligi));
    }

    boolean kimKazandi()
    {
        if (this.d1.saglik == 0)
        {
            System.out.println(this.d2.dovucsuIsmi + " kazandi!");
            return true;
        }
        if (this.d2.saglik == 0)
        {
            System.out.println(this.d1.dovucsuIsmi + " kazandi!");
            return true;
        }
        return false;
    }
    boolean kimBaslayacak()
    {
        Random r = new Random();
        int baslayan =r.nextInt(10);
        return baslayan > 5;

        // 0 1 2 3 4 false
        // 5 6 7 8 9 true
    }
}
