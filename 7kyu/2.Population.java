public class Population {
    public static void main(String[] args)
    {
        System.out.println(Arge.nbYear(1500,5,100,5000));
    }
}
class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int number_year = 0;
        while (p0 < p) {
            p0 += p0 * percent / 100 + aug;
            number_year += 1;
        }
        return number_year;
    }
}
