public class BrowserHistoryNode {
    String Page_Name;
    String Page_Id;
    String Date;
    String Site_URL;
    Boolean Bookmark;
    BrowserHistoryNode next;
    BrowserHistoryNode previous;

    public BrowserHistoryNode(String Page_Name, String Page_Id, String Date, String Site_URL, Boolean Bookmark) {
        this.Page_Name = Page_Name;
        this.Page_Id = Page_Id;
        this.Date = Date;
        this.Site_URL = Site_URL;
        this.Bookmark = Bookmark;
        this.next = null;
        this.previous = null;
    }
}
