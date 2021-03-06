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
public class Space {
  @Id
  private String id;
  private int spaceNumber;
  private String worker;
  private ArrayList<String> bookings;
  
}
