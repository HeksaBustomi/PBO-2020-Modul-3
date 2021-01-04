package Entity_07186;

public abstract class Heksa07186_DataCustomer {
    
    protected String Nama,Alamat,No_Antrian;
   public Heksa07186_DataCustomer (String nama, String alamat, String no_antrian){
           this.Nama=nama;
           this.Alamat=alamat;
           this.No_Antrian=no_antrian;
   }
   
    public void setNo_Antrian(String no_antrian) {
        this.No_Antrian = no_antrian;
    }
    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }

    public String getNama() {
        return  Nama;
    }

    public String getAlamat() {
        return Alamat;
    }
    public String getNo_Antrian() {
        return  No_Antrian;
   }
}
