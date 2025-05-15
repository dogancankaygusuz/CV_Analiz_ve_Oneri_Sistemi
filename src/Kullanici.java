public class Kullanici implements Gozlemci {
    private String ad;

    public Kullanici(String ad) {
        this.ad = ad;
    }

    @Override
    public void guncelle(String mesaj) {
        System.out.println(ad + " için güncelleme: " + mesaj);
    }
    @Override
    public void aboneBilgisiGoster() {
        System.out.println("Abone Adı: " + ad);
    }
    public String getAd() {
        return ad;
    }
}
