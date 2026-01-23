package battleship;

public class Position {
    private String from;
    private String to;

    public Position() {
    }

    public Position(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }


    public static final class Builder {
        private Position position;

        private Builder() {
            position = new Position();
        }

        public static Builder aPosition() {
            return new Builder();
        }

        public Builder from(String from) {
            position.setFrom(from);
            return this;
        }

        public Builder to(String to) {
            position.setTo(to);
            return this;
        }

        public Position build() {
            return position;
        }
    }
}
