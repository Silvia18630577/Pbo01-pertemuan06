public class Hewan {
    //atribut
    String nama;
    String warna;
    String jenis;
    String sifat;
    int umur;

    public Hewan(){
    }


    //behavior/method
    void makan() {
        System.out.println("Hewan yang bisa makan");
        System.out.println();
    }

    void minum() {
        System.out.println("Hewan yang bisa minum");
        System.out.println();
    }

    void bergerak() {
        System.out.println("Hewan yang bisa bergerak");
        System.out.println();
    }

    void bersuara() {
        System.out.println("Hewan yang bisa bersuara");
        System.out.println();
    }

    void berkembangbiak() {
        System.out.println("Hewan yang bisa berkembang biak");
        System.out.println();
    }

    //constructor
    Hewan(String nama, String warna){
        System.out.println("Hallooooo aku merupakan seekor hewan dengan nama " + nama + " dan warna " + warna);
    }
    Hewan(String nama){
        System.out.println("Bagian dari saya yaitu " + nama);
    }
    Hewan(String nama, String warna, String jenis, String sifat, int umur ) {
        System.out.println("Dengan warna " + warna);
        System.out.println("Dengan jenis " + jenis);
        System.out.println(nama + " mempunyai sifat " + sifat + " umur " + umur);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }

    //method overloading//
    void namaHewan(){
        System.out.println(nama);
        System.out.println(warna);
        System.out.println(jenis);
        System.out.println(sifat);
        System.out.println(umur);
    }
    void namaHewan (String karakter){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(nama);
        System.out.println(warna);
        System.out.println(jenis);
        System.out.println(sifat);
        System.out.println(umur + "tahun");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
    void namaHewan (String nama, String warna, String jenis, String sifat, int umur){
        System.out.println("Nama hewan \t:" + nama);
        System.out.println("Warna \t\t\t:" + warna);
        System.out.println("Jenis hewan \t:" + jenis);
        System.out.println("Sifat hewan \t:" + sifat);
        System.out.println("Umur \t\t:" + umur +"tahun");
    }
}
