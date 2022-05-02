import geb.Page

/**
 * The Geb page object for the Community page.
 */
class CommunityPage extends Page {
    static url = "https://www.qaware.de/wissen/"
    static at = { browser.title.contains("Vorträge – QAware") }
    static content = {
        headline { $("h3", 0) }
    }
}
