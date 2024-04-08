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
public class Main {
 public static void main(String[] args) {
     BrowserHistory history = new BrowserHistory();

     // Inserting history entries
     history.insertHistory("Google", "001", "2024-04-07", "https://www.google.com", false);
     history.insertHistory("GitHub", "002", "2024-04-08", "https://www.github.com", true);

     // Display the history in reverse
     history.displayHistoryReverse();

     // Display only bookmarked sites
     history.displayBookmarkedSites();
 }
}
