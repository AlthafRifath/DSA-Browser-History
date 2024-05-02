public class BrowserHistoryTest {
    public static void main(String[] args) {

        BrowserHistory browserHistory = new BrowserHistory();

        // Inserting browser history
        browserHistory.insertBrowserHistory("YouTube", "001A", "10.08.2023", "https://www.youtube.com/", false);
        browserHistory.insertBrowserHistory("GeeksforGeeks", "011B", "09.08.2023", "https://www.geeksforgeeks.org/", true);
        browserHistory.insertBrowserHistory("Tutorialspoint", "012C", "06.08.2023", "https://www.tutorialspoint.com/index.htm", true);
        browserHistory.insertBrowserHistory("Stackoverflow", "003D", "05.08.2023", "https://stackoverflow.com/", false);

        // Displaying browser history in normal order
        System.out.println("\nBrowser History in Normal Order:");
        browserHistory.displayBrowserHistory();

        // Displaying browser history in reverse order
        System.out.println("\nBrowser History in Reverse Order:");
        browserHistory.displayBrowserHistoryReverse();

        // Displaying only the bookmarked pages
        System.out.println("\nBookmarked Pages:");
        browserHistory.displayBookmarkedPages();

        // Removing the last node from the browser history
        browserHistory.popBrowserHistory();
    }
}
