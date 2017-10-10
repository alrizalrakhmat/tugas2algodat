
package Circular;

public class Main {
    public static void main(String[] args) {
        ChainCircular z = new ChainCircular();
        System.out.println("Apakah ada data? :"+z.isEmpty());
        z.add(0, 1);
        z.add(1, 2);
        z.add(2, 3);
        z.add(3, 4);
        z.add(4, 5);
        z.add(5, 6);
        z.add(0, 8);
        z.add(0, 1);
        System.out.println("Elemen setelah diisi :"+z.toString());
        System.out.println("Element di index 3 :"+z.get(3));
        System.out.println("Index dari elemen E :"+z.indexOf(3));
        z.remove(6);
        System.out.println("Elemen setelah index 6 dihapus :"+z.toString());
        z.clear();
        System.out.println("Elemen setelah di clear :"+z.toString());
    }
}
