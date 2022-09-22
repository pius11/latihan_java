public class Penjumlahan {
    public static void main(String[] args) {
        int x = 4;
        int y = 16;
        // int z = x + y;
        System.out.printf("Hasil penjumlahan dari %s dan %s adalah %s ", x, y, HasilPenjumlahan(x, y));
    }

    public static int HasilPenjumlahan(int angkaAwal, int angkaAkhir) {
        return angkaAwal + angkaAkhir;
    }
}
