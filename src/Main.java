public class Main {
    public static void main(String[] args) {
        System.out.println("5 ATRIBUT & METHOD");
        Hewan hewan = new Hewan();

        hewan.nama = "Kucing";
        hewan.warna = "Abu abu";
        hewan.jenis = "Persia";
        hewan.sifat = "Suka bermain";
        hewan.umur = 3;

        //memanggil method
        hewan.makan();
        hewan.minum();
        hewan.bergerak();
        hewan.bersuara();
        hewan.berkembangbiak();

        //memanggil constructor
        System.out.println("C O N S T R U C T O R");
        Hewan hewan1 = new Hewan("Kucing", "Abu abu");
        Hewan hewan2 = new Hewan("Kucing");
        Hewan hewan3 = new Hewan("Kucing", "Abu abu", "Persia", "Suka bermain", 3);

        //memanggil method overloading
        System.out.println("O V E R L O A D I N G");
        hewan.namaHewan();
        hewan.namaHewan("+++++++++++++++++++++++++++++++++++++++++++++");
        hewan.namaHewan("Kucing", "Abu abu", "Persia", "Suka bermain", 3);

        //memanggil overriding
        System.out.println("O V E R R I D I N G");
        Kucing n = new Kucing();

        hewan.namaHewan("+++++++++++++++++++++++++++++++++++++++++++++");
        n.namaHewan("Kucing", "Abu abu", "Persia", "Suka bermain", 3);
        hewan.namaHewan("+++++++++++++++++++++++++++++++++++++++++++++");
        n.namaHewan("Kucing", "Abu abu", "Persia", "Suka bermain", 3);
    }
}
