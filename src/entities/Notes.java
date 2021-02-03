package entities;

public class Notes {
	public String name;
	public double note1;
	public double note2;
	public double note3;

	// verify the first note.
	public boolean firstNote() {
		return note1 >= 30;
	}

	// verify the second and third note.
	public boolean anotherNote() {
		return (note1 >= 35) & (note2 >= 35);
	}

	// verify general average
	public boolean geralAverage() {
		double average = note1 + note2 + note3;
		return average > 60;
	}
}
