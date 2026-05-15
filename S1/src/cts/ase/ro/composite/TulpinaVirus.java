package cts.ase.ro.composite;

public class TulpinaVirus extends ANod {
    private String denumire;
    private int nrCazuri;
    private String tipTransmitere;
    private float rataMortalitate;

    public TulpinaVirus(String denumire, int nrCazuri,
                        String tipTransmitere, float rataMortalitate) {
        this.denumire = denumire;
        this.nrCazuri = nrCazuri;
        this.tipTransmitere = tipTransmitere;
        this.rataMortalitate = rataMortalitate;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public int getNrCazuri() {
        return nrCazuri;
    }

    @Override
    public String getInfo() {
        return "Tulpina " + denumire + ", cazuri=" + nrCazuri + ", transmitere=" + tipTransmitere + ", mortalitate=" + rataMortalitate;
    }
}