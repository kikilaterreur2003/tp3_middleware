package tp3midlleware.example._0.controller.AirportModel;

public class Temperature {

    private String temp;

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
    @Override
    public String toString() {
        return  "temp=" + temp + "\n";
    }
}
