package app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    private int id;
    @NotNull(message = "First Name Should Not Be Null")
    @Size(min = 4,max = 20,message = "First name should have min 4 and max 20 characters")
    private String firstName;
    @NotNull(message = "First Name Should Not Be Null")
    @Size(min = 4,max = 20,message = "First name should have min 4 and max 20 characters")
    private String lastName;
    @NotNull(message = "Dob Should not be null")
    private String dob;

    private long contact;

    private long alternativeContact;
    @NotNull(message = "Email Should Not Be Null")
    @Size(min = 4,max = 20,message = "Email  should have min 4 and max 20 characters")
    private String email;
    @NotNull(message = "Alter Email Should Not Be Null")
    @Size(min = 6,max = 20,message = "Alter Email  should have min 6 and max 20 characters")
    private String alterEmail;
    @NotNull(message = "Password Should Not Be Null")
    @Size(min = 4,max = 20,message = "Password  should have min 4 and max 20 characters")
    private String password;
    @NotNull(message = "Confirm password Should Not Be Null")
    @Size(min = 3,max = 25,message = "Confirm password should have min 3 and max 25 characters")
    private String confirmPassword;
    @NotNull(message = "Place  Should Not Be Null")
    @Size(min = 4,max = 20,message = "Place  should have min 3 and max 20 characters")
    private String place;
    @NotNull(message = "State  Should Not Be Null")
    @Size(min = 3,max = 10,message = "State should have min 2 and max 10 characters")
    private String state;
    @NotNull(message = "Place  Should Not Be Null")
    @Size(min = 5,max = 25,message = "Place  should have min 3 and max 25 characters")
    private String district;
    private String createdBy;
    private LocalDate createdDate;
    private String updatedBy;
    private LocalDate updatedDate;


}
