import java.util.Scanner;

public class InputOutput{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

String nama;
int usia;
double ipk;

System.out.print("Masukkan nama anda :");
nama = scanner.nextLine();
System.out.print("Masukkan usia anda :");
usia = scanner.nextInt();
System.out.print("Masukkan IPK anda  :");
ipk = scanner.nextDouble();

System.out.println("Hai, "+nama);
System.out.println(usia+ " Tahun");
System.out.println("IPK  :" +ipk);
}
}