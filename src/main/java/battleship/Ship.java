package battleship;

import java.util.List;

public class Ship {

    private String name;
    private Position position;
    private List<String> hits;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<String> getHits() {
        return hits;
    }

    public void setHits(List<String> hits) {
        this.hits = hits;
    }


    public static final class Builder {
        private Ship ship;

        private Builder() {
            ship = new Ship();
        }

        public static Builder aShip() {
            return new Builder();
        }

        public Builder name(String name) {
            ship.setName(name);
            return this;
        }

        public Builder position(String start, String end) {
            ship.setPosition(new Position(start, end));
            return this;
        }

        public Builder position(Position position) {
            ship.setPosition(position);
            return this;
        }

        public Builder hits(String... hits) {
            return hits(List.of(hits));
        }

        public Builder hits(List<String> hits) {
            ship.setHits(hits);
            return this;
        }

        public Ship build() {
            return ship;
        }
    }
}
