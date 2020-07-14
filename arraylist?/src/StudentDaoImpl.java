import java.util.ArrayList;

public class StudentDaoImpl implements StudentDao {
    @Override
    public ArrayList<?> getInstance() {
        ArrayList<?> list = new ArrayList<>();
        list.add("a");
        return list;
    }

    @Override
    public ArrayList<? extends Person> getinstance() {
        return null;
    }
}
