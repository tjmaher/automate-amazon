package pojo;

import org.testng.TestException;
import pages.ProductPage;

/**
 * Created by tmaher on 12/22/2015.
 */
public class Book {
    private String productTitle = "";
    private String author = "";
    private String offerPrice = "";
    private String edition = "";

    public Book(){
    }

    @Override
    public String toString(){
        return String.format(
                "Product Title:  " + this.productTitle + "\n"
                + "Author: " + this.author + "\n"
                + "Edition:  " + this.edition + "\n"
                + "Offer Price:  " + this.offerPrice + "\n"
        );
    }

    public void loadInfoFromProductPage(){
        ProductPage productPage = new ProductPage();
        String currentURL = productPage.getCurrentURL();

        if (!currentURL.contains("product")){
            throw new TestException("LOAD INFO ERROR: Product data should only be loaded from product page!\nCurrent URL: " + currentURL);
        } else {
            System.out.println("LOAD_INFO: Loading data...\n");
            this.productTitle = productPage.getProductTitle();
            this.author = productPage.getAuthor();
            this.offerPrice = productPage.getPrice();
            this.edition = productPage.getEdition();
        }
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(String offerPrice) {
        this.offerPrice = offerPrice;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

}
