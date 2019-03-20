public class Segitiga{

	private double alas;
    private double tinggi;
    
    public Segitiga(String alas, String tinggi) {
        try{
            this.alas = Double.parseDouble(alas);
            this.tinggi = Double.parseDouble(tinggi); 
        }catch(NumberFormatException nfe){
            System.out.println("Kesalahan "+nfe.getMessage().toString());
        } 
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi; 
    }

}
