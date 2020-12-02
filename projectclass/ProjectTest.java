package projectclass;

public class ProjectTest {
	public static void main(String[] args) {
		Project emptyProj = new Project();
		Project nameProj = new Project("Stackers");
		Project pitchProj = new Project("Fun Project","Awesome pitch!");
		Project wholeProj = new Project("Fun Project","Awesome pitch!",45);
		
		String pitch = pitchProj.elevatorPitch();
		String whole = wholeProj.elevatorPitch();

		System.out.println(emptyProj);
		System.out.println(nameProj.getName());
		System.out.println(pitch);
		System.out.println(whole);
	}
}
