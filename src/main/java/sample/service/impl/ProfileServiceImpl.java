package sample.service.impl;

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

import sample.dao.ProfileDao;
import sample.dto.ProfileDto;
import sample.exceptions.AbstractServiceException;
import sample.models.Profile;
import sample.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileDao profileDao;
	
	@Override
	public ProfileDto createRandom() throws AbstractServiceException {
		
		Faker faker = new Faker(new Locale("fr"));
		
		String login = faker.name().username();
		String email = login + "@sample.com";
		
		Profile profile = new Profile();
		profile.setLogin(login);
		profile.setEmail(email);
		
		profileDao.save(profile);
				
		return new ProfileDto(profile);
	}

	@Override
	public List<ProfileDto> createArmy(Integer size) throws AbstractServiceException {
		
		List<ProfileDto> army = new ArrayList<>();
		
		if(size == null) size = 10;
		if(size > 100) size = 100;
		
		for(int cpt = 1; cpt <= size; cpt++) {
			army.add(createRandom());
		}
		
		return army;
	}

	@Override
	public List<ProfileDto> getAll() throws AbstractServiceException {
		
		List<Profile> profiles = (List<Profile>) profileDao.findAll();
		
        List<ProfileDto> profileDtos = new ArrayList();
        profiles.stream().filter((profile) -> (profile != null)).forEachOrdered((profile) -> {
            profileDtos.add(new ProfileDto(profile));
        });
		
		return profileDtos;
	}
	
}
