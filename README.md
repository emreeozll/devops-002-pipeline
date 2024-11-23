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


<br></br>

# Jenkins'te Kimlik Bilgileri ve Docker Ayarı
Jenkins ile DockerHub’a görüntü göndermek ve GitHub’dan kod çekmek için kimlik bilgilerini yapılandırmanız, ayrıca Docker'ı araç olarak eklemeniz gerekir.

![alt text](image.png)


#### 1. **Kimlik Bilgilerini Ayarlama**

- **Jenkins’e Erişim:** Tarayıcınızdan `http://localhost:9999` adresine gidin.  
- **Kimlik Bilgilerine Erişim:**
  - **"Jenkins'i Yönet > Kimlik Bilgilerini Yönet"** yolunu izleyin.  
  - Alan adını seçin veya gerekirse yeni bir alan oluşturun.

##### **DockerHub Kimlik Bilgilerini Eklemek:**
1. **"Kimlik Bilgileri Ekle"** seçeneğine tıklayın.  
2. **Tür:** `Kullanıcı Adı ve Şifre`.  
3. DockerHub kullanıcı adınızı ve şifrenizi girin.  
4. **ID veya Açıklama:** `dockerhub-credentials` gibi bir isim verin.  
5. **Kaydet.**

##### **GitHub Kimlik Bilgilerini Eklemek:**
1. Tekrar **"Kimlik Bilgileri Ekle"** seçeneğine tıklayın.  
2. **Tür:** `Kullanıcı Adı ve Şifre` veya `Gizli Metin` (Token kullanıyorsanız).  
3. GitHub kullanıcı adı ve şifre/token bilgilerini girin.  
4. **ID:** Örneğin, `github-credentials`.  
5. **Kaydet.**

---

#### 2. **Docker’ı Araç Olarak Ekleme**

- **Global Araç Yapılandırması:**  
  Jenkins panosundan **"Jenkins'i Yönet > Genel Araç Yapılandırması"** yolunu izleyin.  

- **Docker’ı Yapılandırma:**  
  1. Docker bölümüne gidin ve **"Docker Ekle"** seçeneğine tıklayın.  
  2. **Ad:** Örneğin, `Docker-latest`.  
  3. **Otomatik Yükle:** En son sürüm için **"Son Sürümü Otomatik Yükle"** seçeneğini seçin.  

- **Kaydet:** Değişiklikleri uygulamak için **"Kaydet"** düğmesine tıklayın.  

---

### Sonuç
Bu yapılandırma ile Jenkins, Docker görüntüleri oluşturup DockerHub’a göndermeye ve GitHub ile entegre olmaya hazır hale gelir.



---
<br></br>
### Maven Derleme ve Docker Görüntüsü Oluşturma için Jenkins Pipeline

Bu Jenkins Pipeline betiği, Maven kullanarak bir projeyi derleyip paketler ve ardından Docker görüntüsü oluşturup etiketler. Ayrıca bu görüntüyü DockerHub'a göndermek için bir temel yapı sağlar.

![alt text](image-1.png)

#### Pipeline Adımları

1. **Maven Derleme:** Maven kullanarak projeyi derler ve gerekli paketleri oluşturur.  
2. **Docker Görüntüsü Oluşturma:** Projeden Docker görüntüsü oluşturur ve `latest` etiketiyle etiketler.  
3. **DockerHub Gönderimi:** Oluşturulan görüntüyü DockerHub deposuna yükler.  


#### Jenkins Pipeline Betiği

```groovy
pipeline {
    agent any

    tools{
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {
        stage('Build Maven') {
            steps {

                //// Check out code from GitHub repository 
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/emreeozll/devops-002-pipeline']])

                //sh 'mvn clean install'
                bat 'mvn clean install'
            }
        }


         stage('Unit Test') {
             steps{

                     // // For Unix/Linux, use: sh 'mvn test'
                            bat 'mvn test'

                    // // For Unix/Linux, use: sh 'echo Docker Image to Clean'
                            bat 'echo Docker Image to Clean'

                   }
         }


           stage('Docker Image') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/emreeozll/devops-002-pipeline']])

                //sh 'mvn clean install'
                bat 'docker build -t  emreeoozell/devops-application-002:v003   .'
            }
        }

```



### Gereksinimler
- **Maven ve Docker:** Jenkins üzerinde **Maven3** yapılandırılmış, Docker kurulu ve çalışır durumda olmalıdır.  
- **Kimlik Bilgileri:** GitHub ve DockerHub kimlik bilgileri, ilgili alanlara (`github-credentials` ve `dockerhub-credentials`) eklenmiş olmalıdır.  
- **Dockerfile:** Projenizde bir `Dockerfile` bulunmalıdır.  

Bu yapılandırma, Jenkins’in koddan Docker görüntüsü oluşturup DockerHub’a gönderebilmesini sağlar.

---

### DockerHub’a İtme Aşaması
Docker görüntüsünü DockerHub’a göndermek için bir adım eklenmiştir. Bu adım, Jenkins'te DockerHub kimlik bilgilerinin daha önce yapılandırılmış olduğunu varsayar.


```groovy
pipeline {
    agent any

    tools{
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {
        stage('Build Maven') {
            steps {

                //// Check out code from GitHub repository 
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/emreeozll/devops-002-pipeline']])

                //sh 'mvn clean install'
                bat 'mvn clean install'
            }
        }


         stage('Unit Test') {
             steps{

                     // // For Unix/Linux, use: sh 'mvn test'
                            bat 'mvn test'

                    // // For Unix/Linux, use: sh 'echo Docker Image to Clean'
                            bat 'echo Docker Image to Clean'

                   }
         }


           stage('Docker Image') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/emreeozll/devops-002-pipeline']])

                //sh 'mvn clean install'
                bat 'docker build -t  emreeoozell/devops-application-002:v003   .'
            }
        }

```
- **Kimlik Bilgileri:** GitHub ve DockerHub kimlik bilgileri, ilgili alanlara (`github-credentials` ve `dockerhub-credentials`) eklenmiş olmalıdır.  
- **Dockerfile:** Projenizde bir `Dockerfile` bulunmalıdır.  

<br></br>

### Kubernetes’e Dağıtım
Jenkins ile Docker görüntüsünü bir Kubernetes kümesine otomatik olarak dağıtmak için Jenkins’i Kubernetes eklentisi ile yapılandırdık. Bu yapılandırma, Jenkins üzerinden uygulamanızı kolayca Kubernetes ortamına dağıtmanızı sağlar.
![alt text](image-2.png)
*Minikube'de uygulamaya erişim için NodePort ve LoadBalancer'ı gösteren Kubernetes servisleri.*

<br></br>

### Kubernetes Dağıtımı için Jenkins Pipeline Güncellemesi
Bu aşamada, kubernetesDeployuygulamamızı YAML yapılandırma dosyasını ( deployment-service.yml) kullanarak Kubernetes'e dağıtma adımını kullanıyoruz.

Güncellenen Jenkins Pipeline betiği şu şekilde:

```groovy

pipeline {
    agent any

    tools{
        jdk 'JDK17'
        maven 'Maven3'
    }



    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/emreeozll/devops-002-pipeline']])

                //sh 'mvn clean install'
                bat 'mvn clean install'
            }
        }



         stage('Unit Test') {
             steps{

                           //sh 'mvn test'
                            bat 'mvn test'

                           //sh 'echo Docker Image to Clean'
                            bat 'echo Docker Image to Clean'

                   }
         }



           stage('Docker Image') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/emreeozll/devops-002-pipeline']])

                //sh 'mvn clean install'
                bat 'docker build -t  emreeoozell/devops-application-002:v003   .'
            }
        }



        stage('Docker Image to DockerHub') {
            steps {
                //sh 'mvn clean install'
               script{

                withCredentials([string(credentialsId: 'DockerHubToken', variable: 'DockerHubToken')]){
                  // some block

                  bat ' echo docker login --username emreeoozell --password ${DockerHubToken}'

                  //bat 'docker build -t  emreeoozell/my-applications   .'  : aynısı var diye yorum satırına aldım

                   bat 'docker image push docker.io/emreeoozell/devops-application-002:v003'

                }
              }
           }
        }



         stage('Deploy Kubernetes') {
              steps{
               script{
                             kubernetesDeploy (configs: 'deploymentservice.yaml', kubeconfigId: 'kubernetes')
                     }
               }
         }
```
<br></br>

### Minikube ile Kubernetes Dağıtımını İzleme

Jenkins kullanarak bir Kubernetes kümesine uygulama dağıttıktan sonra, yerel olarak Minikube ile izleme ve yönetim işlemleri yapılabilir. Minikube, Kubernetes kaynaklarının durumunu kolayca görüntülemek için idealdir.

---

#### Minikube ile İzleme Adımları


1. **Minikube’u Başlat:**  
   Minikube çalışmıyorsa başlatmak için:  
   ```bash
   minikube start
   ```

2. **Kontrol Paneline Erişim:**  
   Minikube panosunu açarak kaynakları izleyin:  
   ```bash
   minikube dashboard
   ```

3. **Servis URL'sini Görüntüle:**  
   Dağıtımınızın oluşturduğu servise erişim URL’sini alın:  
   ```bash
   minikube service my-application-service --url
   ```

![alt text](image-3.png)
---

Bu adımlar sayesinde Minikube ile dağıtımları kolayca izleyebilir ve uygulamanızın durumunu kontrol edebilirsiniz.

<br></br>

### Jenkins Pipeline: Birim Testi ve Docker Temizleme
Bu Pipeline betiği, birim testi aşamasını ve Docker görüntüsü temizleme adımını içerir. Bu yapı, hem kod kalitesini kontrol eder hem de gereksiz Docker görüntülerini kaldırarak sunucu alanını optimize eder.

```groovy 
pipeline {
    agent any

    tools{
        jdk 'JDK17'
        maven 'Maven3'
    }



    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/emreeozll/devops-002-pipeline']])

                //sh 'mvn clean install'
                bat 'mvn clean install'
            }
        }



         stage('Unit Test') {
             steps{

                           //sh 'mvn test'
                            bat 'mvn test'

                           //sh 'echo Docker Image to Clean'
                            bat 'echo Docker Image to Clean'

                   }
         }



           stage('Docker Image') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/emreeozll/devops-002-pipeline']])

                //sh 'mvn clean install'
                bat 'docker build -t  emreeoozell/devops-application-002:v003   .'
            }
        }



        stage('Docker Image to DockerHub') {
            steps {
                //sh 'mvn clean install'
               script{

                withCredentials([string(credentialsId: 'DockerHubToken', variable: 'DockerHubToken')]){
                  // some block

                  bat ' echo docker login --username emreeoozell --password ${DockerHubToken}'

                  //bat 'docker build -t  emreeoozell/my-applications   .'  : aynısı var diye yorum satırına aldım

                   bat 'docker image push docker.io/emreeoozell/devops-application-002:v003'

                }
              }
           }
        }



         stage('Deploy Kubernetes') {
              steps{
               script{
                             kubernetesDeploy (configs: 'deploymentservice.yaml', kubeconfigId: 'kubernetes')
                     }
               }
         }



          stage('Docker Imag to Clean') {
                steps {

                         // sh bat 'docker rmi emreeoozell/devops-application-002:v003'
                         //  bat 'docker rmi emreeoozell/devops-application-002:v003'

                         //Orjinal image dokunmadan Dangling'lerden(aynı image - none) kurtulmak istiyorsak
                         bat 'docker  image prune -f'

                         // bat 'docker  image prune -a -f' : Aynı isimdeki imageleri ve tüm versiyonları silmek istiyorsak

                         //  /* - */ jenkins yorum satırı alma, gereksiz aşamaları çalıştırmaya gerek yokken kullanabiliriz.
                     }
                }





    }
}
```
<br></br>
*Başarılı dağıtımdan sonra Kubernetes hizmeti aracılığıyla erişilebilen uygulama çıktısı.*

![alt text](image-6.png)

*Başarılı dağıtımdan sonra Kubernetes hizmeti aracılığıyla erişilebilen uygulama çıktısı.*

![alt text](image-5.png)
---

### Derlemeden temizlemeye kadar tüm aşamaları gösteren tamamlanmış Jenkins işlem hattı.
![alt text](image-7.png)