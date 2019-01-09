package ci.atos.projet.trainning.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.atos.projet.trainning.commission.entities.Service;



public interface IServiceRepository extends JpaRepository<Service, Integer>{

}
