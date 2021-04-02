import koneksi.Database;
import model.Mahasiswa;
import model.Dosen;
import model.MataKuliah;

public class Main{
public static void main(String[]args){
System.out.println("Ini program utama");

Database.hubungkan();
Mahasiswa.tampilkanInfo();
Dosen.tampilanInfo();
MataKuliah.tampilanInfo();
}
}