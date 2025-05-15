import java.util.ArrayList;
import java.util.List;

public class IsIlaniTakip {
    private List<Gozlemci> gozlemciler = new ArrayList<>();

    public void gozlemciEkle(Gozlemci gozlemci) {
        gozlemciler.add(gozlemci);
    }

    public void gozlemciCikar(Gozlemci gozlemci) {
        gozlemciler.remove(gozlemci);
    }

    public void yeniIsIlani(String ilan) {
        System.out.println("Yeni iş ilanı yayınlandı: " + ilan);
        bildirimGonder("Yeni iş ilanı: " + ilan);
    }
    public void bildirimGonder(String mesaj) {
        for (Gozlemci gozlemci : gozlemciler) {
            gozlemci.guncelle(mesaj);
        }
    }
}
