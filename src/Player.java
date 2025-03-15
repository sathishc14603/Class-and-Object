public class Player {
    private String name;
    private String position;
    private int JerseyNumber;
    public Player(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return JerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        JerseyNumber = jerseyNumber;
    }

    public Player(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        JerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", JerseyNumber=" + JerseyNumber +
                '}';
    }
}
