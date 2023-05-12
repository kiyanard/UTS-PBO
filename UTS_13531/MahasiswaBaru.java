public class MahasiswaBaru extends Mahasiswa {
//atribut
    String asalSekolah;
    
    //constructor
    public MahasiswaBaru (String nim,String nama,int semester,int usia,String[] krs,String asalSekolah)
    {
        super(nim, nama, semester, usia, krs);
        this.asalSekolah = asalSekolah;
    }

    boolean ikutOspek(boolean ikut)
    {
        if(ikut == false)
        {
            return false;
        }
        return true;
    }

    
    @Override
    public void infoMahasiswa()
    {
        super.infoMahasiswa();
        System.out.println("Asal sekolah : " + asalSekolah);
    }

    
}
