package App.Server;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  @Id
  private String id;
  private String firstName;
  private String lastName;
  private String username;
  private String email;
  private String password;
  private String address;
  private String mobileNumber;
  private String vehicleNumber;
  private ArrayList<String> bookings;
  private ArrayList<String> extraServices;
  private ArrayList<Integer> cost;

}
