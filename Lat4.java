package strukturdata;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Lat4 {
    String nama, kelas, matkulprakikum;
    int nim;

    public Lat4(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulprakikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Lat4> mhs = new HashMap<>();
        String input;
        Lat4 data;

        mhs.put("1", new Lat4("Putri", "3H", "Struktur Data", 2021103));
        mhs.put("2", new Lat4("Agus", "3A", "Matematika", 2021104));
        mhs.put("3", new Lat4("Arro", "3D", "Pemrograman", 2021105));

        System.out.print("Masukkan ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if(data != null){
            System.out.println("Data Mahasiswa : " + data.nama + " Kelas : "
                    + data.kelas + " Matkul Prakikum : " + data.matkulprakikum +
                    ", NIM : " + data.nim);
        }
    }
}