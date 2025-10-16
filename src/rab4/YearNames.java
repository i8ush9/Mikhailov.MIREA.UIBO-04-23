package rab4;

public enum YearNames {
    SUMMER(30.0),
    WINTER(0.0),
    AUTUMN(10.0),
    SPRING(20.0);
    private final double avgTemp;

    private YearNames(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public double getYearNames() {
        return this.avgTemp;
    }

    public String getDescription(){
        if  (this  == SUMMER) {
            return ("Теплое время года");
        }
        else{
            return ("Холодное время года");
        }
    }

}
