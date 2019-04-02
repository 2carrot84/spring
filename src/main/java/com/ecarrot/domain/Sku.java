package com.ecarrot.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="sku")
public class Sku {
    private String strCode;
    private String skuCode;
    private String gCode;
    private String mCode;
    private Long amt;
    private Long qty;

    public String getStrCode() {
        return strCode;
    }

    public void setStrCode(String strCode) {
        this.strCode = strCode;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getGCode() {
        return gCode;
    }

    public void setGCode(String gCode) {
        this.gCode = gCode;
    }

    public String getMCode() {
        return mCode;
    }

    public void setMCode(String mCode) {
        this.mCode = mCode;
    }

    public Long getAmt() {
        return amt;
    }

    public void setAmt(Long amt) {
        this.amt = amt;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "sku : { \n" +
                "    \"strCode\" : " + strCode + ", \n" +
                "    \"skuCode\" : " + skuCode + ", \n" +
                "    \"gCode\" : " + gCode + ", \n" +
                "    \"mCode\" : " + mCode + ", \n" +
                "    \"amt\" : " + amt +", \n" +
                "    \"qty\" : " + qty + "\n" +
                "}\n";
    }
}
