package org.fun.eva.ws.service;

import java.util.List;

import org.fun.eva.ws.shared.dto.AddressDTO;

public interface AddressService {
	List<AddressDTO> getAddresses(String userId);
    AddressDTO getAddress(String addressId);
}
