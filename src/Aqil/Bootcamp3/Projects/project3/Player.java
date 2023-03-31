package Aqil.Bootcamp3.Projects.project3;

public class Player {

    private String name;
    private int level;
    private int healthPoint;
    private int manaPoint;

    Player(String name, int level, int healthPoint, int manaPoint) {
        this.name = name;
        setLevel(level);
        setHealthPoint(healthPoint);
        setManaPoint(manaPoint);

    }


    public String getName() {
        return name;
    }

    public int getLevel() {

        return level;
    }

    public int getHealthPoint() {

        return healthPoint;
    }

    public int getManaPoint() {

        return manaPoint;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        if (level >= 0 && level <= 100) {
            this.level = level;
        } else {
            throw new IllegalStateException("Level should be between 0 to 100");
        }
    }

    public void setHealthPoint(int healthPoint) {
        if (healthPoint >= 0 && healthPoint <= 1000) {
            this.healthPoint = healthPoint;
        } else {
            throw new IllegalStateException("HealthPoint should be between 0 to 1000");
        }
    }

    public void setManaPoint(int manaPoint) {
        if (manaPoint >= 0 && manaPoint <= 1000) {
            this.manaPoint = manaPoint;
        } else {
            throw new IllegalStateException("ManaPoint should be between 0 to 1000");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", healthPoint=" + healthPoint +
                ", manaPoint=" + manaPoint +
                '}';
    }
}
