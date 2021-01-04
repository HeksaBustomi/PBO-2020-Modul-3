package Main07186;
import Model_07186.Heksa07186_pesanan;
import Entity_07186.Heksa07186_Kendaraan;
import java.util.ArrayList;
import java.util.Scanner;
import Controller_07186.Heksa07186_AdminController;
import java.util.InputMismatchException;

public class Heksa07186_CuciMobilDanMotor {
    static Heksa07186_AdminController Kendaraan = new Heksa07186_AdminController();
    static Scanner input = new Scanner(System.in);
     public static void main(String[] args) {

        int pilih = 0;
         do{
             try {
             System.out.println("===Selamat Datang Di Atreon Car Wash===");    
             System.out.println("1. Daftar ");
             System.out.println("2. Ambil ");
             System.out.println("3. Lihat Antrian");
             System.out.println("4. Update Data ");
             System.out.println("5. Keluar ");
             System.out.print("pilih : ");
             pilih = input.nextInt();
             switch(pilih)
             {
                 case 1 : Daftar();
                 break;
                 case 2 : Ambil();
                 break;
                 case 3 :view();
                 break;
                 case 4 : updateData();
                 break;
             }}catch(InputMismatchException e){
                 System.out.println("inputan salah !!"); 
                 String dummy = input.next();
             }   
        }while(pilih<5);
      }
    
      static void Daftar(){
        try{
        String Jenis_Kendaraan;
        System.out.println("1. roda 2");
        System.out.println("2. roda 4");
        System.out.print("pilih : ");
        int indexJenis_Kendaraan = input.nextInt();
        if(indexJenis_Kendaraan==1){
           Jenis_Kendaraan="Roda 2";
        }else{
            Jenis_Kendaraan = "Roda 4";
        }
        System.out.print("masukkan no.antrian : ");
        String no_antrian = input.next();
        System.out.print("masukkan nama : ");
        String nama = input.next();
        System.out.print("masukkan alamat : ");
        String alamat = input.next();
        System.out.print("masukkan nomor plat : ");
        String plat_nomor = input.next();
        System.out.print("masukkan merk kendaraan : ");
        String merk = input.next();
        System.out.print("masukkan warna : ");
        String warna = input.next();
        Kendaraan.insertDataCuci(new Heksa07186_Kendaraan (merk,plat_nomor,warna,nama,alamat,no_antrian,Jenis_Kendaraan));
        }catch(InputMismatchException e){
         System.out.println("inputan salah !!"); 
         String dummy = input.next();
        }
      }
      
    static  void Ambil(){
       System.out.print("masukkan no.anrian : ");
       String no_antrian =input.next();
       System.out.print("masukkan nama : ");
       String nama = input.next();
       Kendaraan.ambil(no_antrian,nama);
       for(int i=0;i<Kendaraan.getKendaraan().size();i++)
        {
          if(Kendaraan.getKendaraan().get(i).getNo_Antrian().equals(no_antrian) && Kendaraan.getKendaraan().get(i).getNama().equals(nama))
           {
            System.out.println(" DATA BERHASIL DIAMBIL");
            Kendaraan.getKendaraan().remove(i);
            }
         } 
      }
    
      
    static  void view(){
      System.out.println("====== ANTRIAN =======");
        for(int i=0;i<Kendaraan.getKendaraan().size();i++){
                System.out.println(" no.antrian : " + Kendaraan.getKendaraan().get(i).getNo_Antrian());
                System.out.println(" nama       : " + Kendaraan.getKendaraan().get(i).getNama());
                System.out.println(" alamat     : " + Kendaraan.getKendaraan().get(i).getAlamat());
                System.out.println(" nomor plat : " + Kendaraan.getKendaraan().get(i).getPlat_Nomor());
                System.out.println(" merk       : " + Kendaraan.getKendaraan().get(i).getMerk());
                System.out.println(" warna      : " + Kendaraan.getKendaraan().get(i).getWarna());
                System.out.println("_____________________________"); 
              } 
          }
    
      static void updateData(){ 
       System.out.print("masukkan alamat yang lama : ");
       String alamat = input.next();
       System.out.print("masukkan alamat yang baru : ");
       String newalamat = input.next();
       Kendaraan.update(alamat,newalamat);
      }
  }
           
         

   


    
   
    
