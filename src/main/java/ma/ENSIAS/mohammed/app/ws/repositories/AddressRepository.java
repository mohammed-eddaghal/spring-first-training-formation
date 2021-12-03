package ma.ENSIAS.mohammed.app.ws.repositories;

import java.util.List;

import ma.ENSIAS.mohammed.app.ws.entities.AddressEntity;
import ma.ENSIAS.mohammed.app.ws.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
    
	List<AddressEntity> findByUser(UserEntity currentUser);
	
	AddressEntity findByAddressId(String addressId);
}
