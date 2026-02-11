package battleship;

import org.junit.jupiter.api.Test;

import java.util.List;

import static battleship.Ship.Builder.aShip;
import static util.Assertions.assertThat;

class ShipTest {

    @Test
    void matchesExactly() {
        Ship result = aShip()
                .name("Battleship")
                .position("A6", "...")
                .hits("1", "2")
                .build();

        assertThat(result).matchesExactly(
                aShip()
                        .name("Battleship")
                        .position("A6", "...")
                        //.hits("1", "2")
                        .build()
        );
    }

    @Test
    void matches() {
        Ship result = aShip()
                .name("Battleship")
                .position("A6", "D6")
                .hits("1", "2")
                .build();

        assertThat(result).matches(
                aShip()
                        .name("Battleship")
                        .position("A6", "E6")
                        .build()
        );
    }

    @Test
    void arrayMatches() {
        assertThat(
                List.of(aShip()
                                .name("1")
                                .build(),
                        aShip()
                                .name("2")
                                .build())
        ).matches(
                List.of(aShip()
                                .name("1")
                                .build()
                        )
        );
    }

}
