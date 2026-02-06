package battleship;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static battleship.Ship.Builder.aShip;
import static org.mockito.Mockito.verify;
import static util.ArgumentMatchers.argThatMatches;
import static util.ArgumentMatchers.argThatMatchesExactly;

class BattleshipServiceTest {


    Publisher mockPublisher = Mockito.mock(Publisher.class);

    BattleshipService service = new BattleshipService(mockPublisher);

    @Test
    void hit() {

        service.hit("B7");

/*        verify(mockPublisher).publish(argThat(mmatches(
                aShip()
                        .name("hello")
                        .build())
        ));*/

        verify(mockPublisher).publish(argThatMatches(
                aShip()
                        .name("Battleship")
                        .build())
        );

        verify(mockPublisher).publish(argThatMatchesExactly(
                aShip()
                        .name("Battleship")
                        .build())
        );

    }
}