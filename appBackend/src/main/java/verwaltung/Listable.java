package verwaltung;

public interface Listable<Item> {
    void add(Item item);
    void delete(Item item);
    void printAll();
    void clear();
    void edit(Item item);
    void sort();
}
