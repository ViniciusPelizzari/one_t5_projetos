package org.example.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "requests")
public class RequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateSale;
    @ManyToOne(fetch = FetchType.LAZY) /*padrão/boa prática - para não ser carregado automaticamente*/
    private PeopleEntity peopleEntity;

    /*LAZY - carregamento preguiçoso - carrega apenas se for requisitado*/
    /*EAGER - carregamento ansioso - carrega junto com os itens*/

    @OneToMany(mappedBy = "requestEntity", cascade = CascadeType.ALL)
    /*MAPPEDBY - para fazer o relacionamento entre outra tabela - relacionamento bidirecional e indicar qual a tabela referente*/
    /*CASCADE - efeito cascata - tudo que acontecer com o pedido acontecerá com o item pedido. ex: se for excluído...*/
    private List<ItemsRequestEntity> productEntities = new ArrayList<>();
    @Column(name = "total_salue_value")
    private BigDecimal totalSaleValue = BigDecimal.ZERO; /*inicializando o valor total como zero*/

    public RequestEntity(){

    }

    public RequestEntity(PeopleEntity peopleEntity) {
        this.peopleEntity = peopleEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateSale() {
        return dateSale;
    }

    public void setDateSale(LocalDate dateSale) {
        this.dateSale = dateSale;
    }

    public PeopleEntity getPeopleEntity() {
        return peopleEntity;
    }

    public void setPeopleEntity(PeopleEntity peopleEntity) {
        this.peopleEntity = peopleEntity;
    }

    public List<ItemsRequestEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(List<ItemsRequestEntity> productEntities) {
        this.productEntities = productEntities;
    }

    public BigDecimal getTotalSaleValue() {
        return totalSaleValue;
    }

    public void setTotalSaleValue(BigDecimal totalSaleValue) {
        this.totalSaleValue = totalSaleValue;
    }

    public void addItems(ItemsRequestEntity itemsRequestEntity){ /*vinculando os dois lados do relacionamento - o item conhece o pedido e o pedido conhece o item*/
        itemsRequestEntity.setRequestEntity(this);
        this.productEntities.add(itemsRequestEntity);
        this.totalSaleValue = this.totalSaleValue.add(itemsRequestEntity.getUnitPrice());
    }

    @Override
    public String toString() {
        return "requestEntity{" +
                "id=" + id +
                ", dataSale=" + dateSale +
                ", peopleEntity=" + peopleEntity +
                ", productEntities=" + productEntities +
                ", totalSaleValue=" + totalSaleValue +
                '}';
    }
}
