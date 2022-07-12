public class account {
    public static void main(String[] args) {
        int Macha , Denis , Kris,Macha1,Denis1,Kris1;
        Macha = (int) (67760*0.1+67760);
        Denis = (int) (83690*0.1+83690);
        Kris = (int) (76230*0.1+76230);
        Macha1 = Macha - 67760;
        Denis1 = Denis - 83690;
        Kris1 = Kris - 76230;
        System.out.println("Маша теперь получает " + Macha + " рублей. Годовой доход вырос на "+ Macha1+ " рублей");
        System.out.println("Маша теперь получает " + Denis + " рублей. Годовой доход вырос на "+ Denis1+ " рублей");
        System.out.println("Маша теперь получает " + Kris + " рублей. Годовой доход вырос на "+ Kris1+ " рублей");
    }
}
