import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> num = new LinkedList<Integer>();
        num.add(10);
        num.add(15);
        num.add(29);
        num.addLast(8);
        num.addLast(9);
        num.addLast(1);
        num.add(2);

        System.out.println(num);

        for (Integer n:num){
            if(n>10){
                System.out.println("O número " + n +" é maior do que 10.");
            }else{
                System.out.println("O número "+ n  + " é não é maior do que 10.");
            }
        }
    }
}