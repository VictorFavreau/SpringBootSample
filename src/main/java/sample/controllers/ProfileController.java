package sample.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sample.dto.ProfileDto;
import sample.exceptions.AbstractServiceException;
import sample.service.ProfileService;
import sample.utils.Result;

@RestController
@RequestMapping("/profile")
public class ProfileController {

	@Autowired
    private ProfileService profileService;

    @RequestMapping(value="getRandom", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Result<ProfileDto> getRandom() throws AbstractServiceException {
    	
        return Result.createSuccess(profileService.createRandom());
    }
    
    @RequestMapping(value="getArmy", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Result<Collection<ProfileDto>> getArmy(
            @RequestParam(required = false) Integer size
            ) throws AbstractServiceException {
    	
        return Result.createSuccess(profileService.createArmy(size));
    }
    
    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Result<Collection<ProfileDto>> getAll() throws AbstractServiceException {
        
        return Result.createSuccess(profileService.getAll());
    }
    
	
}
