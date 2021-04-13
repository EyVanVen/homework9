package task2_4;

import java.util.*;

class  EthernetAdapter extends Device{
    int speed;
    String mac;

    EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed  = speed;
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed && mac.equals(that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, mac) * (int) (Math.random() * 900) / (int) (5 * Math.random() * 50);
    }

    @Override
    public String toString() {
        return "Ethernet adapter" +
                "manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                ", mac='" + mac + '\'';
    }

    public void getHash(){
        System.out.println(hashCode());
    }
}
