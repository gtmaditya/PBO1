class Sedan extends Mobil {
    public Sedan(String merek) {
        super(merek);
    }

    @Override
    public void suara() {
        System.out.println("Sedan " + getMerek() + " bersuara: Vroom Vroom!");
    }
}