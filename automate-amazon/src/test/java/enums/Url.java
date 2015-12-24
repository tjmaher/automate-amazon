package enums;

/**
 * Created by tmaher on 12/22/2015.
 */
public enum Url {
    PRODUCT_SECTION("/gp/product"),
    BASEURL("http://www.amazon.com"),
    SIGNOUT("/gp/flex/sign-out.html");

    String url;

    Url(String url){
        this.url = url;
    }

    public String getURL() {
        return url;
    }
}
