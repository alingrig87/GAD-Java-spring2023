public class StaticFields {
    public static int numberOfInstances = 0;
    public int x;

    public void setNumberOfInstances() {
        numberOfInstances++;
    }

    public static int getNumberOfInstance() {
        return numberOfInstances;
    }

    public static void main(String[] args) {
        StaticFields staticFields = new StaticFields();
        staticFields.numberOfInstances++;

        StaticFields staticFields1 = new StaticFields();
        staticFields1.numberOfInstances++;

        StaticFields staticFields2 = new StaticFields();
        staticFields2.numberOfInstances++;

        StaticFields staticFields3 = new StaticFields();
        staticFields3.numberOfInstances++;

        System.out.println("Number of instances: " + StaticFields.numberOfInstances);
        System.out.println(Math.PI);
        System.out.println(Math.random());
    }
}
