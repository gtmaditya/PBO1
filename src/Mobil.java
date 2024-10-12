class Mobil {
    private String merek;

    public Mobil(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public void suara() {
        System.out.println("Mobil bersuara: Vroom!");
    }
}
