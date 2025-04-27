
public class Main {
    public static void main(String[] args) {

        HashTable hashTable = new HashTable();

        hashTable.set("nails",100);
        hashTable.set("tile",50);
        hashTable.set("lumber",50);

        hashTable.set("bolts",200);
        hashTable.set("screws",140);

        hashTable.printTable();

        System.out.println(hashTable.get("nails"));
        System.out.println(hashTable.keys());
        System.out.println("*********************");

    }



}