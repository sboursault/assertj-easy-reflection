package battleship;

public class Position {
    private String start;
    private String end;

    public Position() {
    }

    public Position(String start, String to) {
        this.start = start;
        this.end = to;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }


    public static final class Builder {
        private Position position;

        private Builder() {
            position = new Position();
        }

        public static Builder aPosition() {
            return new Builder();
        }

        public Builder start(String start) {
            position.setStart(start);
            return this;
        }

        public Builder end(String to) {
            position.setEnd(to);
            return this;
        }

        public Position build() {
            return position;
        }
    }
}
