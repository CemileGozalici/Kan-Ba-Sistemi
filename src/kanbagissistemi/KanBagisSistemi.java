package kanbagissistemi;

import Factory.KanGrubu;
import Factory.KanGrubuFactory;
import Observer.Bagisciler;
import Observer.Hastane;
import dao.BagisciDAO;
import dao.DoktorDAO;
import dao.KategoriDAO;
import entity.Bagisci;
import java.util.Scanner;
import proxy.DoktorProxy;

public class KanBagisSistemi {

    public static void main(String[] args) {
        KategoriDAO kategori = new KategoriDAO();
        DoktorDAO doktor = new DoktorDAO();
        BagisciDAO bag = new BagisciDAO();
        Scanner scan = new Scanner(System.in);

        while (true) {
            int giris;

            System.out.println("\n----------MENÜ-----------"
                    + "\n1-Kan bağışı sistemine kayıt\n"
                    + "2-Kan grubu özellikleri\n"
                    + "3-Kayıt silme\n"
                    + "4-Bağışcı bilgileri\n"
                    + "5-Mesajlar\n"
                    + "6-ÇIKIŞ");

            try {

                System.out.print("yapmak istediğiniz işlem:");
                giris = scan.nextInt();

                if (giris == 6) {
                    System.out.print("Çıkış yapılıyor...");
                    break;
                } else if (giris > 6) {
                    System.out.println("Hatalı sayı giriş!!!");
                    break;
                }

                switch (giris) {

                    case 1:
                        
                                
                        System.out.print("\nDoktorlar ve çalıştığı hastaneler\n");
                        doktor.ListeYazdir();
                        System.out.print("\nTercih etmek istediğiniz doktorun id seçiniz: ");
                        int dok = scan.nextInt();
                        System.out.print("\nKAN GRUBLARI\n");
                        kategori.ListeYazdir();
                        System.out.print("\nKan grubunuzun id'sini seçiniz: ");
                        int kangrubu = scan.nextInt();
                        System.out.print("TC kimlik numaranız: ");
                        int tc = scan.nextInt();
                        System.out.print("adınız soyadınız: ");
                        String adSoyad = scan.next();
                        System.out.print("kaç ayda bir kan vermek istersiniz(kadınlarda min 4 ayda bir erkeklerde min 3 ayda bir): ");
                        String tarih = scan.next();
                        System.out.print("telefon numaranız: ");
                        String telefon = scan.next();
                        bag.createBagisci(new Bagisci(tc, adSoyad, kangrubu, tarih, dok, telefon));
                        System.out.println("kayıt başarılı bir şekilde oluşturulmuştur");
                        break;

                    case 2:
                        System.out.print("\nKAN GRUBLARI\n");
                        kategori.ListeYazdir();
                        System.out.print("\nKan grubunuzun id'sini seçiniz: ");
                        int grup = scan.nextInt();
                        if (grup == 1) {
                            KanGrubu ap = KanGrubuFactory.getKanGrubu(grup, "A", "+", "ARh+,ARh-,0Rh+,0Rh-", "ARh+,ABRh+", "");
                            System.out.println("\n-----------ARh+ kan grubu ÖZELLİKLERİ:----------\n ");
                            System.out.println(ap);
                        } else if (grup == 2) {
                            KanGrubu an = KanGrubuFactory.getKanGrubu(grup, "A", "-", "ARh-,0Rh-", "ARh+,ARh-,ABRh+,ABRh-", "");
                            System.out.println("\n-----------ARh- kan grubu ÖZELLİKLERİ:----------\n ");
                            System.out.println(an);
                        } else if (grup == 3) {
                            KanGrubu abp = KanGrubuFactory.getKanGrubu(grup, "AB", "+", "HERKESTEN", "ABRh+", "");
                            System.out.println("\n-----------ABRh+ kan grubu ÖZELLİKLERİ:----------\n ");
                            System.out.println(abp);
                        } else if (grup == 4) {
                            KanGrubu abn = KanGrubuFactory.getKanGrubu(grup, "AB", "-", "ABRh-,ARh-,BRh-,0Rh-", "ABRh+,ABRh-", "");
                            System.out.println("\n-----------ABRh- kan grubu ÖZELLİKLERİ:----------\n ");
                            System.out.println(abn);
                        } else if (grup == 5) {
                            KanGrubu bp = KanGrubuFactory.getKanGrubu(grup, "B", "+", "BRh+,BRh-,0Rh+,0Rh-", "BRh+,ABRh+", "");
                            System.out.println("\n-----------BRh+ kan grubu ÖZELLİKLERİ:----------\n ");
                            System.out.println(bp);
                        } else if (grup == 6) {
                            KanGrubu bn = KanGrubuFactory.getKanGrubu(grup, "B", "-", "BRh-,0Rh-", "BRh+,BRh-,ABRh+,ABRh-", "");
                            System.out.println("\n-----------BRh- kan grubu ÖZELLİKLERİ:----------\n ");
                            System.out.println(bn);
                        } else if (grup == 7) {
                            KanGrubu op = KanGrubuFactory.getKanGrubu(grup, "0", "+", "0Rh+,0Rh-", "0Rh+,ARh+,BRh+,ABRh+", "");
                            System.out.println("\n-----------0Rh+ kan grubu ÖZELLİKLERİ:----------\n ");
                            System.out.println(op);
                        } else if (grup == 8) {
                            KanGrubu on = KanGrubuFactory.getKanGrubu(grup, "0", "-", "0Rh-", "HERKESE", "");
                            System.out.println("\n-----------0Rh- kan grubu ÖZELLİKLERİ:----------\n ");
                            System.out.println(on);
                        } else {
                            System.out.println("HATALI GİRİŞ!!!");
                        }
                        break;
                    case 3:
                        System.out.print("TC kimlik numaranız:");
                        int tc1 = scan.nextInt();
                        bag.update(new Bagisci(tc1));//stok eksitme işlemi
                        bag.delete(new Bagisci(tc1));
                        System.out.println("Kaydınız silinmiştir");
                        break;
                    case 4:
                        System.out.print("Kullanıcı adı:");
                        String isim = scan.next();
                        System.out.print("şifreniz:");
                        String sifre = scan.next();

                        DoktorProxy doktorProxy = new DoktorProxy(isim, sifre);

                        try {
                            doktorProxy.getBagiscilist();
                            doktorProxy.Listele();
                        } catch (IllegalAccessException e) {
                            System.out.println("Kullanıcı adı veya şifre hatalıdır!!!\n(Bağışçı bilgilerine sadece doktorlar erişebilir!)");
                        }

                        break;
                    case 5:
                        Hastane kangrubu1 = new Hastane("HASTANE");

                        System.out.println("\n");
                        Bagisciler bagisci1 = new Bagisciler("Meltem");
                        Bagisciler bagisci2 = new Bagisciler("Gamze");
                        Bagisciler bagisci3 = new Bagisciler("Mustafa");

                        kangrubu1.register(bagisci1);
                        kangrubu1.register(bagisci2);
                        kangrubu1.register(bagisci3);

                        kangrubu1.mesaj("Bağışda bulunduğunuz için teşekkür ederiz");

                        kangrubu1.unregister(bagisci2);
                        break;
                   
                }
            } catch (Exception e) {
                System.out.println("HATALI GİRİŞ!!!\n" + e.getMessage());
                break;
            }

        }
    }

}
