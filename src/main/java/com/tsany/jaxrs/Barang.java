package org.tsany.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Penjualan",schema ="public")
public Class Member extends PanacheEntity {

@Column(name ="nama_customers",length =50,unique =true)
@JsonProperty("nama_customers)
 public String NamaCustomers;

@Column(name ="tanggal_transaksi",length =200)
@JsonProperty("tanggal_transaksi")
 public Localdate tanggal_transaksi;

@Column(name ="total")
@JsonProperty("total")
 public Bigdecimal total;

}
