package org.example.vo;

import java.time.LocalDate;

public class ReportSalesVo {

    private String productName;
    private Long amount;
    private LocalDate dateLastSale;

    public ReportSalesVo(){

    }

    public ReportSalesVo(String productName, Long amount, LocalDate dateLastSale) {
        this.productName = productName;
        this.amount = amount;
        this.dateLastSale = dateLastSale;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public LocalDate getDateLastSale() {
        return dateLastSale;
    }

    public void setDateLastSale(LocalDate dateLastSale) {
        this.dateLastSale = dateLastSale;
    }

    @Override
    public String toString() {
        return "ReportSalesVo{" +
                "productName='" + productName + '\'' +
                ", amount=" + amount +
                ", dateLastSale=" + dateLastSale +
                '}';
    }
}
