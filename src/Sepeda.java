class Sepeda {
    private String jenis;

    public Sepeda(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void suara() {
        System.out.println("Sepeda bersuara: Ring Ring!");
    }
}