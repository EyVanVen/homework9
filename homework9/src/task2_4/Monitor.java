package task2_4;

import java.util.Objects;

public class Monitor extends Device{
    int resolutionX, resolutionY;

    Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolutionX, resolutionY) * (int) (Math.random() * 900) / (int) (5 * Math.random() * 50);
    }

    @Override
    public String toString() {
        return "Monitor" +
                "manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                ", resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY;
    }

    public void getHash(){
        System.out.println(hashCode());
    }
}
