public class Main {
    public static void main(String[] args) {
        System.out.println("\nAbstract Factory & Factory Design Pattern\n");
        CvFabrikasiOlusturucu yazilimciFabrika = new CvFabrikasiOlusturucu();
        System.out.println("1. Fabrika Nesnesi " + yazilimciFabrika);

        CvFabrikasiOlusturucu muhendisFabrika = new CvFabrikasiOlusturucu();
        System.out.println("2. Fabrika Nesnesi " + muhendisFabrika);

        // CvFabrikasiOlusturucu fabrikaHata = new CvFabrikasiOlusturucu();
        // System.out.println(fabrikaHata.fabrikaGetir("dogancan"));

        YazilimciCvFabrikasi yazilimci = (YazilimciCvFabrikasi) yazilimciFabrika.fabrikaGetir("yazilimci");
        MuhendisCvFabrikasi mühendis = (MuhendisCvFabrikasi) muhendisFabrika.fabrikaGetir("muhendis");
        yazilimci.fabrikaBilgisiGöster();
        mühendis.fabrikaBilgisiGöster();

        System.out.println("------------------------------------------------------");

        Cv yazilimciCv = yazilimci.cvOlustur();
        System.out.println(yazilimciCv);
        yazilimciCv.cvYaz();
        yazilimciCv.bilgileriGoster();

        System.out.println("------------------------------------------------------");

        Cv muhendisCv = mühendis.cvOlustur();
        System.out.println(muhendisCv);
        muhendisCv.cvYaz();
        muhendisCv.bilgileriGoster();

        System.out.println("\n------------------------------------------------------\n");
        System.out.println("Strategy Design Pattern\n");

        CvDegerlendirici degerlendiriciIlanUyumu = new CvDegerlendirici();
        degerlendiriciIlanUyumu.stratejiAyarla(new IlanUyumuStratejisi());
        degerlendiriciIlanUyumu.aktifStratejiBiligisiYazdır();
        degerlendiriciIlanUyumu.degerlendir(yazilimciCv);
        degerlendiriciIlanUyumu.degerlendir(muhendisCv);

        System.out.println("------------------------------------------------------");

        CvDegerlendirici degerlendiriciDilBilgisi = new CvDegerlendirici();
        degerlendiriciDilBilgisi.stratejiAyarla(new DilbilgisiKontrolStratejisi());
        degerlendiriciDilBilgisi.aktifStratejiBiligisiYazdır();
        degerlendiriciDilBilgisi.degerlendir(yazilimciCv);
        degerlendiriciDilBilgisi.degerlendir(muhendisCv);

        System.out.println("------------------------------------------------------");

        DilbilgisiKontrolStratejisi dilBilgisi = new DilbilgisiKontrolStratejisi();
        dilBilgisi.hataSayisiBul(yazilimciCv);

        IlanUyumuStratejisi ilanUyumu = new IlanUyumuStratejisi();
        ilanUyumu.IlanUyumuHesapla(muhendisCv);

        System.out.println("------------------------------------------------------");

        CvDegerlendirici stratejisiz = new CvDegerlendirici();
        stratejisiz.degerlendir(yazilimciCv);
        stratejisiz.aktifStratejiBiligisiYazdır();

        System.out.println("\n------------------------------------------------------\n");
        System.out.println("Observer Design Pattern\n");

        Kullanici k1 = new Kullanici("Dogancan");
        Kullanici k2 = new Kullanici("Mehmet");

        k1.aboneBilgisiGoster();
        System.out.println(k2.getAd());
        k2.guncelle("Guncelleme icerigi");

        System.out.println("------------------------------------------------------");

        IsIlaniTakip takipSistemi = new IsIlaniTakip();
        takipSistemi.gozlemciEkle(k1);
        takipSistemi.bildirimGonder("1. Bildirim");
        takipSistemi.gozlemciEkle(k2);
        takipSistemi.bildirimGonder("2. Bildirim");

        System.out.println("------------------------------------------------------");
        takipSistemi.yeniIsIlani("Java Developer");
        takipSistemi.gozlemciCikar(k2);
        takipSistemi.yeniIsIlani("Game Developer");
    }
}
