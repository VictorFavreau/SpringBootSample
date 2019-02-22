package sample.service;

import java.util.List;
import java.util.UUID;

import sample.dto.ProfileDto;
import sample.exceptions.AbstractServiceException;

public interface ProfileService {

	public ProfileDto createRandom() throws AbstractServiceException;
	
	public List<ProfileDto> createArmy(Integer size) throws AbstractServiceException;
	
	public List<ProfileDto> getAll() throws AbstractServiceException;
}
