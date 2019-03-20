public class SegitigaTest{
	public static void main(String[] args) {

		// positive test
        Segitiga s1 = new Segitiga("5", "4"); //10
        System.out.println(s1.hitungLuas()); //10

        // negative test
        Segitiga s2 = new Segitiga("a", "4"); //pesan kesalahan
        System.out.println(s2.hitungLuas()); //pesan kesalahan

	}
}