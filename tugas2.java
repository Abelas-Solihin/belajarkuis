import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {   
        Scanner sc = new Scanner (System.in);
        int bahanbakar;
        int jumlahUang;
        double hargaperliter = 9000, kembalian, total;
        System.out.println("jumlah bahan bakar");
        bahanbakar = sc.nextInt();

        System.out.println("jumlah uang yang dibayar: ");
        jumlahUang = sc.nextInt();

        total = bahanbakar * hargaperliter;
        System.out.println("total harganya adalah: " + total);

        kembalian = jumlahUang - total ;
        System.out.println("kembalian:" + kembalian);


    }
}
