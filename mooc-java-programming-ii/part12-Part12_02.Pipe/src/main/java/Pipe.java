import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {

    private List<T> pipeList;

    private Pipe() {
        this.pipeList = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.pipeList.add(value);
    }

    public T takeFromPipe() {
        T longestInPipe = this.pipeList.get(0);
        this.pipeList.remove(0);
        return longestInPipe;
    }

    public boolean isInPipe() {
        return this.pipeList.isEmpty();
    }

}
