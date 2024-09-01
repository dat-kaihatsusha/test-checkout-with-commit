package com.example.springtest1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "host", uniqueConstraints = {@UniqueConstraint(name = "host", columnNames = "id")})
public class Host {
  @Id
  @GeneratedValue
  @Column(name = "id", nullable = false)
  private long id;

  @Column(name = "name", length = 30, nullable = false)
  private String name;

  @Column(name = "phone_number", length = 15, nullable = true)
  private Integer phoneNumber;

  @Column(name = "address", length = 256, nullable = true)
  private String address;

  @Column(name = "description",length = 256, nullable = true)
  private String description;
}
