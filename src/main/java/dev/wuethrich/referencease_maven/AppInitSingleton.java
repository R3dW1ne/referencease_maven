package dev.wuethrich.referencease_maven;

import dev.wuethrich.referencease_maven.entities.Role;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Startup
@Singleton
public class AppInitSingleton {

  @PersistenceContext
  private EntityManager entityManager;

  @PostConstruct
  public void init() {
    if (entityManager.find(Role.class, 1) == null){
      Role user = new Role("User");
      entityManager.persist(user);
    }
  }
}
