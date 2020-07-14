import java.util.ArrayList;

interface StudentDao {

    public ArrayList<?> getInstance();

    public ArrayList<? extends Person> getinstance();
}
