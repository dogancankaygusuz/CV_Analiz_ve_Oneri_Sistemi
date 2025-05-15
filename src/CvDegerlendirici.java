public class CvDegerlendirici {
    private CvDegerlendirmeStratejisi strateji;

    public void stratejiAyarla(CvDegerlendirmeStratejisi strateji) {
        this.strateji = strateji;
    }

    public void degerlendir(Cv cv) {
        if (strateji != null) {
            strateji.degerlendir(cv);
        } else {
            System.out.println("Lütfen bir değerlendirme stratejisi belirleyin.");
        }
    }
    public void aktifStratejiBiligisiYazdır() {
        if (strateji != null) {
            strateji.stratejiBilgisiGoster();
        } else {
            System.out.println("Henüz bir strateji seçilmedi.");
        }
    }
}
