import java.util.List;
import java.util.Optional;

public class BoxDao implements Dao<Box>{

    @Override
    public Optional<Box> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Box> getAll() {
        return null;
    }

    @Override
    public void save(Box box) {
    }

    @Override
    public void update(Box box, String[] params) {
    }

    @Override
    public void delete(Box box) {
    }
}