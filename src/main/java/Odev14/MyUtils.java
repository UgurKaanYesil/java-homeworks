package Odev14;

import java.util.Collection;
import java.util.Optional;

public class MyUtils {
    public static class MyClass<T> {
        private T field;

        public MyClass(T field) {
            this.field = field;
        }

        public void printField() {
            System.out.println(field);
        }
    }

    public static <T> T findItemInCollection(Collection<T> collection, T item) {
        Optional<T> optionalItem = collection.stream()
                .filter(i -> i.equals(item))
                .findFirst();
        return optionalItem.orElse(null);
    }
}
