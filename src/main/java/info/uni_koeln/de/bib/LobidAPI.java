package info.uni_koeln.de.bib;

public class LobidAPI {

	public String id;
	public String preferredName; 
	public String preferredNameForThePerson;
	public String publisher;
	public String[] contributorLabel;
	public int[] isbn10;  
	public String[] type;
	public String isPartof;
	public int issued;
	public int volume;
	public String otherTitleInformation;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPreferredName() {
		return preferredName;
	}
	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}
	public String getPreferredNameForThePerson() {
		return preferredNameForThePerson;
	}
	public void setPreferredNameForThePerson(String preferredNameForThePerson) {
		this.preferredNameForThePerson = preferredNameForThePerson;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String[] getContributorLabel() {
		return contributorLabel;
	}
	public void setContributorLabel(String[] contributorLabel) {
		this.contributorLabel = contributorLabel;
	}
	public int[] getIsbn10() {
		return isbn10;
	}
	public void setIsbn10(int[] isbn10) {
		this.isbn10 = isbn10;
	}
	public String[] getType() {
		return type;
	}
	public void setType(String[] type) {
		this.type = type;
	}
	public String getIsPartof() {
		return isPartof;
	}
	public void setIsPartof(String isPartof) {
		this.isPartof = isPartof;
	}
	public int getIssued() {
		return issued;
	}
	public void setIssued(int issued) {
		this.issued = issued;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getOtherTitleInformation() {
		return otherTitleInformation;
	}
	public void setOtherTitleInformation(String otherTitleInformation) {
		this.otherTitleInformation = otherTitleInformation;
	}
	
	
	


}
