public class Recomendation extends IMT {
    Recomendation(double h, double m){
        super(h,m);
    }
    public String your_group(){
        if(getIMT()<=16){
            return "Выраженный дефицит массы тела";
        }
        else if (getIMT() >16&&getIMT()<18.5) return "Недостаточная масса тела";
        else if (getIMT() >=18.5&&getIMT()<25) return "Норма";
        else if (getIMT() >=25&&getIMT()<30) return "Предожирение";
        else if (getIMT() >=30&&getIMT()<35) return "Ожирение";
        else if (getIMT() >=25&&getIMT()<40) return "Ожирение резкое";
        return "Очень резкое ожирение";
    }
    public String calc_to_norm(){
        if(getIMT()<18.5){
            return "Вам необходимо необходимо набрать "+((18.5-getIMT())*getH()*getH())+" кг до нормы";
        }
        else if(getIMT()>25) return "Вам необходимо необходимо сбросить "+((getIMT()-25)*getH()*getH())+" кг до нормы";
        return "Норма";
    }
}
