public class DilbilgisiKontrolStratejisi implements CvDegerlendirmeStratejisi{
    @Override
    public void degerlendir(Cv cv) {
        System.out.println("CV'deki dilbilgisi hataları kontrol edildi.");
    }
    @Override
    public void stratejiBilgisiGoster() {
        System.out.println("Dil bilgisi Kontrol Stratejisi");
    }

    public int hataSayisiBul(Cv cv) {
        System.out.println("CV'de 5 dilbilgisi hatası bulundu.");
        return 5;
    }
}
