package util;

import org.assertj.core.api.AbstractObjectAssert;

public class Assertions {

    public static class CustomAssert<TARGET> extends AbstractObjectAssert<CustomAssert<TARGET>, TARGET> {

        public CustomAssert(TARGET actual) {
            super(actual, CustomAssert.class);
        }

        public CustomAssert<TARGET> matchesExactly(Object wanted) {
            usingRecursiveComparison()
                    .isEqualTo(wanted);
            return this;
        }

        public CustomAssert<TARGET> matches(Object wanted) {
            usingRecursiveComparison()
                    .ignoringExpectedNullFields()
                    .isEqualTo(wanted);
            return this;
        }
    }

    public static <TARGET> CustomAssert<TARGET> assertThat(TARGET actual) {
        return new CustomAssert<>(actual);
    }

    // voir aussi pour les tableaux d'objet
}
