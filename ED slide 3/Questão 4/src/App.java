import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> nume = new LinkedList<Integer>();
        nume.add(10);
        nume.add(15);
        nume.add(29);
        nume.addLast(8);
        nume.addLast(9);
        nume.addLast(1);
        nume.add(2);

        System.out.println(nume);

        for (Integer n:nume){
            if(n>10){
                System.out.println("O número " + n +" é maior do que 10.");
            }else{
                System.out.println("O número "+ n  + " é não é maior do que 10.");
            }
        }

        int qntMaiores = 0;
        for(Integer num: nume){
            if(num > 10){
                qntMaiores++;
            }
        }
        System.out.println("Quantidades de números maior que 10 ");

         int somaMaiores = 0;
        int somaMenores = 0;
        for (Integer num : nume) {
            if (num > 10) {
                somaMaiores += num;
            } else {
                somaMenores += num;
            }
        }
        System.out.println("Somatório dos maiores que 10: " + somaMaiores);
        System.out.println("Somatório dos menores ou iguais a 10: " + somaMenores);

        int qtdPares = 0;
        for (Integer num : nume) {
            if (num % 2 == 0) {
                qtdPares++;
            }
        }
        System.out.println("Quantidade de números pares: " + qtdPares);
    }
}