public class IMT {
    private double h;
    private double m;
    private double IMT;
    IMT(double h,double m){
        this.h=h;
        this.m=m;
        IMT=calc_IMT();
    }
    public double calc_IMT(){
        return (double)m/((h/100)*(h/100));

    }

    public double getH() {
        return h/100;
    }

    public double getM() {
        return m;
    }

    public double getIMT() {
        return IMT;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setIMT(double IMT) {
        this.IMT = IMT;
    }

    public void setM(int m) {
        this.m = m;
    }
}
