package com.tactfactory.poei.inherit;

import java.util.List;

public class AnimalSelf {
    public static void main(String[] args) {

    }

    public void launchTime(List<Eatable> diner, List<Animal> animals) {
        for (Animal animal : animals) {
            boolean hasNoEat = true;
            int i = 0;

            while (hasNoEat && diner.size() < i) {
                Eatable food = diner.get(i);

                if (animal.canEat(food)) {
                    animal.eat(food);
                    hasNoEat = false;
                } else {
                    ++i;
                }
            }

            if (hasNoEat) {
                System.out.println(animal + " n'a rien mangé");
            } else {
                diner.remove(i);
            }
        }
    }
}

interface Eatable {
}

interface Diet {
    boolean canEat(Eatable food);
}

class Grass implements Eatable {}

abstract class Animal implements Eatable, Diet {
    public void eat(Eatable food) {
        System.out.println("J'ai plus faim, merci !");
    }
}

class Herbivorous extends Animal {

    @Override
    public boolean canEat(Eatable food) {
        return food instanceof Grass;
    }

}

class Carnivorous extends Animal {

    @Override
    public boolean canEat(Eatable food) {
        return food instanceof Animal;
    }

}
