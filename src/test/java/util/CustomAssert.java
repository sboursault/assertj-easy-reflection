package util;

import org.assertj.core.api.AbstractAssert;



public class CustomAssert<TARGET> extends AbstractAssert<CustomAssert<TARGET>, TARGET> {

    public CustomAssert(TARGET actual) {
        super(actual, CustomAssert.class);
    }

    public CustomAssert<TARGET> matches(Object wanted) {
        usingRecursiveComparison()
                .ignoringExpectedNullFields()
                .isEqualTo(wanted);
        return this;
    }

    public static  <TARGET> CustomAssert<TARGET> assertThat(TARGET actual) {
        return new CustomAssert<>(actual);
    }
}