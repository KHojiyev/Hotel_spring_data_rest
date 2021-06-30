package uz_developer.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz_developer.hotel.model.Room;

@RepositoryRestResource(path = "room",collectionResourceRel = "list")
public interface RoomRepository extends JpaRepository<Room,Integer> {


}
