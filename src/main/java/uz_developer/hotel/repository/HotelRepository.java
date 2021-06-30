package uz_developer.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz_developer.hotel.model.Hotel;

@RepositoryRestResource(path = "hotel",collectionResourceRel = "list")
public interface HotelRepository extends JpaRepository<Hotel,Integer> {


}
