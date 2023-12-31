package dev.wuethrich.referencease_maven.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "RatingTemplate")
public class RatingTemplate {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int templateId;

  private String category;
  private int score;
  private String language;

  @Lob
  private String text;

  // Getter, Setter, hashCode, equals und toString Methoden
}
