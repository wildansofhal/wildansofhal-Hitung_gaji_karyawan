abstract class Gaji {
    protected String nama;
    private String golongan;
    private String pendidikan;
    private int jamKerja;

    // constructor untuk karyawan
    public Gaji(String nama, String golongan, String pendidikan, int jamKerja) {
        this.nama = nama;
        this.golongan = golongan;
        this.pendidikan = pendidikan;
        this.jamKerja = jamKerja;
    }

    // method untuk menghitung honor tetap karyawan
    public abstract int hitungHonorTetap();

    // method untuk menghitung tunjangan jabatan
    public int hitungTunjanganJabatan() {
        int honorTetap = hitungHonorTetap();
        int tunjanganJabatan = 0;

        switch (golongan) {
            case "1":
                tunjanganJabatan = (int) (0.05 * honorTetap);
                break;
            case "2":
                tunjanganJabatan = (int) (0.1 * honorTetap);
                break;
            case "3":
                tunjanganJabatan = (int) (0.15 * honorTetap);
                break;
            default:
                System.out.println("Golongan tidak valid!");
                break;
        }

        return tunjanganJabatan;
    }

    // method untuk menghitung tunjangan pendidikan
    public int hitungTunjanganPendidikan() {
        int honorTetap = hitungHonorTetap();
        int tunjanganPendidikan = 0;

        switch (pendidikan) {
            case "1":
                tunjanganPendidikan = (int) (0.025 * honorTetap);
                break;
            case "2":
                tunjanganPendidikan = (int) (0.05 * honorTetap);
                break;
            case "3":
                tunjanganPendidikan = (int) (0.075 * honorTetap);
                break;
            default:
                System.out.println("Pendidikan tidak valid!");
                break;
        }

        return tunjanganPendidikan;
    }

    // method untuk menghitung honor lembur
    public int hitungHonorLembur() {
        int honorLemburPerJam = 2500;
        int honorLembur = 0;

        if (jamKerja > 8) {
            honorLembur = (jamKerja - 8) * honorLemburPerJam;
        }

        return honorLembur;
    }

    // method untuk menghitung total honor yang diterima karyawan
    public int hitungTotalHonor() {
        int honorTetap = hitungHonorTetap();
        int tunjanganJabatan = hitungTunjanganJabatan();
        int tunjanganPendidikan = hitungTunjanganPendidikan();
        int honorLembur = hitungHonorLembur();

        int totalHonor = honorTetap + tunjanganJabatan + tunjanganPendidikan + honorLembur;

        return totalHonor;
    }

}

class Gajikaryawan extends Gaji {
    public Gajikaryawan(String nama, String golongan, String pendidikan, int jamKerja) {
        super(nama, golongan, pendidikan, jamKerja);
    }

    // implementasi method untuk menghitung honor tetap karyawan
    public int hitungHonorTetap() {
        return 3000000;
    }

    public void tampilkanData() {
        System.out.print("==============================================================================\n");
        System.out.print("Karyawan yang bernama: " + nama + "\n");
        System.out.println("Honor yang diterima:");
        System.out.println("Honor Tetap:\t\tRp." + hitungHonorTetap());
        System.out.println("Tunjangan Jabatan:\tRp." + hitungTunjanganJabatan());
        System.out.println("Tunjangan Pendidikan:\tRp." + hitungTunjanganPendidikan());
        System.out.println("Honor Lembur:\t\tRp." + hitungHonorLembur());
        System.out.println("____________________________________________ +\n");
        System.out.println("Honor Yang Diterima:\tRp." + hitungTotalHonor());
        System.out.print("==============================================================================\n");
    }
}