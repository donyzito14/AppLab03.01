package uni.sistemas.model;

import java.text.DecimalFormat;

public class SobrecargaModel {

    public SobrecargaModel() {
    }

    public String cFormato(int x) {
        DecimalFormat d = new DecimalFormat("###,###");
        return String.valueOf(d.format(x));
    }

    public String cFormato(long x) {
        DecimalFormat d = new DecimalFormat("###,###.##");
        return String.valueOf(d.format(x));
    }
    public String cFormato(double x) {
        String f;
        f = String.valueOf(x);
        if (f.length() <= 10) {
            DecimalFormat d = new DecimalFormat("###,###.##");
            return String.valueOf(d.format(x));
        }else{
            DecimalFormat d = new DecimalFormat("###,###.###");
            return String.valueOf(d.format(x));       
        }
    }
    public static void main(String[] args) {
        SobrecargaModel s = new SobrecargaModel();
        System.out.println(s.cFormato(345678));
        System.out.println(s.cFormato(53467.7667));
        System.out.println(s.cFormato(53467.76673));

    }

}
