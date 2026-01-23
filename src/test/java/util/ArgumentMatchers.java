package util;

import org.mockito.ArgumentMatcher;

import java.io.Serializable;

import static org.mockito.internal.progress.ThreadSafeMockingProgress.mockingProgress;
import static util.Assertions.assertThat;

public class ArgumentMatchers {

    static class Matches<T> implements ArgumentMatcher<T>, Serializable {
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
            return "matches(" + wanted + ")";
        }
    }

    static class MatchesExactly<T> implements ArgumentMatcher<T>, Serializable {
        private final Object wanted;

        public MatchesExactly(Object wanted) {
            this.wanted = wanted;
        }

        @Override
        public boolean matches(Object actual) {
            assertThat(actual).matchesExactly(wanted);
            return true;
        }

        @Override
        public String toString() {
            return "matchesExactly(" + wanted + ")";
        }
    }

    public static <T> T argThatMatches(T wanted) {
        mockingProgress().getArgumentMatcherStorage().reportMatcher(new Matches<>(wanted));
        return null;
    }

    public static <T> T argThatMatchesExactly(T wanted) {
        mockingProgress().getArgumentMatcherStorage().reportMatcher(new MatchesExactly<>(wanted));
        return null;
    }
}
