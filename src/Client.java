public class Client extends Recomendation {
    private String name;
    private String your_profile;
    private String recomendation;
    Client(double h, double m, String name){
        super(h,m);
        this.name=name;
        your_profile=your_group();
        recomendation=calc_to_norm();
    }

    public String getName() {
        return name;
    }

    public String getRecomendation() {
        return recomendation;
    }

    public String getYour_profile() {
        return your_profile;
    }
}
