package homeWork10;

public class App {
    public static void main(String[] args) {
        Cat musya = new Cat("Musya",Gender.F,10,true);
        Cat syoma = new Cat();
        Cat pronka = new Cat("Pron'ka ",Gender.F,9,false);
        Dog taiga = new Dog("Taiga",Gender.F,15,Breed.MONGREL);
        Dog shelby = new Dog();



        syoma.setName("Semyon");
        syoma.setGender(Gender.M);
        syoma.setAge(11);
        syoma.setSterilized(true);

        shelby.setName("Shelby");
        shelby.setBreed(Breed.AMERICAN_BULLY);
        shelby.setGender(Gender.F);
        shelby.setAge(3);

        musya.printInfo();
        syoma.printInfo();
        pronka.printInfo();

        taiga.printInfo();
        shelby.printInfo();


        musya.meow();
        syoma.meow();


    }
}