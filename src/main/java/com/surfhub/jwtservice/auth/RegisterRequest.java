package com.surfhub.jwtservice.auth;

import com.surfhub.jwtservice.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

  private String name;
  private String lastname;
  private String telephone;
  private String email;
  private String password;
  private String address;
  private String city;
  private Date register_date;
  private Role role;
  private String status;

}
