### DevOps-02-Pipeline: Modern CI/CD Uygulamaları için Pratik Yaklaşım 🚀

**DevOps-02-Pipeline** projesine hoş geldiniz! Bu çalışma, DevOps uygulamalarını temel alarak sürekli entegrasyon ve teslimat (CI/CD) süreçlerini otomatikleştiren bir işlem hattının nasıl tasarlanıp uygulanacağını ele alıyor. Amacımız, yazılım geliştirme ve dağıtım süreçlerini hızlandırmak, kod kalitesini artırmak ve sürdürülebilir bir dağıtım döngüsü oluşturmaktır.

### **Projenin Hedefleri**

Bu projede aşağıdaki hedefleri gerçekleştirmeyi amaçlıyoruz:

- **Otomatik Derlemeler:** Kodda yapılan her değişiklikte tetiklenen otomatik yapılar oluşturmak.
- **Otomatik Test Süreçleri:** Kodun kalite ve güvenilirliğini sağlamak için entegre test adımları eklemek.
- **Sürekli Entegrasyon:** Geliştirici ekiplerinin kodlarını hızlı ve güvenli bir şekilde birleştirmesini sağlamak.
- **Sürekli Teslimat:** Hazırlık ve üretim ortamlarına sorunsuz bir şekilde otomatik dağıtım yapmak.

Bu hedeflerle, modern bir yazılım geliştirme sürecinin kalbini oluşturan bir CI/CD işlem hattı kurmaya yönelik somut bir kılavuz sunuyoruz. Proje, DevOps uzmanlarının ve geliştiricilerin, gerçek dünya senaryolarında uygulamalı bir deneyim kazanmasını sağlayacak.

---

### **Kullanılan Araçlar ve Teknolojiler**

Bu projede, CI/CD işlemlerinin her aşamasında kullanılan modern DevOps araçlarından faydalanıyoruz:

- **Jenkins:** Derleme, test ve dağıtım süreçlerini yöneten güçlü bir CI/CD otomasyon aracı.
- **Java:** Uygulama geliştirme ve çalışma zamanı desteği için tercih edilen bir platform.
- **Git & GitHub:** Sürüm kontrolü ve kaynak kodu yönetimi için vazgeçilmez araçlar.
- **Maven:** Java projeleri için bağımlılık yönetimi ve derleme otomasyonu sağlayan bir araç.
- **Docker & DockerHub:** Uygulamaları izole edilmiş konteynerler halinde paketlemek ve paylaşmak için kullanılan platform.
- **Kubernetes:** Konteynerleştirilmiş uygulamaların ölçeklenebilir bir şekilde dağıtılması ve yönetilmesi için kullanılan orkestrasyon sistemi.

---

### **Neden Bu Proje?**

Bu proje, modern yazılım geliştirme süreçlerine uyum sağlamak isteyen ekipler için bir yol haritası sunar. Pratik örnekler ve dinamik bir altyapıyla, CI/CD işlem hatlarının nasıl tasarlanıp optimize edileceği konusunda derinlemesine bir anlayış sağlar. Sürekli gelişen DevOps dünyasında yerinizi sağlamlaştırmak için bu projeyi deneyimlemek tam size göre!

Haydi, Pipeline birlikte inşa edelim ve teslimat süreçlerini geleceğe taşıyalım! 🚀



<br></br>
# Jenkins Kurulumu
### Jenkins Üzerinde Maven Yapılandırması  
Java projelerinde derleme süreçlerini otomatikleştirmek için Jenkins'e Maven eklemek oldukça önemlidir. Bu kılavuzda, Maven'ın 3.9.6 sürümünü Jenkins'e nasıl entegre edeceğinizi adım adım açıklıyoruz.  

#### **1. Jenkins'e Erişim Sağlayın**  
Windows'ta execute dosyası olarak indirebilir, kurulum esnasında isterseniz konfigürasyonları yapabilirsiniz. 

Ayrıca aşağıdaki komutları kullanarak da jenkins kurulumu ve local cihazınız üzerind eçalıştırma işlemi yapabilirsiniz.

```
cd D:\DevOps\Jenkins
java -jar jenkins.war --httpPort=9999
```
Tarayıcınız üzerinden Jenkins kontrol paneline ulaşmak için şu adresi kullanın:  
`http://localhost:9999`  

---

#### **2. Global Araç Yapılandırmasına Git**  
- Jenkins ana sayfasından **Jenkins'i Yönet** sekmesine tıklayın.  
- Açılan sayfada **Genel Araç Yapılandırması** seçeneğini bulun ve tıklayın.  

---

#### **3. Maven Ekleyin**  
- Gelen sayfada **Maven** bölümüne ilerleyin.  
- **Maven Ekle** seçeneğine tıklayarak yeni bir Maven yapılandırması başlatın.  
- **Ad** kısmına anlamlı bir isim verin, örneğin: `Maven-3.9.6`.  
- **Otomatik Olarak Yükle** seçeneğini işaretleyin ve listeden **3.9.6 sürümünü** seçin.  
  - Alternatif olarak, yerel makinenizde kurulu bir Maven sürümünü elle de tanımlayabilirsiniz.  

---

#### **4. Yapılandırmayı Kaydedin**  
- Girdiğiniz bilgileri saklamak için **Kaydet** butonuna basın.  

---

Artık Jenkins, Maven 3.9.6 sürümünü kullanmaya hazır! Bu yapılandırma, Jenkins boru hatlarınızda Java projelerini derleme, test etme ve dağıtma süreçlerini kolayca otomatikleştirmenizi sağlayacaktır. 🎉