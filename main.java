public class Main {
    public static void main(String[] args) {

        // Data Pegawai
        String nama = "Dodi Prayodi";
        int umur = 25;
        String jabatan = "manajer";
        String status = "menikah";

        // Gaji Pokok menggunakan IF
        int gajiPokok;

        if (jabatan.equals("manajer")) {
            gajiPokok = 15000000;
        } else if (jabatan.equals("asisten manajer")) {
            gajiPokok = 10000000;
        } else if (jabatan.equals("staff")) {
            gajiPokok = 5000000;
        } else {
            gajiPokok = 0;
        }

        // Tunjangan Jabatan 15% dari Gaji Pokok
        double tunjanganJabatan = 0.15 * gajiPokok;

        // BPJS 10% dari Gaji Pokok
        double bpjs = 0.10 * gajiPokok;

        // Tunjangan Keluarga menggunakan Ternary
        double tunjanganKeluarga =
                status.equals("menikah") ? 0.20 * gajiPokok : 0;

        // Total Gaji
        double totalGaji = gajiPokok
                + tunjanganJabatan
                + bpjs
                + tunjanganKeluarga;

        // Menampilkan Data Pegawai
        System.out.println("==============================================================");
        System.out.println("                      DATA PEGAWAI");
        System.out.println("==============================================================");

        System.out.printf("%-20s : %s%n", "Nama Pegawai", nama);
        System.out.printf("%-20s : %d tahun%n", "Umur", umur);
        System.out.printf("%-20s : %s%n", "Jabatan", jabatan);
        System.out.printf("%-20s : %s%n", "Status", status);

        System.out.println("--------------------------------------------------------------");

        System.out.printf("%-20s : Rp %, .0f%n", "Gaji Pokok",
                (double) gajiPokok);

        System.out.printf("%-20s : Rp %, .0f%n", "Tunjangan Jabatan",
                tunjanganJabatan);

        System.out.printf("%-20s : Rp %, .0f%n", "BPJS",
                bpjs);

        System.out.printf("%-20s : Rp %, .0f%n", "Tunjangan Keluarga",
                tunjanganKeluarga);

        System.out.println("--------------------------------------------------------------");

        System.out.printf("%-20s : Rp %, .0f%n", "TOTAL GAJI",
                totalGaji);

        System.out.println("==============================================================");
    }
}
