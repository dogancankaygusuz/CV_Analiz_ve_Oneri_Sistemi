public class YazilimciCvFabrikasi implements CvFabrikasi {
    @Override
    public Cv cvOlustur() {
        return new YazilimciCv();
    }
    @Override
    public void fabrikaBilgisiGöster() {
        System.out.println("Bu fabrika Yazılımcı CV'si üretir.");
    }
}
