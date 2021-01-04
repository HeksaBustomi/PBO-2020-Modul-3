package Controller_07186;
import java.util.ArrayList;
import Entity_07186.Heksa07186_Kendaraan;
import Model_07186.Heksa07186_pesanan;

public class Heksa07186_AdminController {
 
    public void insertDataCuci(Heksa07186_Kendaraan pesan){
       Heksa07186_AllObject.pesan.insert(pesan);
    }
    public void ambil (String no_antrian,String nama){
       Heksa07186_AllObject.pesan.ambil(no_antrian,nama); 
    }
    public void update (String nama,String newalamat){
        Heksa07186_AllObject.pesan.update(nama, newalamat);
    }
    public void view(){
        Heksa07186_AllObject.pesan.view();
    }
    
    public ArrayList<Heksa07186_Kendaraan> getKendaraan(){
       return Heksa07186_AllObject.pesan.getarrKendaraan();
    }
}
    
 
     


