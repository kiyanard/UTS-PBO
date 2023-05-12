public class MahasiswaLulus extends Mahasiswa {
    //atribut
    int tahunWisuda;
    float ipk;

    // constructor milik MahasiswaLulus
    public MahasiswaLulus(String nim, String nama, int semester, int usia, String[] krs, int tahunWisuda, float ipk) {
        super(nim, nama, semester, usia, krs);

        this.tahunWisuda = tahunWisuda;
        this.ipk = ipk;

    }

    boolean ikutWisuda(boolean n) {
        if (n == false) {

            return false;
        }
        return true;
    }

    // @override , menimpa
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Tahun wisuda : " + tahunWisuda);
        System.out.println("IPK : " + ipk);
    }

}
