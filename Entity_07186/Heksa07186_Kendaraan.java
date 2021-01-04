package Entity_07186;

public class Heksa07186_Kendaraan extends Heksa07186_DataCustomer {

    private String Merk;
    private String Plat_Nomor;
    private String Warna;
    private String Jenis_Kendaraan;
    
    
     public Heksa07186_Kendaraan(String merk, String plat_nomor, String warna, String nama, String alamat, String no_antrian, String jenis_kendaraan) {
        super(nama, alamat, no_antrian);
        this.Merk = merk;
        this.Plat_Nomor = plat_nomor;
        this.Warna = warna;
        this.Jenis_Kendaraan=jenis_kendaraan;
    }

    public void setMerk(String merk) {
        this.Merk = merk;
    }

    public void setPlat_Nomor(String plat_nomor) {
        this.Plat_Nomor = plat_nomor;
    }

    public void setWarna(String warna) {
        this.Warna = warna;
    }

    public void setJenis_Kendaraan(String jenis_kendaraan) {
        this.Jenis_Kendaraan = jenis_kendaraan;
    }
    
    public String getMerk() {
        return Merk;
    }

    public String getPlat_Nomor() {
        return Plat_Nomor;
    }

    public String getWarna() {
        return Warna;
    }

    public String getJenis() {
        
        return Jenis_Kendaraan;
    }
}   

  
