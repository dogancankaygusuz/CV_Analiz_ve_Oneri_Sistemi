public class MuhendisCvFabrikasi implements CvFabrikasi{
    @Override
    public Cv cvOlustur() {
        return new MuhendisCv();
    }
    @Override
    public void fabrikaBilgisiGöster() {
        System.out.println("Bu fabrika Mühendis CV'si üretir.");
    }
}
