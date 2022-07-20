package pr3.beispiel1;

public class RechnungsLoaderException extends Exception {

	private static final long serialVersionUID = 1L;

	public RechnungsLoaderException(Exception e) {
		System.out.println("Invoice ERROR");
		System.out.println(e.getMessage());
	}
}
