package de.fhro.inf.prg3.a03.States;

import de.fhro.inf.prg3.a03.Animal;
import de.fhro.inf.prg3.a03.State;

public class PlayfulState extends State {

    PlayfulState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        logger.info("Yoan... getting tired!");
        return new SleepingState(animal, animal.getSleeping());
    }
}
