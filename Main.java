public class Main {

    /*

    OOP -> Object Oriented Programing  -> Obje Odaklı Programlama
     */

    public static void main ( String [] args) {

        Araba araba1 = new Araba();
        Araba2 araba2 = new Araba2();

        araba1.renk= "Kırmızı";
        araba1.kapilar=4;
        araba1.tekerlekler= 4;
        araba1.motor = "16V";
        araba1.model="Renault";


        System.out.println(araba1.motor);

        araba2.setModel("Renault");
        System.out.println("Arabanın Modeli: " + araba2.getModel());

        araba2.setKapilar(4);
        System.out.println(araba2.getKapilar());



    }
}
