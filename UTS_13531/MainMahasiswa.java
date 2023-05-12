import java.util.ArrayList;
import java.util.Scanner;

public class MainMahasiswa {

    public static void main(String[] args) {

        String nama, nim, asalSekolah, asalUniv;
        int semester, usia, wisuda, pilih;
        float ipk;
        boolean ikut;

        String krs[] = new String[8];
        
        Scanner input = new Scanner(System.in);

        ArrayList<MahasiswaAktif> mahasiswaAktifArrayList = new ArrayList<MahasiswaAktif>();
        ArrayList<MahasiswaLulus> mahasiswaLulusArrayList = new ArrayList<MahasiswaLulus>();
        ArrayList<MahasiswaBaru> mahasiswaBaruArrayList = new ArrayList<MahasiswaBaru>();
        ArrayList<MahasiswaTransfer> mahasiswaTransferArrayList = new ArrayList<MahasiswaTransfer>();

        do {

            System.out.println("Silahkan Pilih Menu Dibawah");
            System.out.println("1. Mahasiswa Aktif ");
            System.out.println("2. Mahasiswa Baru ");
            System.out.println("3. Mahasiswa Transfer ");
            System.out.println("4. Mahasiswa Lulus ");
            System.out.println("5. Exit ");

            System.out.print("Pilihan anda = ");

            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println(" MAHASISWA AKIF \n");
                    System.out.print("Masukan Nama : ");
                    nama = input.nextLine();
                    System.out.print("Masukan NIM : ");
                    nim = input.nextLine();
                    System.out.print("Masukan Semester : ");
                    semester = input.nextInt();
                    System.out.print("Masukan Usia : ");
                    usia = input.nextInt();

                    input.nextLine();

                    // OBJEK Class MahasiswaAktif
                    MahasiswaAktif mhsA = new MahasiswaAktif(nim, nama, semester, usia, krs);

                    // INPUT Matkul
                    int nil[] = new int[krs.length];
                    System.out.println("Masukan Matkul : ");
                    for (int i = 0; i < krs.length; i++) {
                        System.out.print("matkul ke-" + (i + 1) + " : ");
                        krs[i] = input.nextLine();
                    }

                    // INPUT Nilai
                    System.out.println("Masukan Nilai : ");
                    for (int i = 0; i < nil.length; i++) {
                        System.out.print("Nilai matkul " + krs[i] + " : ");
                        nil[i] = input.nextInt();
                    }
                    // Rata2 Nilai MahasiswaAktif
                    float rataAktif = mhsA.hitungRataNilai(nil);

                    mahasiswaAktifArrayList.add(mhsA);
                    System.out.println("===Data Mahasiswa===");
                    mhsA.infoMahasiswa();
                    mhsA.infoKrsMahasiswa();
                    System.out.println("Rata-Rata Nilai : " + rataAktif);

                    System.out.println("\n\n\n");
                    break;
                case 2:
                    // MahasiswaBaru
                    System.out.println("//== MAHASISWA BARU ==// \n\n");
                    // Input Data
                    System.out.print("Masukan Nama : ");
                    nama = input.nextLine();
                    System.out.print("Masukan NIM : ");
                    nim = input.nextLine();
                    System.out.print("Masukan Semester : ");
                    semester = input.nextInt();
                    System.out.print("Masukan Usia : ");
                    usia = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukan Asal Sekolah : ");
                    asalSekolah = input.nextLine();
                    System.out.println("Apakah Mengikuti Ospek? (Yes/No)");
                    String ospekkk = input.nextLine();
                    if(ospekkk == "Yes" || ospekkk == "yes" ){
                        ikut = true;
                    }else{
                        ikut = false;
                    }

                    // Membuat Objek dari Class
                    MahasiswaBaru mhsB = new MahasiswaBaru(nim, nama, semester, usia, krs, asalSekolah);
                    mahasiswaBaruArrayList.add(mhsB);

                    boolean os = mhsB.ikutOspek(ikut);
                    System.out.println("===Data Mahasiswa===");
                    mhsB.infoMahasiswa();
                    System.out.println("Ikut Ospek : " + os);

                    System.out.println("\n\n\n");
                    break;
                case 3:
                    // MahasiswaTransfer

                    System.out.println("//== MAHASISWA TRANSFER ==// \n\n");
                    System.out.print("Masukan Nama : ");
                    nama = input.nextLine();
                    System.out.print("Masukan NIM : ");
                    nim = input.nextLine();
                    System.out.print("Masukan Semester : ");
                    semester = input.nextInt();
                    System.out.print("Masukan Usia : ");
                    usia = input.nextInt();

                    input.nextLine();

                    System.out.print("Masukan Asal Sekolah : ");
                    asalSekolah = input.nextLine();
                    System.out.print("Masukan Asal Universitas : ");
                    asalUniv = input.nextLine();
                    System.out.println("Apakah Mengikuti Ospek? (true/false)");
                    ikut = input.nextBoolean();

                    MahasiswaTransfer mhsT = new MahasiswaTransfer(nim, nama, semester, usia, krs, asalSekolah,
                            asalUniv);
                    mahasiswaTransferArrayList.add(mhsT);

                    boolean osp = mhsT.ikutOspek(ikut);
                    System.out.println("===Data Mahasiswa===");
                    mhsT.infoMahasiswa();
                    System.out.println("Ikut Ospek : " + osp);
                    System.out.println("\n\n\n");
                    break;
                case 4:
                    // MahasiswaLulus

                    System.out.println("//== MAHASISWA LULUS ==// \n");
                    System.out.print("Masukan Nama : ");
                    nama = input.nextLine();
                    System.out.print("Masukan NIM : ");
                    nim = input.nextLine();
                    System.out.print("Masukan Semester : ");
                    semester = input.nextInt();
                    System.out.print("Masukan Usia : ");
                    usia = input.nextInt();
                    System.out.print("Masukan Tahun Wisuda : ");
                    wisuda = input.nextInt();
                    System.out.print("Masukan IPK : ");
                    ipk = input.nextFloat();
                    System.out.println("Apakah Mengikuti Wisuda? (true/false)");
                    ikut = input.nextBoolean();

                    // OBJEK Class MahasiswaLulus
                    MahasiswaLulus mhsL = new MahasiswaLulus(nim, nama, semester, usia, krs, wisuda, ipk);

                    // Ikut tidak Wisuda
                    boolean wis = mhsL.ikutWisuda(ikut);

                    // Memasukan value objek ke ArrayList
                    mahasiswaLulusArrayList.add(mhsL);
                    System.out.println("===Data Mahasiswa===");
                    mhsL.infoMahasiswa();
                    System.out.println("Mengikuti Wisuda : " + wis);

                    System.out.println("\n");
                    break;
            }

        } while (pilih != 5);
        input.close();
    }

}
