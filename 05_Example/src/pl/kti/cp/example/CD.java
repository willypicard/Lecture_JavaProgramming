package pl.kti.cp.example;


public class CD extends AbstractProduct implements ICD {
	private int _lengthInSeconds;
	
	public CD(String author, String title, IPrice price, int lengthInSeconds) {
		super(author, title, price);
		_lengthInSeconds = lengthInSeconds;
	}

	public int getLength(){
		return _lengthInSeconds;
	}

	public String toString(){
		return "CD:\t"+super.toString();
	}
	
	public int compareTo(IProduct product) {
		if (product instanceof ICD){
			ICD cd = (ICD) product;
			int compareAuthor = cd.getAuthor().compareTo(cd.getAuthor());
			if (compareAuthor != 0){
				return compareAuthor;
			}
			int compareTitle = cd.getTitle().compareTo(getTitle());
			if (compareTitle != 0){
				return compareTitle;
			}
			int comparePrice = cd.getPrice().compareTo(getPrice());
			if (comparePrice != 0){
				return comparePrice;
			}
			return 0;
		}
		
		return 1;
	}

}
