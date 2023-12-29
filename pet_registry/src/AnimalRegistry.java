import java.util.*;

public class AnimalRegistry {
    private Map<String, Animal> animals;

    public AnimalRegistry() {
        this.animals = new HashMap<>();
    }

    public void addAnimal(String type, String nickname) throws IllegalAccessException {
        Animal animal;
        switch (type.toLowerCase()) {
            case "cat":
                animal = new Cat(nickname);
                break;
            case "dog":
                animal = new Dog(nickname);
                break;
            case "hamster":
                animal = new Hamsters(nickname);
                break;
            case "horse":
                animal = new Horse(nickname);
                break;
            case "camel":
                animal = new Camel(nickname);
                break;
            case "donkey":
                animal = new Donkey(nickname);
                break;
            default:
                throw new IllegalAccessException("Неизвестный тип животного");
        }
        animals.put(nickname, animal);
        System.out.println("Животное: " + type + " " + nickname + " добавлено в реестр");
    }

    public void showAnimalCommands(String nickname) {
        Animal animal = animals.get(nickname);
        if (animal != null) {
            animal.showCommands();
        } else {
            System.out.println("Животное " + nickname + " не найдено");
        }
    }

    public void addAnimalCommands(String nickname, String command) {
        Animal animal = animals.get(nickname);
        if (animal != null) {
            animal.addCommand(command);
        } else {
            System.out.println("Животное " + nickname + " не найдено");
        }
    }
}
