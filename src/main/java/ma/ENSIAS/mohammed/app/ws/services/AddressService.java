package ma.ENSIAS.mohammed.app.ws.services;

import java.util.List;

import ma.ENSIAS.mohammed.app.ws.shared.dto.AddressDto;

public interface AddressService {

	List<AddressDto> getAllAddresses(String email);
	
	AddressDto createAddress(AddressDto address, String email);
	
    AddressDto getAddress(String addressId);
	
	void deleteAddress(String addressId);
}
