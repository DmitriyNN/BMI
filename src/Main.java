public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 73; // вес в килограммах
        double height = 1.6; // рост в метрах
        double bmi = service.calculate(weight, height);
        System.out.println("ИМТ составляет:" + bmi);
    }
}