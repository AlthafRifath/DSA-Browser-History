public class BrowserHistory {
    private BrowserHistoryNode head;
    private BrowserHistoryNode tail;

    public BrowserHistory() {
        this.head = null;
        this.tail = null;
    }

    // Insert a new history node to the browser history
    public void insertBrowserHistory(String Page_Name, String Page_Id, String Date, String Site_URL, Boolean Bookmark) {
        BrowserHistoryNode newNode = new BrowserHistoryNode(Page_Name, Page_Id, Date, Site_URL, Bookmark);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.previous = this.tail;
            this.tail = newNode;
        }

    }

    // Delete a history node from the browser history
    public void deleteBrowserHistory(String Page_Id) {
        BrowserHistoryNode current = this.head;
        while (current != null) {
            if (current.Page_Id.equals(Page_Id)) {
                if (current == this.head) {
                    this.head = current.next;
                    this.head.previous = null;
                } else if (current == this.tail) {
                    this.tail = current.previous;
                    this.tail.next = null;
                } else {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
                break;
            }
            current = current.next;
        }
    }

    // popBrowserHistory() method to remove the last node from the browser history
    public void popBrowserHistory() {
        if (this.tail != null) {
            if (this.tail.previous != null) {
                this.tail = this.tail.previous;
                this.tail.next = null;
            } else {
                this.head = null;
                this.tail = null;
            }
        }else {
            System.out.println("\nBrowser History is empty");
        }
    }

    // Display the browser history in normal order
    public void displayBrowserHistory() {
        BrowserHistoryNode current = this.head;
        while (current != null) {
            System.out.println("Page Name: " + current.Page_Name);
            System.out.println("Page Id: " + current.Page_Id);
            System.out.println("Date: " + current.Date);
            System.out.println("Site URL: " + current.Site_URL);
            System.out.println("Bookmark: " + current.Bookmark);
            System.out.println();
            current = current.next;
        }
    }

    // Display the browser history in reverse order
    public void displayBrowserHistoryReverse() {
        BrowserHistoryNode current = this.tail;
        while (current != null) {
            System.out.println("Page Name: " + current.Page_Name);
            System.out.println("Page Id: " + current.Page_Id);
            System.out.println("Date: " + current.Date);
            System.out.println("Site URL: " + current.Site_URL);
            System.out.println("Bookmark: " + current.Bookmark);
            System.out.println();
            current = current.previous;
        }
    }

    // Display only the bookmarked pages in the browser history
    public void displayBookmarkedPages() {
        BrowserHistoryNode current = this.head;
        while (current != null) {
            if (current.Bookmark) {
                System.out.println("Page Name: " + current.Page_Name);
                System.out.println("Page Id: " + current.Page_Id);
                System.out.println("Date: " + current.Date);
                System.out.println("Site URL: " + current.Site_URL);
                System.out.println("Bookmark: " + current.Bookmark);
                System.out.println();
            }
            current = current.next;
        }
    }
}
