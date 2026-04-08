import java.util.Stack;

public class PilaDatos {
    private Stack<Integer> pila;

    // Constructor
    public PilaDatos() {
        pila = new Stack<>();
    }

    // Getter
    public Stack<Integer> getPila() {
        return pila;
    }

    // Setter
    public void setPila(Stack<Integer> pila) {
        this.pila = pila;
    }
}