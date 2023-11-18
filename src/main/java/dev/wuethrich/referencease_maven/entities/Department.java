package dev.wuethrich.referencease_maven.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Department")
public class Department {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int departmentId;

  @Column(unique = true)
  private String departmentName;

  // Getter, Setter, hashCode, equals und toString Methoden
}

