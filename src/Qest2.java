import java.util.Scanner;
public class Qest2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float box1, box2, FullMass, Mass;
        System.out.print("Вес первого бойца: ");
        box1 = num.nextFloat();
        System.out.print("Вес второго бойца: ");
        box2 = num.nextFloat();
        FullMass = box1 + box2;
        System.out.println("Общий вес бойцов :" + FullMass);
        Mass = Math.abs(box1 - box2);
        System.out.println("Разница в весе бойцов:" + Mass);
        //Ну я вычетал что прога в первую очередь должна упрощать жизнь людям поэтому чуть украсил
        //и проработал вероятность что первый спротсмен всегда меньше
    }
}