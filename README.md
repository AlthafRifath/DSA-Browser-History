# Browser History Manager

The Browser History Manager is a Java-based application that demonstrates the use of a doubly linked list to manage a browser's history. It supports operations like adding new entries to the history, displaying the history in reverse order, and filtering to show only bookmarked sites.

## Features

- **Insert History Entries**: Add new browsing history records with details such as page name, page ID, date, site URL, and bookmark status.
- **Display History in Reverse**: View your browsing history in reverse chronological order, making it easy to see the most recent sites visited.
- **Filter for Bookmarked Sites**: Quickly access your bookmarked sites by filtering out non-bookmarked entries.

## Getting Started

### Prerequisites

To run this application, you'll need:

- Java Development Kit (JDK) 8 or newer installed on your machine.

### Running the Application

1. Clone the repository to your local machine.
2. Navigate to the directory where the project is saved.
3. Compile the `BrowserHistory.java` file using the Java compiler:
4. Run the compiled class:

## Usage

To use the application, instantiate a `BrowserHistory` object in your Java program. Here's an example on how to interact with it:

```java
public class BrowserHistoryTest {
    public static void main(String[] args) {

        BrowserHistory browserHistory = new BrowserHistory();

        // Inserting browser history
        browserHistory.insertBrowserHistory("YouTube", "001A", "10.08.2023", "https://www.youtube.com/", false);
        browserHistory.insertBrowserHistory("GeeksforGeeks", "011B", "09.08.2023", "https://www.geeksforgeeks.org/", true);
        browserHistory.insertBrowserHistory("Tutorialspoint", "012C", "06.08.2023", "https://www.tutorialspoint.com/index.htm", true);
        browserHistory.insertBrowserHistory("Stackoverflow", "003D", "05.08.2023", "https://stackoverflow.com/", false);

        // Displaying browser history in normal order
        System.out.println("Browser History in Normal Order:");
        browserHistory.displayBrowserHistory();

        // Displaying browser history in reverse order
        System.out.println("\nBrowser History in Reverse Order:");
        browserHistory.displayBrowserHistoryReverse();

        // Displaying only the bookmarked pages
        System.out.println("\nBookmarked Pages:");
        browserHistory.displayBookmarkedPages();
    }
}

