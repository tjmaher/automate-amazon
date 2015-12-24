package enums;

/**
 * Created by tmaher on 12/22/2015.
 */
public enum Products {
    HITCHHIKERS_GUIDE("0345391802", "The Hitchhiker's Guide to the Galaxy");

    // The price will always fluctuate. The product id and product title will be more or less constant.
    private String id;
    private String productTitle;

    Products(String id, String productTitle){
        this.id = id;
        this.productTitle = productTitle;
    }

    public String getProductId(){
        return id;
    }

    public String getProductTitle(){
        return productTitle;
    }
}
