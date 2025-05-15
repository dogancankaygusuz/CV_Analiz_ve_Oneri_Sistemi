public class IlanUyumuStratejisi implements CvDegerlendirmeStratejisi{
    @Override
    public void degerlendir(Cv cv) {
        System.out.println("CV iş ilanlarına uygunluk açısından değerlendirildi.");
    }
    @Override
    public void stratejiBilgisiGoster() {
        System.out.println("Ilan Uyumu Stratejis.");
    }

    public double IlanUyumuHesapla(Cv cv) {
        System.out.println("CV ile iş ilanı uyumu %80 olarak hesaplandı.");
        return 80.0;
    }
}
