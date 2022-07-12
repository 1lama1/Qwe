import java.util.Scanner;
public class diet {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int bananaTime, Milk,iceCream,Egg,FullMass;
        float FullMass1;
        System.out.print("Сколько бананов ты съел(шт) : ");
        bananaTime = num.nextInt();
        System.out.print("Сколько молока ты выпил(100мл): ");
        Milk = num.nextInt();
        System.out.print("Сколько морожки ты съел(шт): ");
        iceCream = num.nextInt();
        System.out.print("Сколько яиц ты выпил(шт): ");
        Egg = num.nextInt();
        FullMass = (bananaTime*80)+(Milk*105)+(iceCream*100)+(Egg*70);
         FullMass1 = FullMass/1000f;
         System.out.println("Общий вес завтрака в кг: "+ FullMass1);
    }
}
