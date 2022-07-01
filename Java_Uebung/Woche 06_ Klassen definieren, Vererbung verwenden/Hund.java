public class Hund {

    private String name;

    public Hund(String name) {
        this.name = name;
    }

    public void bellen() {
        System.out.println("Wau Wau");
    }

    public String nameVomHalsbandAblesen() {
        System.out.print(name+": ");
        return name;
    }

}