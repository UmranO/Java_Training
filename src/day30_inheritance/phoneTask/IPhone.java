package day30_inheritance.phoneTask;

public class IPhone extends Phone {                                                // Iphone Is A Phone

    public static boolean hasApplePay = true;
    /*
    Tum iphone'larin brand'i Apple oldugu icin bunu user'a sormaya gerek yok.
    oldugu icin sper'in constructor'ini cagirdigimizda kendimiz direkt verebiliriz. Cunku IPhone'un constructor'inda
    istedigimiz parametre'lere user'in verdigi argumentler gelecek. O argument'ler super call edildiginde ona pass ediyor
    oradan da instance'lara set ediliyor. Dolayisisyla brand'in user'dan mi bizden mi geldigi onemli degil. Bu variable'i
    static yapmamamizin sebebi ise tum Phone'lar icin tek bir brand istemimiyoruz sadece IPhone'lar icin tek bir brand
    istiyoruz. O yuzden A secenegi yerine alttaki brand'siz olani tercih ediyoruz.

    A:
    public Iphone(String brand, String model, String size, String color, double price) {
  */
    public IPhone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public  void faceTime(long phoneNumber){
        System.out.println( getModel() +" is face timing with " +phoneNumber );
    }

    public void faceTime(String email){
        System.out.println( getModel() +" is face timing with " + email );
    }
}

/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
 */
