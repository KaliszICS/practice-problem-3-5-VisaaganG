public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String getFirstName(String name) {
		String firstName;
		name = name.trim();
		int index = name.indexOf(" ");
		firstName = name.substring(0, index);
		return firstName;
	}

	public static String getLastName(String name) {
		String lastName;
		name = name.trim();
		int index = name.lastIndexOf(" ");
		lastName = name.substring(index + 1);
		return lastName;
}

	public static boolean isValidName(String name) {
		name = name.trim();
		String firstName;

		String lastName;
		int firstindex = name.indexOf(" ");
		if (firstindex == -1) return false;

		firstName = name.substring(0, firstindex);
		int lastindex = name.lastIndexOf(" ");

		if (firstindex == -1 || firstindex != lastindex) return false;
		
		lastName = name.substring(lastindex + 1);
		return firstName.length() >= 2 && lastName.length() >= 2;
	}
}

