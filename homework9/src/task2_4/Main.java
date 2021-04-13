package task2_4;

public class Main {
    public static void main(String[] args) {

        Device d1 = new Device("Lg", 9005, "23012DENAD");
        Device d2 = new Device("Lg", 9005, "23012DENAD");
        Monitor m1 = new Monitor("Hieroglyph", 900, "938974yde", 90, 100);
        Monitor m2 = new Monitor("Fry", 2900, "23012DENAD", 1080, 720);
        EthernetAdapter e1 = new EthernetAdapter("Bla Bla Whiskas :)", 69, "666SanTEchNiK", 42, "19.02.1000");

        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(e1.toString());

        System.out.println("===============================");

        d1.getHash();
        d2.getHash();
        m1.getHash();
        m2.getHash();
        e1.getHash();

        System.out.println("===============================");

        System.out.println(d1.equals(d2));
        System.out.println(m1.equals(m2));
        System.out.println(e1.equals(m2));

    }
}
