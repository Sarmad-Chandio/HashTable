import java.util.ArrayList;

public class HashTable {
    private int size=7;
    private Node[] dataMap;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key = key;
            this.value= value;
        }
    }
    //constructor for HashTable
    public HashTable (){
        //intialize the array lenght only
        dataMap = new Node[size];
    }

    public Node[] getDataMap() {
        return dataMap;
    }

    //Just to see what is in print table
    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if(dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }
    }


    /*
    Generating a private has method.
    reason for creating this is that, as we have already maintained the fix lenght of an array of type Node.
    And to use that only 'index' we have to create a hash method.
     */
    private int hash(String key){
        int hash = 0;
        char [] keyChar = key.toCharArray();
        for (int i=0;i<keyChar.length;i++){
            int asciiValue = keyChar[i];
            hash = (hash+ asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    //ceate set method
    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key,value);
        if (dataMap[index]==null){
            dataMap[index] = newNode;
        }else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp != null){
            if (key.equals(temp.key)){
                return temp.value;
            }
            temp= temp.next;
        }
        return 0;
    }

    //Implement the keys method for the HashTable class that retrieves all the keys in the hash table and returns them as an ArrayList.
    public ArrayList keys (){
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i = 0; i<size; i++){
            Node temp = dataMap[i];
            if (temp!=null){
                while (temp.next!=null){
                    allKeys.add(temp.key);
                    temp=temp.next;
                }
                allKeys.add(temp.key);
            }

        }
        return allKeys;
    }


}
