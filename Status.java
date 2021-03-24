/**
 * Status enum offers all possible status options.
 * @author Willis
 * Updated 3/23/2021
 */
public enum Status {

	COMPLETE, 
	INPROGRESS,
	OPEN;
	
	public String toString(Status status) {
		String p = "";
		switch (status) {
			case COMPLETE:
				p = "Complete";
				break;
			case INPROGRESS:
				p = "In Progress";
				break;
			case OPEN:
				p = "Open";
				break;
			default:
				p = "N/A";
				break;
		}
		return p;
	}
	
}
