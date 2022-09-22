public class Perkalian {
    public static void main(String[] args) {
        int x = 9;

        for (int i = 1; i <= 1000; i++) {
            System.out.printf(" Hasil dari %s x %s = %s \n", x, i, HasilPerkalian(x, i));
        }

    }

    public static int HasilPerkalian(int angkaAwal, int angkaAkhir) {
        return angkaAwal * angkaAkhir;
    }
}
