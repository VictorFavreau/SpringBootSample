package sample.dao;

import org.springframework.data.repository.CrudRepository;

import sample.models.Profile;

public interface ProfileDao extends CrudRepository<Profile, Integer> {

}
