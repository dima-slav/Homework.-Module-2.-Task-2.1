package Task2_2;

/**
 * Created by Дима on 18.11.2016.
 */
public class Bank_example {
    public static void main(String[] args) {
        double currentBallance = 100;
        double withdrawal = 10;
        operation(currentBallance, withdrawal);

    }
    public static double operation (double cash, double decrement){
        double x = cash;
        double y = decrement;
        double comission = y +(y * 0.05);
        double result = x - comission;
        if (result > 0){
            System.out.println("Балланс на Вашем счету: "+x+" грн.");
            System.out.println("Вы собираетесь снять средства на сумму "+y+" грн.");
            System.out.println("(с учётом комиссии "+comission+" грн.)");
            System.out.println("Балланс на Вашем счету: "+result+" грн.");
            System.out.println("Спасибо за сотрудничество!");
        }else if (result < 0){
            System.out.println("На вашем счеу не достаточно средств для проведения операции. Пожалуйста, пополните счёт.");
        }
        return result;
    }
}
