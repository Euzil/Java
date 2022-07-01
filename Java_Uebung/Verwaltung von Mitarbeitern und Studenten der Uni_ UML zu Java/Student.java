public class Student extends Person implements Druckbar{
	private String name;
    private String vorname;
    private String email;
    private static int naechsteMatrNr;
    private int matrNr;
    private int semester;
	public Student(String name, String vorname,int semester) {
		super(name, vorname);
		this.name=name;
		this.vorname=vorname;
		this.semester=semester;
		
	}
	public int getNaechsteMatrNr() {
		naechsteMatrNr=matrNr+1;
		matrNr=naechsteMatrNr;
		return naechsteMatrNr;
	}
	public int getSemester() {
	  int semester=this.semester;
		return semester;
	}
	public  void setSemester(int semester) {
		this.semester=semester;
	}
	@Override
	public boolean hatUrlaub() {
		if(semester>6) {
			return true;
		}else {
		return false;
		}
		}
	@Override
	public void setEmail(String email) {
		this.email=email;
	}
	@Override
	public String getName() {
		String Name=vorname+" "+name;
		return Name;
	}
	@Override
	public void drucken() {
	    
		System.out.println(getName()+", E-mail: "+email+", Matrikelnummer: "+matrNr+", Semester: "+getSemester());
		
	}
	
	
	

}