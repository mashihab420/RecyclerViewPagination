package com.datasysbd.recyclerviewpagination;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelData {

   private String name,image;

    public String getName() {
        return name;
    }

    public ModelData setName(String name) {
        this.name = name;
        return this;
    }

    public String getImage() {
        return image;
    }

    public ModelData setImage(String image) {
        this.image = image;
        return this;
    }

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("p_name")
    @Expose
    private String pName;
    @SerializedName("p_price")
    @Expose
    private String pPrice;
    @SerializedName("p_description")
    @Expose
    private Object pDescription;
    @SerializedName("offers")
    @Expose
    private String offers;
    @SerializedName("shop_name")
    @Expose
    private String shopName;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("ad_cost")
    @Expose
    private String adCost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpPrice() {
        return pPrice;
    }

    public void setpPrice(String pPrice) {
        this.pPrice = pPrice;
    }

    public Object getpDescription() {
        return pDescription;
    }

    public void setpDescription(Object pDescription) {
        this.pDescription = pDescription;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdCost() {
        return adCost;
    }

    public void setAdCost(String adCost) {
        this.adCost = adCost;
    }

}
