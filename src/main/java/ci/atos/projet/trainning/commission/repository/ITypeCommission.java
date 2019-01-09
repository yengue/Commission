package ci.atos.projet.trainning.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.atos.projet.trainning.commission.entities.Commission;

public interface ITypeCommission extends JpaRepository<Commission, Integer>{

}
