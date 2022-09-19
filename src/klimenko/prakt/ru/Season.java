package klimenko.prakt.ru;

public enum Season {
    SUMMER(25){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    }, WINTER(-5), AUTUMN(7), SPRING(12);

    private double avTemp;

    Season(double avTemp) {
        this.avTemp = avTemp;
    }

    public double getAvTemp() {
        return avTemp;
    }
    public String getDescription(){
        return "Холодное время года";
    }
}
