package dev.wuethrich.referencease_maven.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Data
@Table(name = "AuditLog")
public class AuditLog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int logId;

  private String action;
  private LocalDateTime timestamp;

  @Lob
  private String description;

  @ManyToOne
  @JoinColumn(name = "userId")
  private UserAccount userAccount;

  // Getter, Setter, hashCode, equals und toString Methoden
}
