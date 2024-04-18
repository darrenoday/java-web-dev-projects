import java.util.UUID;

public abstract class AbstractEntity {
    private final String id;

    public AbstractEntity() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }
}