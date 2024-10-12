class MountainBike extends Sepeda {
    public MountainBike(String jenis) {
        super(jenis);
    }

    @Override
    public void suara() {
        System.out.println("Sepeda gunung " + getJenis() + " bersuara: Ring Ring Ring!");
    }
}