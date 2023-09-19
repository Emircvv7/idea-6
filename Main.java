
enum WeaponType {
    SWORD,
    AXE,
    BOW
}
class Weapon {
    private WeaponType weaponType;
    private String weaponName;

    public Weapon(WeaponType weaponType, String weaponName) {
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
class GameEntity {
    private String name;
    private int health;

    public GameEntity(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Меч тьмы");
        Boss boss = new Boss("Злой Босс", 1000, bossWeapon);
        System.out.println("Имя босса: " + boss.getName());
        System.out.println("Здоровье босса: " + boss.getHealth());
        System.out.println("Тип оружия босса: " + boss.getWeapon().getWeaponType());
        System.out.println("Название оружия босса: " + boss.getWeapon().getWeaponName());
    }
}




