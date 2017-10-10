
package Double;

public class Main {
    public static void main(String[] args) {
        ChainDouble d = new ChainDouble();
        System.out.println("Apakah ada data? :"+d.isEmpty());
        d.add(0, 3);
        d.add(1, 4);
        d.add(2, 5);
        d.add(3, 6);
        d.add(0, 7);
        d.add(4, 8);
        d.add(5, 9);
        System.out.println("Elemen setelah d isi :"+d.toString());
        System.out.println("Element di index 0 :"+d.get(0));
        System.out.println("Index dari elemen E :"+d.indexOf(3));
        d.remove(4);
        System.out.println("Elemen setelah index 4 d hapus :"+d.toString());
        d.clear();
        System.out.println("Esi elemen setelah di clear :"+d.toString());
    }
}
