public class Runner {
    public static void main(String[] args) {
        Material steel = new Material();
        Material copper = new Material("Copper",8500.0);
        Subject wire = new Subject("Wire",steel,0.03);
        wire.setMaterial(copper);
        System.out.println(wire);
        System.out.println(wire.getMass());
    }
}
