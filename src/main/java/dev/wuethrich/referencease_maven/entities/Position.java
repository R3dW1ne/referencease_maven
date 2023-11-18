package dev.wuethrich.referencease_maven.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Position")
public class Position {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int positionId;

  @Column(unique = true)
  private String positionName;

  @ManyToOne
  @JoinColumn(name = "departmentId")
  private Department department;

  // Getter, Setter, hashCode, equals und toString Methoden
}
