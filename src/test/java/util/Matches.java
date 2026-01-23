
package util;

import java.io.Serializable;

import org.mockito.ArgumentMatcher;

import static util.Assertions.assertThat;

public class Matches<T> implements ArgumentMatcher<T>, Serializable {

    private final Object wanted;

    public Matches(Object wanted) {
        this.wanted = wanted;
    }

    @Override
    public boolean matches(Object actual) {
        assertThat(actual).matches(wanted);
        return true;
    }

    @Override
    public String toString() {
        return "refEq(" + wanted + ")";
    }

    // move to another class that offers matches exactly
    public static <T> Matches<T> mmatches(Object wanted) {
        return new Matches<>(wanted);
    }
}
