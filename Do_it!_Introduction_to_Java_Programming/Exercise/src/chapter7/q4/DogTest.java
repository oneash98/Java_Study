package chapter7.q4;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogList = new Dog[5];

        dogList[0] = new Dog();
        dogList[1] = new Dog();
        dogList[2] = new Dog();
        dogList[3] = new Dog();
        dogList[4] = new Dog();

        for(Dog dog: dogList) {
            dog.showDogInfo();
        }
    }

}
