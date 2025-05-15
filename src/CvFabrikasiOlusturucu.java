public class CvFabrikasiOlusturucu {
    public static CvFabrikasi  fabrikaGetir(String meslek) {
        if (meslek.equalsIgnoreCase("Yazilimci")) {
            return new YazilimciCvFabrikasi();
        } else if (meslek.equalsIgnoreCase("Muhendis")) {
            return new MuhendisCvFabrikasi();
        }
        throw new IllegalArgumentException("Geçersiz meslek türü");
    }
}
