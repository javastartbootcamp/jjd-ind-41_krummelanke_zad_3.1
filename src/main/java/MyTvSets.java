class MyTvSets {
    public static void main(String[] args) {
        TvSet tvset1 = new TvSet("Sony", 55, "czarny", 70, "OLED");
        TvSet tvset2 = new TvSet("Rubin", 26, "brązowy", 300, "kinescope");

        tvset1.tvSetInfo();
        tvset2.tvSetInfo();
    }
}