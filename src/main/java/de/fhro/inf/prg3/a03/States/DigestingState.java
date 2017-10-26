package de.fhro.inf.prg3.a03.States;

import de.fhro.inf.prg3.a03.Animal;
import de.fhro.inf.prg3.a03.State;

public class DigestingState extends State{
    private final int remainingWakeTime;

    DigestingState(Animal animal, int duration, int remainingWakeTime) {
        super(animal, duration);
        this.remainingWakeTime = remainingWakeTime;
    }

    @Override
    public State successor() {
        logger.info("Getting in a playful mood!");
        return new PlayfulState(animal, remainingWakeTime - animal.getDigest());
    }
}
