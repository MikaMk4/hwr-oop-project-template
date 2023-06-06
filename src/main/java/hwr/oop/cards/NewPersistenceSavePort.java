package hwr.oop.cards;

import java.io.IOException;
import java.util.Collection;

public interface NewPersistenceSavePort {

    void saveTopic(Topic topic, String persistenceInstanceName) throws IOException;

    void saveLernsessionInstance(Collection<BoxInterface> boxes, String persistenceInstanceName) throws IOException;
}
