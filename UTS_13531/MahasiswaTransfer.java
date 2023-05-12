public class MahasiswaTransfer extends MahasiswaBaru {
    //atribut
    String asalUniversitas;
    //constructor
    public MahasiswaTransfer(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah,
            String asalUniversitas) {
        super(nim, nama, semester, usia, krs, asalSekolah);
        this.asalUniversitas = asalUniversitas;

    }

    boolean ikutOspek() {
        if (ikutOspek() == false) {
            return false;
        }
        return true;
    }

    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Universitas : " + asalUniversitas);
    }

}
