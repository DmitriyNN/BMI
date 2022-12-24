public class BmiService {
    public double calculate(double weight, double height) {
        double bmi; // ИМТ
        bmi = weight / (height * height);
        return bmi;
    }
}