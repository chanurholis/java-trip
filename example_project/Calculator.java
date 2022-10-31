package example_project;

class Calculator {
    public static void main(String[] args) {
        // penjumlahan
        double hasilPenjumlahan = penjumlahan(2, 3);
        System.out.println("hasil penjumlahan : " + (int) hasilPenjumlahan);

        // pengurangan
        double hasilPengurangan = pengurangan(5, 3);
        System.out.println("hasil pengurangan : " + (int) hasilPengurangan);
    }

    public static double penjumlahan(double bilPertama, double bilKedua) {
        return bilPertama + bilKedua;
    }

    public static double pengurangan(double bilPertama, double bilKedua) {
        return bilPertama - bilKedua;
    }
}