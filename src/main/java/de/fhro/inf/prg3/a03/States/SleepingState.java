package de.fhro.inf.prg3.a03.States;

import de.fhro.inf.prg3.a03.Animal;
import de.fhro.inf.prg3.a03.State;

public class SleepingState extends State {

    public SleepingState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        logger.info("Yoan... getting hungry!");
        return new HungryState(animal, animal.getAwake());
    }
}

