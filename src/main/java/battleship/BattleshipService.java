package battleship;

import static battleship.Ship.Builder.aShip;

public class BattleshipService {

    private final Publisher publisher;


    public BattleshipService(Publisher publisher) {
        this.publisher = publisher;
    }

    public void hit(String targetPoint) {

        // let's say a ship is hit

        publisher.publish(
                aShip().name("Battleship")
                        .position("A6", "...")
                        .hits("D8")
                        .build()
        );

    }
}
