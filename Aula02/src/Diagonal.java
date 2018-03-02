
public interface Diagonal {
	
	double diagonal();
	
	default double diagonal(double diagonal) {
		return diagonal;
	}
	
}
