public class Kucing extends Hewan {
    public void namaHewan(){

    }

    @Override
    void namaHewan(String karakter) {
        super.namaHewan(karakter);
    }

    @Override
    void namaHewan(String nama, String warna, String jenis, String sifat, int umur) {
        super.namaHewan(nama, warna, jenis, sifat, umur);
    }
}
