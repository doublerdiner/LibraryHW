import java.util.ArrayList;

public class Library {
    private ArrayList<Book> inventory;

    public Library(){
        this.inventory = new ArrayList<>();
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
}
