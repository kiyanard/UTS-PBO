
public class Mahasiswa {

    //atribut
    String nim, nama;
    int semester, usia;
    String[] krs;

    //constructor
    public Mahasiswa(String nim, String nama, int semester, int usia, String[] krs) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
    }

    float hitungRataNilai(int nilai[]) {
        float hasil;
        float total = 0;

        for (int i = 0; i < nilai.length; i++) {
            total = total + nilai[i];
        }
        hasil = total / nilai.length;
        return hasil;

    }

    public void infoMahasiswa() {
        System.out.println("NIM      = " + nim);
        System.out.println("Nama     = " + nama);
        System.out.println("Semester = " + semester);
        System.out.println("Usia     = " + usia);
        System.out.println("KRS      = " + krs.length);
    }

    public void infoKrsMahasiswa() {

        for (int i = 0; i < krs.length; i++) {
            System.out.println((i) + ". " + krs[i]);
        }
    }

}
