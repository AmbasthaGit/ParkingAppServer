package App.Server;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Worker {
  @Id
  private String id;
  private String name;
  private double rating;
  private int numOfRatings;
  private int workingSince;
  private String space;

}
