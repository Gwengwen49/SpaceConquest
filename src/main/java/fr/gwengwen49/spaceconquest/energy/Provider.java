package fr.gwengwen49.spaceconquest.energy;

public interface Provider {

    int provide();

        int getMinProductionRate();

    int getMaxProductionRate();

    boolean canProvide();
}
