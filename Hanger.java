public class Hanger {
    public static void main(String[] args){
        Car Peugeot = new Car("Peugeot", 68550);
        Car Renault = new Car("Renault", 150);
        Car Citroen = new Car("Citroen", 210000);
        Boat Bateau1 = new Boat("Marque1", 10500);
        Boat Bateau2 = new Boat("Marque2", 1150);
        Boat Bateau3 = new Boat("Marque3", 4300);
        
        System.out.println(Peugeot.doStuff());
        System.out.println(Renault.doStuff());
        System.out.println(Citroen.doStuff());
        System.out.println(Bateau1.doStuff());
        System.out.println(Bateau2.doStuff());
        System.out.println(Bateau3.doStuff());
    }
}
