package org.tsany.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Penjualan",schema ="public")
public Class Barang extends PanacheEntity {

@Column(name ="nama_barang",length =50,unique =true)
@JsonProperty("nama_barang")
 public String Namabarang;

@Column(name ="localdate",length =200)
@JsonProperty("localdate")
 public Integer Localdate;

@Column(name ="bigdecimal")
@JsonProperty("bigdecimal")
 public void bigdecimal;

}