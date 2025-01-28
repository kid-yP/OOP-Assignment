public class Journal {
    private String authorName;
    private String title;
    private String dob;

    public Journal(String authorName, String title, String dob) {
        this.authorName = authorName;
        this.title = title;
        this.dob = dob;
    }
    public void displayDetails(){
        System.out.println("Author: " + authorName);
        System.out.println("Title: " + title);
        System.out.println("Date: " + dob);
    }
    public String getSubmissionsDetails(){
        String[] words = title.split(" ");
        StringBuilder capitalizedTitle = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalizedTitle.append(Character.toUpperCase(word.charAt(0)));
                capitalizedTitle.append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return capitalizedTitle.toString().trim();
    }
    public static void main(String[] args) {
        Journal journalEntry = new Journal("Kidus", "The infamous trader", "2024-11-18");
        journalEntry.displayDetails();

        String capitalizedTitle = journalEntry.getSubmissionsDetails();
        System.out.println("Capitalized Title: " + capitalizedTitle);
    }
}
