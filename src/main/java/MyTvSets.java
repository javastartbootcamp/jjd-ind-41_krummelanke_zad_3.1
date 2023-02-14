class MyTvSets {
    public static void main(String[] args) {
        TvSet tvset1 = new TvSet();
        tvset1.brandName = "Sony";
        tvset1.screenDiagonal = 55;
        tvset1.colour = "czarny";
        tvset1.powerConsumption = 70;
        tvset1.displayTechnology = "OLED";

        TvSet tvset2 = new TvSet();
        tvset2.brandName = "Rubin";
        tvset2.screenDiagonal = 26;
        tvset2.colour = "brązowy";
        tvset2.powerConsumption = 300;
        tvset2.displayTechnology = "kinescope";

        tvset1.tvSetInfo();
        tvset2.tvSetInfo();
    }
}