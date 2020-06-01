package root.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import root.domain.Igrac;

public interface IgracDao extends JpaRepository<Igrac, Long>{
}
