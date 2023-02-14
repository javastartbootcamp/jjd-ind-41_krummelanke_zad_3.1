class TvSet {
    String brandName;
    int screenDiagonal;
    String colour;
    int powerConsumption;
    String displayTechnology;

    TvSet() {

    }

    void tvSetInfo() {
        System.out.println("Telewizor marki: " + brandName + ", przekątna ekranu: " + screenDiagonal + " cali, kolor obudowy: " + colour
                + ", pobór mocy: " + powerConsumption + " watów, technologia wyświetlania: " + displayTechnology);
    }
}