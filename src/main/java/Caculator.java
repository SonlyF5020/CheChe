
public class Caculator {
    public double caculate(double distance) {
        if (distance<2){
            return 6;
        }
        else if (distance<8){
            return 6+(distance-2)*0.6;
        }
        else {
            return 9.6+(distance-8)*1.2;
        }
    }

    public Double caculate(double distance, double time) {
        return caculate(distance)+time*1.0;
    }

    public void foo(int... x){

    }

}
