import java.util.LinkedList;


public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> cliente= new LinkedList<String>();
        cliente.add("Guilherme");
        cliente.add("Marcos");
        cliente.addLast("Caliel");
        cliente.add("Isis");
        cliente.removeFirst();

        System.out.println(cliente);
    }
}