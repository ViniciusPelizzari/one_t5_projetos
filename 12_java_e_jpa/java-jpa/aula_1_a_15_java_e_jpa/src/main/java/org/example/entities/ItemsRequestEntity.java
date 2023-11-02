package org.example.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "items_requests")
public class ItemsRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    private Integer amount;
    @ManyToOne(fetch = FetchType.LAZY)
    private RequestEntity requestEntity;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductEntity productEntity;

    public ItemsRequestEntity(){

    }

    public ItemsRequestEntity(Integer amount, RequestEntity requestEntity, ProductEntity productEntity) {
        this.amount = amount;
        this.requestEntity = requestEntity;
        this.unitPrice = (productEntity.getPrice());
        this.productEntity = productEntity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice.multiply(new BigDecimal(amount));
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public RequestEntity getRequestEntity() {
        return requestEntity;
    }

    public void setRequestEntity(RequestEntity requestEntity) {
        this.requestEntity = requestEntity;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    @Override
    public String toString() {
        return "ItemsRequestEntity{" +
                "id=" + id +
                ", unitPrice=" + unitPrice +
                ", amount=" + amount +
                ", requestEntity=" + requestEntity +
                ", productEntity=" + productEntity +
                '}';
    }
}
