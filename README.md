# 🧠 CV Analiz ve Öneri Sistemi

Bu proje, iş arayan kullanıcıların CV'lerini analiz ederek iyileştirme önerileri sunan ve uygun iş ilanlarını anlık olarak bildiren akıllı bir sistemdir. Sistem, dört temel tasarım şablonunu (Design Patterns) kullanarak nesne yönelimli tasarımı ve yazılım geliştirme prensiplerini örneklemektedir.

## 🚀 Proje Özeti

**Amaç:**  
- Kullanıcıların oluşturdukları CV'lerin iş ilanlarına ne kadar uygun olduğunu analiz etmek,  
- CV üzerinde iyileştirmeler önermek,  
- Kullanıcıları uygun iş ilanları hakkında bilgilendirmek.

**Kapsam:**  
Bu sistem, aşağıdaki tasarım şablonlarını uygulayarak modüler, genişletilebilir ve sürdürülebilir bir yapı sunar:

- **Factory & Abstract Factory Pattern**
- **Strategy Pattern**
- **Observer Pattern**

---

##  Kullanılan Tasarım Desenleri ve Amaçları

### 🏭 Abstract Factory & Factory Pattern

Farklı meslek gruplarına (örneğin Yazılımcı, Mühendis) özgü CV’lerin oluşturulmasını sağlar.  
Yeni bir meslek türü eklendiğinde, sistemde mevcut kodlara dokunmadan yeni fabrika sınıfı ile genişleme yapılabilir.

### 🧠 Strategy Pattern

CV değerlendirme stratejilerinin birbirinden bağımsız olarak tanımlanmasına ve gerektiğinde kolayca değiştirilmesine olanak tanır.  
Kullanıcı, farklı stratejilerle CV’sini analiz edebilir:

📌 **Stratejiler:**  
- `IlanUyumuStratejisi`  
- `DilbilgisiKontrolStratejisi`  

### 🔔 Observer Pattern

Sisteme kayıtlı kullanıcılar (gözlemciler), yeni iş ilanlarından anında haberdar edilir.  
İş ilanları yayınlandıkça tüm abonelere bildirim gönderilir.

---

## 💡 SOLID ve Temiz Kod Prensipleri

Bu proje, yazılım geliştirme sürecinde **SOLID prensiplerine** ve **Clean Code (Temiz Kod)** yaklaşımına uygun olarak geliştirilmiştir:

- **S:** Her sınıf yalnızca bir sorumluluğa sahiptir.
- **O:** Yeni stratejiler veya meslek türleri eklendiğinde mevcut kodlar değiştirilmeden genişletilebilir.
- **L:** Alt sınıflar, üst sınıfların yerine sorunsuz geçebilir.
- **I:** Arayüzler sadece gerekli işlevleri içerir.
- **D:** Üst düzey sınıflar, alt düzey sınıflara değil soyutlamalara bağımlıdır.

Temiz kod yaklaşımıyla:
- Anlamlı isimlendirme
- Yorumlara gerek bırakmayan sade yapı
- Tek sorumluluk prensibi
- Gereksiz kod tekrarından kaçınma sağlanmıştır.

---
