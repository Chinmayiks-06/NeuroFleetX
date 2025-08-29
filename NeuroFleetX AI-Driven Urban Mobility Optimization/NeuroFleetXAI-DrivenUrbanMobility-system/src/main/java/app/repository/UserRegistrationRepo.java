package app.repository;


import app.entity.UserRegistrationEntity;

public interface UserRegistrationRepo {
    boolean save(UserRegistrationEntity userRegistration);
    UserRegistrationEntity getEntityByEmail(String email);
    boolean updatePasswordByEmail(String email,String password,String confirmPassword );

    boolean updateProfile(UserRegistrationEntity userRegistration);


}
