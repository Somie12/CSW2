package GarbageCollections;

public class Q1 {
    private String name;

    public UnreachableObject(String name) {
        this.name = name;
    }

    public void show() {
        new UnreachableObject("UnreachableObject 1");
        display();
    }

    public void display() {
        new UnreachableObject("UnreachableObject 2");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " has been garbage collected.");
    }

    public static void main(String[] args) {
        UnreachableObject obj = new UnreachableObject("Main Object");
        obj.show();

        // Explicitly invoke the garbage collector
        System.gc();
    }
}