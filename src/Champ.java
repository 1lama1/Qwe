import java.util.Scanner;
public class Champ {
    public static void main(String[] args) {
        double OrigMass, MassLine1,MassLine2,MassLine3;
 Scanner num = new Scanner(System.in);
 System.out.print("вес необходимый скинуть (кг) :");
 OrigMass = num.nextFloat();
 MassLine1 = OrigMass/0.25;
 MassLine2  = OrigMass/0.5;
 //при назначении переменной Float,выдовал ошибку и рекомендовал поменять на double
 MassLine3 = (MassLine1+MassLine2)/2;
        System.out.println("Дней нужно(скидываем по 250)" + Math.ceil(MassLine1));
        System.out.println("Дней нужно(скидываем по 500)" + Math.ceil(MassLine2));
        System.out.println("Среднее кол-во дней" + Math.ceil(MassLine3));
    }
}
