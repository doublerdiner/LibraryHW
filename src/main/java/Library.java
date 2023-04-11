import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> inventory;
    private HashMap<String, Integer> hashMapInventory;

    public Library(){
        this.inventory = new ArrayList<>();
        this.hashMapInventory = new HashMap<>();
    }

    public int numOfBooksInInventory(){
        return this.inventory.size();
    }

    public void addBookToInventory(Book book) {
        this.inventory.add(book);
    }

    public boolean searchInventory(String title) {
        for(Book book : this.inventory){
            if(book.getTitle().equals(title)){
                return true;
            }
        } return false;
    }

    public Object getInventoryByGenre() {
        for (Book book : this.inventory){
            if(this.hashMapInventory.containsKey(book.getGenre())){
                int total = this.hashMapInventory.get(book.getGenre()) + 1;
                this.hashMapInventory.put(book.getGenre(), total);
            }
            else{
                this.hashMapInventory.put(book.getGenre(), 1);
            }
        }
        return this.hashMapInventory;
    }
}
