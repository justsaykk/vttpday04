# Interfaces

```java
// Lets say there is a method in a few classes that looks like this:

// Class A
print(Cart cart) {
    String[] items = cart.getItems();
    for (String i : items) {
        //... code...//
    };
}

// Class B
print(Cart cart) {
    String[] purchaseOrders = purchaseRequest.getItems();
    for (String i : purchaseOrders) {
        //... code...//
    };
}
```

In this two totally unrelated classes, there happens to be a print function.
1 way to get around it is for the classes to inherit from a parent class that has a "print" method. But there are drawbacks:

- 1 child can only inherit from 1 class. So, we want to make sure that all the childs have a strong relation to the parent.

So, we should create an interface:

```java

public interface Printable {
    public String[] toPrint(); // Note that methods in interfaces do not have implementables.
}
```

In order to use the interface, the class needs to "implement" the interface. And it would look like this:

```java

public class Cart implements Printable {
    // Members
    public static void main(String[] args) throws <Exception> {
        // ...code... //

        public String[] toPrint() {
            // ... code ... //
        }
    }
}
```

So, in the Printer class, we need to state that the print method is implementedby Printable

```java
public class Printer {
    public void print(Printable printable) {
        String[] items = printable.toPrint();
        for (String i : items) {
            // ... code ... //
        }
     }
}
```

And finally, in Cart

```java
public class Cart implements Printable {
    // Members
    public static void main(String[] args) throws <Exception> {
        // ...code... //

        public String[] toPrint() {
            // ... code ... //

            order.print(o)
        }
    }
}
```
