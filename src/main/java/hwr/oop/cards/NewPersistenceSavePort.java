package hwr.oop.cards;

import java.util.Collection;

public interface NewPersistenceSavePort {
    void saveTopic(Topic topic, String persistenceInstanceName);

    void saveLernsession(Collection<NewBox> boxen, String persistenceInstanceName);
}
