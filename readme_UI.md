# com.projectName
### 
***

1. Feature filelerin isimlendirmesi US_001_OPD.feature seklinde olmali

2. Locate alinan element nerenin elementi oldugu aciklama satiri ile aciklanmali
   || orn:  Homepage>> LoginLink>> Email Text Box ||

<br/>

### stepdefinitions
### resource
QA_01 : Betul
QA_02 : Kardelen
QA_03 : Adem
QA_04 : Bilal
QA_05 : Eyup
QA_06 : Fatih
QA_07 : Kaan
QA_08 : Mehmet
QA_09 : Sadik
QA_10 : Seref
QA_11 : Ugur

### Git
***
1. Herkes kendi adina birer branch olusturur.
    * `git branch <isim>`

2. sag alt panelde branc ismimizin yazili oldugu kisimdan
    * main' e tikliyoruz
    * update'e tikliyoruz
    * sonra merge 'main' into 'brancismi' yazan kısma tikliyoruz
    * bu şekilde pull işlemini gerçekleştirmiş oluyoruz

3. Yaptigi degisiklikleri kucuk commitlerle kendi branchinda saklar. Burada tavsiye edilen sadece sizin yaptiginiz degisikliklerin eklenmesidir.
    * 'git add . kesinlikle kullanilMAMAli'
    * 'git add (degisiklik yapilan yerin  dosya yolu yani "path from content root" u)
    * 'git commit -m "İsim/tarih/Yapilan Degisiklikler icin bir mesaj yazilir."'
      Örn >>> git commit -m "<Kendi isminiz>/02.07/loginClassEklendi"
4. git push

5. gelen linkten ustteki linke tiklanir ve github hesabi sayfasi acilir

6. Push ettigimiz kendi kodumuz icin **request** olusturulur ve is biter

7. Merge request islemi team lead tarfindan gerceklestirilir


### Isimlendirmelerde dikaat edilecekler
***
| Element Türü   | Variable name |
|----------------|--------------|
| Button         | signInButton |    
| Logo           | logoX         |
| icon           | iconX        |
| Sadece text    | labelX       |
| Drop down      | dropDownX    |
| Radio Button   | radioButtonX |
| Check box      | checkBoxX    |
| Tablo Sütünu   | columnX      |
| Tablo Satiri   | rowX         |
| Kisi Resimleri | imageProfileX |
| ürün resimleri | imageProductX |
| Linkler        | linkX        |

Github genel kurallar

1-Ilk adımda team leader in github’indan, proje linkini kopyalayarak kendi Intellj’imizde   new project E TIKLAYIP, project from version control ile projemizi oluşturalım

2-Projemizin içerisinde terminali kullanarak kendi branch’imizi olusturmak icin terminale "git branch" yazarak once kac tane branch oldugunu gozumuzle gorelim. Lutfen asagida verilen adimlari eklemis oldugum cift tirnak isaretlerini gormezden gelerek kodlari terminale yazalim. Sadece orada yazilmasi gerkeni belirtmek için cift tirnak kullaniyorum.

3- ardindan kendi branch imizi olusturmak icin "git branch kaan" formatinda terminale komutuzu verelim.

4- Bu komutu yaptiktan sonra branch imizin eklenip eklenmedigini kontrol etmek icin tekrar "git branch" yazarak ismini verdigimiz branch in basariyla eklendigini kontrol edelim.

5- Artik kendi olusturdugumuz branch e gecis yapmak icin "git checkout ISIM" formatini kullanarak kendi branch imize main branch inden gecis saglayalim

6- Kendi branch imize basari ile gecis yapildigini test etmek icin tekrar "git branch" komutunu yazarak ismini verdigimizbranch de oldugumuzu test edelim.

7-Burada projemiz ile alakali bize verilen gorevleri yerine getirmek icin oncelike kendi package imizi olusturacagiz.
ardindan classimizi olusturtan sonra karsima githup o "ADD FILE TO GIT" seklinde kucuk bir pencere acilacak.

-Burada dont ask again kutusuna isaretleme yaparak sag taraftan cancel butonuna basacagiz

-BU ADIM COK ONEMLI EGER KI BURADA BIR HATA YAPILIRSA TUM PROJEDE PROBLEM OLACAKTIR SEBEBI SIZIN EKLEDIGINIZ DOSYALARI
SIZIN MANUEL PUSH YAPMADAN INTELLJ OTOMATIK KENDISI GONDERECEKTIR BU YUZDEN BU ADIMI COK DIKKATLE YAPALIM
