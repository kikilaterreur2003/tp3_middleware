package tp3midlleware.example._0.controller.AirportModel;

public class ICAO {

    private String icao;

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    @Override
    public String toString() {
        return  "icao=" + icao + "\n";
    }
}
