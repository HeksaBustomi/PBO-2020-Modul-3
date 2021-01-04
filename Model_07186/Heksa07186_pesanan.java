package Model_07186;

import Entity_07186.Heksa07186_Kendaraan;
import java.util.ArrayList;
import java.util.Scanner;

public class Heksa07186_pesanan implements Heksa07186_layanan{
    private String jenis_Kendaraan;
    Scanner input = new Scanner(System.in);
    private ArrayList<Heksa07186_Kendaraan> Kendaraan;
     
    public Heksa07186_pesanan(){
         Kendaraan = new ArrayList<Heksa07186_Kendaraan>();
     }
    public void insert(Heksa07186_Kendaraan pesan){
        Kendaraan.add(pesan);
    }
    public ArrayList<Heksa07186_Kendaraan> getarrKendaraan(){
        return Kendaraan;
    }
   
    
    @Override
    public void ambil(String no_antrian, String nama){   
    }

  
    @Override
    public void update(String nama, String newalamat){
     for(int i=0;i<Kendaraan.size();i++){
       if(nama.equals(Kendaraan.get(i).getAlamat())){
           Kendaraan.get(i).setAlamat(newalamat);
       }  
     }  
    }
    @Override
     public void view(){
    }
}
    
    
            
