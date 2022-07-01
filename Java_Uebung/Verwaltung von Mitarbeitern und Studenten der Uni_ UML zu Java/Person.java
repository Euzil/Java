public abstract class Person implements Druckbar{
    private String name;
    private String vorname;
    private String email;
    public Person(String name,String vorname) {
	this.name=name;
	this.vorname=vorname;
	this.email=email;
}
    public abstract boolean hatUrlaub();
    public abstract void setEmail(String email);
    public abstract String getName();

}