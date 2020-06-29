package root.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import root.domain.Tim;

public interface TimDao extends JpaRepository<Tim, Long>{


}