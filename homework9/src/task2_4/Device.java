package task2_4;

import java.util.Objects;

public class Device {
    public String manufacturer, serialNumber;
    public float price;

    Device(String manufacturer, float price, String serialNumber){
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 && Objects.equals(manufacturer, device.manufacturer) && Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, serialNumber, price) * (int) (Math.random() * 900) / (int) (5 * Math.random() * 50);
    }

    @Override
    public String toString() {
        return "Device" +
                "manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", price=" + price;
    }

    public void getHash(){
        System.out.println(hashCode());
    }
}
