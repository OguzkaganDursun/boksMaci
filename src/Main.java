import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dovuscu d1 = new Dovuscu("Oguzkagan", 10, 120,100, 50);
        Dovuscu d2 = new Dovuscu("Yasin", 20, 85, 85, 40);

        Musabaka musabaka = new Musabaka(d1,d2, 85,100);
        musabaka.dovusBaslat();
    }
}