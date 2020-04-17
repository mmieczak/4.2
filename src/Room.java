public class Room {
    private double size;
    private double curTemp;
    private Clima airConditioner;
    private double minTemp;

    Room() {
    }

    Room(double size, double curTemp, double minTemp, Clima airConditioner) {
        this(size, curTemp, minTemp);
        this.airConditioner = airConditioner;
    }

    Room(double size, double curTemp, double minTemp) {
        this.size = size;
        this.curTemp = curTemp;
        this.minTemp = minTemp;
    }

    public boolean decreaseTemperature() {
        if (curTemp >= (minTemp + 1) && airConditioner != null) {
            curTemp -= calculateCoolFactor(size, airConditioner.getPower());
            return true;
        } else
            return false;
    }

    private double calculateCoolFactor(double roomSize, double conditPower) {
        double factor = (roomSize * 100) / conditPower;
        if (factor > 0 && factor <= 1)
            return 2;
        else if (factor > 1) return 1;
        else return 0;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getCurTemp() {
        return curTemp;
    }

    public void setCurTemp(double curTemp) {
        this.curTemp = curTemp;
    }

    public Clima getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(Clima airConditioner) {
        this.airConditioner = airConditioner;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }
}
