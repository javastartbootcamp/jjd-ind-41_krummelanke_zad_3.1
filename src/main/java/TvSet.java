class TvSet {
    String brandName;
    int screenDiagonal;
    String colour;
    int powerConsumption;
    String displayTechnology;

    TvSet(String name, int diagonal, String col, int pow, String tech) {
        brandName = name;
        screenDiagonal = diagonal;
        colour = col;
        powerConsumption = pow;
        displayTechnology = tech;
    }

    void tvSetInfo() {
        System.out.println("Telewizor marki: " + brandName + ", przekątna ekranu: " + screenDiagonal + " cali, kolor obudowy: " + colour
                + ", pobór mocy: " + powerConsumption + " watów, technologia wyświetlania: " + displayTechnology);
    }
}