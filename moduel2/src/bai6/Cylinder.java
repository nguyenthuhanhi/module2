package bai6;

public class Cylinder extends Cricle{
    protected double chieuCao;

    public Cylinder() {
    }

    public Cylinder(float bankinh, String mausac, double chieuCao) {
        super(bankinh, mausac);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double getVolume(){
        return PI*bankinh*bankinh*chieuCao;
    }

    @Override
    public String toString() {
        return "bán kính: "+bankinh+"\t màu sắc: "+mausac +"\t Thể tích: "+getVolume();
    }

}
