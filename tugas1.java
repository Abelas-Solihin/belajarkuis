import java.util.Scanner; 
public class tugas1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jumlahPembayaran;
        double biaya = 2000, total;

        System.out.println("Hasil : ");
        jumlahPembayaran = sc.nextInt();

        total = jumlahPembayaran * biaya;
        System.out.println("totalpembayaran adalah:" + total );
    }
}