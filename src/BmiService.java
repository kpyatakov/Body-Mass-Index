public class BmiService {
    public double calculate(double height) {
        double result;
        double exponent = 2; //возведение в степень
        if (height > 0) {
            result = Math.pow(height, exponent);
        } else {
            result = 0;
        }
        return result;
    }
}
