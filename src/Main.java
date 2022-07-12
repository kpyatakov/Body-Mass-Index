public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 92; //значение в килограммах
        double index = weight / service.calculate(1.86); //рост в метра, например 1.67
        System.out.println("Индекс массы тела равен " + index);

    }

}

