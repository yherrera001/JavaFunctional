package optionals;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /*Supplier<IllegalStateException> exception = () //takes no arguments, but it supplies a new argument
                -> new IllegalStateException("exception");

        Object value = Optional.ofNullable("hello")
                .orElseThrow(() -> new IllegalStateException("exception"));
        System.out.println(value);*/

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("sending email to " + email),
                        () -> System.out.println("cannot send email"));
    }
}
