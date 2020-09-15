enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    DangerLevel(int number) {
        this.number = number;
    }

    private final int number;

    public int getLevel() {
        return number;
    }
}