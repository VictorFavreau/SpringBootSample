package sample.dto;

import java.util.UUID;

import sample.models.Profile;

public class ProfileDto {

	private final UUID uuid;
	private final String login;
	private final String email;
	
	public ProfileDto() {
		this.uuid = null;
		this.login = null;
		this.email = null;
	}
	
	public ProfileDto(UUID uuid, String login, String email) {
		this.uuid = uuid;
		this.login = login;
		this.email = email;
	}
	
	public ProfileDto(Profile profile) {
		this.uuid = profile.getUuid();
		this.login = profile.getLogin();
		this.email = profile.getEmail();
	}

	public UUID getUuid() {
		return uuid;
	}

	public String getLogin() {
		return login;
	}

	public String getEmail() {
		return email;
	}	
}
