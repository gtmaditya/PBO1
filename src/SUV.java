class SUV extends Mobil {
    public SUV(String merek) {
        super(merek);
    }

    @Override
    public void suara() {
        System.out.println("SUV " + getMerek() + " bersuara: Vroom Vroom Vroom!");
    }
}