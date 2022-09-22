import java.util.Scanner;

public class InputStream {
    public static void main(String[] args) {
        String nama, sekolah, umur, kelas;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("==================");
        System.out.println("Input data siswa");
        System.out.println("==================");
        System.out.print("Nama Siswa : ");
        nama = keyboard.nextLine();
        System.out.print("Sekolah : ");
        sekolah = keyboard.nextLine();
        System.out.print("umur : ");
        umur = keyboard.nextLine();
        System.out.print("Kelas : ");
        kelas = keyboard.nextLine();
        System.out.println("\n \n");

        System.out.println("================");
        System.out.println("Biodata Siswa");
        System.out.println("================");
        System.out.println("nama : " + nama);
        System.out.println("Sekolah : " + sekolah);
        System.out.println("Umur Siswa : " + umur);
        System.out.println("Kelas Siswa : " + kelas);
        keyboard.close();
    }
}
