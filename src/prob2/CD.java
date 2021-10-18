package prob2;

public class CD extends LendingItem{
	
	private String productId;
	private String title;
	private String company;

    public CD(String productId, String title, String company) {
        this.productId = productId;
        this.title = title;
        this.company = company;
    }

    public String getProductId() {
        return productId;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) return false;
        if (!obj.getClass().getSimpleName().equals("CD")) return false;
        else {
            CD cd = (CD) obj;
            if(cd.getProductId().equals(productId))
                return true;
        }
    return false;

    }


}
