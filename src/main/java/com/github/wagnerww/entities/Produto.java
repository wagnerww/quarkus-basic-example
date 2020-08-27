package com.github.wagnerww.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.hibernate.annotations.CreationTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "PRODUTO")
public class Produto extends PanacheEntity {

  public String nome;

  public BigDecimal valor;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  public Date dataCriacao;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  public Date dataAtualizacao;


}
